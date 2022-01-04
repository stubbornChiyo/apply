package com.claim.apply.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.claim.apply.entity.*;
import lombok.Data;

import java.util.List;

/**
 * @author rui.chi
 * @version 1.0
 * @Description
 * @date 2021/12/29 13:32
 */
@Data
public class CoordinateDetailDTO {
    // base info
    public CoordinateInfo coordinateInfo;
    //参统人信息
    public CoordinatePerson participantInfo;
    //代理签署人信息
    public CoordinatePerson proxySigner;
    //车辆信息
    public CoordinateCar carInfo;
    //商业统筹清单
    public List<CoordinateProjectDetail> coordinateProjects ;
    //统筹单发票
    public CoordinateBill bill;


}
