package com.claim.apply.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.claim.apply.entity.CoordinateInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.claim.apply.entity.Pager;
import com.claim.apply.entity.dto.CoordinateDetailDTO;
import com.claim.apply.entity.dto.CoordinateSearchDTO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author chirui
 * @since 2021-12-29
 */
public interface CoordinateInfoService extends IService<CoordinateInfo> {
    void addCoordinate(CoordinateDetailDTO coordinateDetailDTO);

    IPage<CoordinateInfo> search(CoordinateSearchDTO coordinateSearchDTO);

    CoordinateDetailDTO getDetail(CoordinateSearchDTO coordinateSearchDTO);


}
