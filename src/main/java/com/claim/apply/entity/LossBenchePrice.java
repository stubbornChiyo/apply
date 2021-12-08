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
 * 定损部分
 * </p>
 *
 * @author chirui
 * @since 2021-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LossBenchePrice extends Model<LossBenchePrice> {

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
     * 统筹种类
     */
    private String overallType;

    /**
     * 名称
     */
    private String name;

    /**
     * 价格方案
     */
    private String priceType;

    /**
     * 价格
     */
    private String price;

    /**
     * 数量
     */
    private String number;

    /**
     * 金额
     */
    private String amount;

    /**
     * 操作员
     */
    private String operateUser;

    /**
     * 定损类型 0 本车 1 三者车 2 财务定损 3 人伤核损
     */
    private String lossType;

    /**
     * 类型 0 配件部分 1 工时部分 2 财务部分
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
