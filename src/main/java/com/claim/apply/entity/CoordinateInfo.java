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
public class CoordinateInfo extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 系统id 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 统筹单号
     */
    private String orderNumber;

    /**
     * 机构
     */
    private String mechanism;

    /**
     * 单位
     */
    private String unit;

    /**
     * 支付方式
     */
    private String payment;

    /**
     * 支付日期
     */
    @TableField("paymentDate")
    private String paymentDate;

    /**
     * 代理人
     */
    private String agent;

    /**
     * 起统日
     */
    @TableField("startingDay")
    private String startingDay;

    /**
     * 到期日
     */
    @TableField("endDay")
    private String endDay;

    /**
     * 制单人
     */
    @TableField("preparedBy")
    private String preparedBy;

    /**
     * 经办单位
     */
    @TableField("dealingUnit")
    private String dealingUnit;

    /**
     * 争议解决方法
     */
    @TableField("disputeResolution")
    private String disputeResolution;

    /**
     * 备注、特别约定
     */
    private String remark;

    /**
     * 是否需要上传验车照
     */
    @TableField("needUpload")
    private String needUpload;

    /**
     * 是否已经上传验车照
     */
    @TableField("hasUpload")
    private String hasUpload;

    /**
     * 参统人ID
     */
    @TableField("participantId")
    private String participantId;

    /**
     * 代理签署人ID
     */
    @TableField("proxySignerId")
    private String proxySignerId;

    /**
     * 标准统筹费
     */
    @TableField("standardFee")
    private String standardFee;

    /**
     * 折扣
     */
    private String discount;

    /**
     * 应缴
     */
    private String payable;

    /**
     * 实收
     */
    private String paid;

    /**
     * 返点比率
     */
    private String rate;

    /**
     * 车牌号
     */
    private String carNum;

    /**
     * 资料地址
     */
    private String dataUrl;

    /**
     * 资料描述
     */
    private String dataDesc;


}
