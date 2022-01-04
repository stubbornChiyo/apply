package com.claim.apply.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.claim.apply.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chirui
 * @since 2021-12-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CoordinateCar extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 系统id 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 车牌号
     */
    @TableField("carNumber")
    private String carNumber;

    /**
     * 车架号
     */
    @TableField("frameNumber")
    private String frameNumber;

    /**
     * 厂牌型号
     */
    @TableField("brandModel")
    private String brandModel;

    /**
     * 发动机号
     */
    @TableField("engineNumber")
    private String engineNumber;

    /**
     * 车辆性质
     */
    private String nature;

    /**
     * 核定质量
     */
    private String quality;

    /**
     * 核定人数
     */
    @TableField("numberOfPeople")
    private String numberOfPeople;

    /**
     * 价格
     */
    private String price;

    /**
     * 登记日期
     */
    @TableField("registrationDate")
    private String registrationDate;

    /**
     * 车主姓名
     */
    @TableField("ownerName")
    private String ownerName;

    /**
     * 转移日期
     */
    @TableField("transferDate")
    private String transferDate;

    /**
     * 是否过户
     */
    @TableField("transferFlag")
    private String transferFlag;


}
