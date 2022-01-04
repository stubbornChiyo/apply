package com.claim.apply.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.claim.apply.entity.*;
import com.claim.apply.entity.dto.CoordinateDetailDTO;
import com.claim.apply.entity.dto.CoordinateSearchDTO;
import com.claim.apply.mapper.*;
import com.claim.apply.service.CoordinateInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chirui
 * @since 2021-12-29
 */
@Service
public class CoordinateInfoServiceImpl extends ServiceImpl<CoordinateInfoMapper, CoordinateInfo> implements CoordinateInfoService {

    @Resource
    CoordinateBillMapper coordinateBillMapper;
    @Resource
    CoordinateCarMapper coordinateCarMapper;
    @Resource
    CoordinateInfoMapper coordinateInfoMapper;
    @Resource
    CoordinatePersonMapper coordinatePersonMapper;
    @Resource
    CoordinateProjectDetailMapper coordinateProjectDetailMapper;

    @Override
    public void addCoordinate(CoordinateDetailDTO coordinateDetailDTO) {
        //插入 - 参统人
        CoordinatePerson participantInfo = coordinateDetailDTO.getParticipantInfo();
        if (participantInfo != null) {
            participantInfo.setType("0");
            participantInfo.setUserId(String.valueOf(IdUtil.createSnowflake(1L, 1L).nextId()));
            coordinatePersonMapper.insert(participantInfo);
        }
        //插入 - 代理签署人
        CoordinatePerson proxySigner = coordinateDetailDTO.getProxySigner();
        if (proxySigner != null) {
            proxySigner.setType("1");
            proxySigner.setUserId(String.valueOf(IdUtil.createSnowflake(1L, 1L).nextId()));
            coordinatePersonMapper.insert(proxySigner);
        }
        //插入 - 车辆信息
        CoordinateCar carInfo = coordinateDetailDTO.getCarInfo();
        if (carInfo != null) {
            coordinateCarMapper.insert(carInfo);
        }

        //插入 - 统筹信息表
        //需要设置参统人ID - 代理签署人ID - 车牌号
        CoordinateInfo coordinateInfo = coordinateDetailDTO.getCoordinateInfo();
        coordinateInfo.setParticipantId(participantInfo.getUserId());
        coordinateInfo.setProxySignerId(proxySigner.getUserId());
        coordinateInfo.setCarNum(carInfo.getCarNumber());
        coordinateInfoMapper.insert(coordinateInfo);

        //插入 - 统筹订单明细
        List<CoordinateProjectDetail> coordinateProjects =  coordinateDetailDTO.getCoordinateProjects();
        if ( coordinateProjects != null && coordinateProjects.size() > 0 ) {
            coordinateProjects.forEach(a->{
                //设置统筹单号
                a.setOrderNumber(coordinateInfo.getOrderNumber());
                coordinateProjectDetailMapper.insert(a);
            });
        }
        //插入 - 发票信息
        CoordinateBill bill = coordinateDetailDTO.getBill();
        if (bill != null) {
            bill.setOrderNumber(coordinateInfo.getOrderNumber());
            coordinateBillMapper.insert(bill);
        }

    }

    @Override
    public IPage<CoordinateInfo> search(CoordinateSearchDTO coordinateSearchDTO) {
        IPage<CoordinateInfo> page = new Page<>(coordinateSearchDTO.getPage(), coordinateSearchDTO.getSize());
        return coordinateInfoMapper.selectPage(page, null);

    }

    //根据统筹单号获取 - 详情
    @Override
    public CoordinateDetailDTO getDetail(CoordinateSearchDTO coordinateSearchDTO) {
        QueryWrapper<CoordinateInfo> qw = new QueryWrapper<>();
         qw.eq("orderNumber", coordinateSearchDTO.getCoordinateId());

        CoordinateInfo coordinateInfo = coordinateInfoMapper.selectOne(qw);
        if (coordinateInfo == null ) {
            return null;
        }
        //包装
        CoordinateDetailDTO coordinateDetailDTO = new CoordinateDetailDTO();
        coordinateDetailDTO.setCoordinateInfo(coordinateInfo);
        //查询 - 参统人
        QueryWrapper<CoordinatePerson> cpQw = new QueryWrapper<>();
        cpQw.eq("type",0);
        cpQw.eq("userId",coordinateInfo.getParticipantId());

        coordinateDetailDTO.setParticipantInfo(coordinatePersonMapper.selectOne(cpQw));
        //查询 - 代理签署人
        QueryWrapper<CoordinatePerson> cpPs = new QueryWrapper<>();
        cpPs.eq("type",1);
        cpPs.eq("userId",coordinateInfo.getProxySignerId());

        coordinateDetailDTO.setProxySigner(coordinatePersonMapper.selectOne(cpPs));
        //查询 - 车辆信息
        QueryWrapper<CoordinateCar> cc = new QueryWrapper<>();
        cc.eq("carNumber",coordinateInfo.getCarNum());

        coordinateDetailDTO.setCarInfo(coordinateCarMapper.selectOne(cc));
        //查询 - 统筹订单明细
        QueryWrapper<CoordinateProjectDetail> cpd = new QueryWrapper<>();
        cc.eq("orderNumber",coordinateInfo.getOrderNumber());
        coordinateDetailDTO.setCoordinateProjects(coordinateProjectDetailMapper.selectList(cpd));

        //查询 - 发票信息
        QueryWrapper<CoordinateBill> cbQW = new QueryWrapper<>();
        cc.eq("orderNumber",coordinateInfo.getOrderNumber());

        coordinateDetailDTO.setBill(coordinateBillMapper.selectOne(cbQW));

        return coordinateDetailDTO;
    }


}
