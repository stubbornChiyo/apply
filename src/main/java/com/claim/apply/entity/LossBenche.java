package com.claim.apply.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 车辆定损表
 * </p>
 *
 * @author chirui
 * @since 2021-12-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LossBenche extends Model<LossBenche> {

    private static final long serialVersionUID=1L;

    /**
     * 系统id 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 报案号
     */
    private String reportNumber;

    /**
     * 车牌号
     */
    private String carPlateNumber;

    /**
     * 车辆品牌
     */
    private String carBrand;

    /**
     * 车辆型号
     */
    private String factoryPlateModel;

    /**
     * 车辆款式
     */
    private String carStyle;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 发动机号
     */
    private String engineNumber;

    /**
     * 排量
     */
    private String displacement;

    /**
     * 驾驶员
     */
    private String ownerName;

    /**
     * 驾驶员性别
     */
    private String driverSex;

    /**
     * 联系电话
     */
    private String driverMobile;

    /**
     * 车辆类型 0 本车 1 三者车
     */
    private String type;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
