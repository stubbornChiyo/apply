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
public class CoordinateBill extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 系统id 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 开票类别
     */
    private String category;

    /**
     * 开票类型
     */
    private String type;

    /**
     * 购买方名称
     */
    @TableField("buyerNname")
    private String buyerNname;

    /**
     * 证件类型
     */
    @TableField("cardType")
    private String cardType;

    /**
     * 证件号码
     */
    @TableField("cardNo")
    private String cardNo;

    /**
     * 纳税人识别码
     */
    @TableField("taxpayerCode")
    private String taxpayerCode;

    /**
     * 开户行
     */
    @TableField("accountBank")
    private String accountBank;

    /**
     * 对公账号
     */
    @TableField("publicAccount")
    private String publicAccount;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;

    /**
     * 备注
     */
    private String remark;

    /**
     * 金额
     */
    private String account;

    /**
     * 邮寄地址
     */
    @TableField("mailingAddress")
    private String mailingAddress;

    /**
     * 收件人姓名
     */
    @TableField("recipientName")
    private String recipientName;

    /**
     * 收件人电话
     */
    @TableField("recipientPhone")
    private String recipientPhone;

    /**
     * 统筹单号
     */
    private String orderNumber;


}
