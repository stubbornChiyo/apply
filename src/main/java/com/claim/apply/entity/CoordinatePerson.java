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
public class CoordinatePerson extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 系统id 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("userId")
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机
     */
    private String phone;

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
     * 居住地
     */
    private String place;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 参统人是被统筹人的
     */
    private String relation;

    /**
     * 类型 0 参统人 1 代理签署人
     */
    private String type;


}
