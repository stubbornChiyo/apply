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
public class CoordinateProjectDetail extends BaseEntity {

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
     * 统筹项目
     */
    private String projectName;

    /**
     * 统筹额度
     */
    private String quota;

    /**
     * 标准费用
     */
    @TableField("standardFee")
    private String standardFee;

    /**
     * 折扣率
     */
    @TableField("discountRate")
    private String discountRate;

    /**
     * 应缴统筹费
     */
    private String payable;

    /**
     * 座位数
     */
    private String seats;

    /**
     * 玻璃
     */
    private String grass;

    /**
     * 特殊材质
     */
    @TableField("grassSpecial")
    private String grassSpecial;


}
