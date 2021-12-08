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
 * 报案信息表
 * </p>
 *
 * @author chirui
 * @since 2021-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ClaimApply extends Model<ClaimApply> {

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
    private String carNumber;

    /**
     * 被统筹人
     */
    private String coordinatorName;

    /**
     * 案件状态 1 正常 2 撤案 3 预付案件 4 通融赔付 5 预估案件 6 拒赔 7 注销 8 分段赔付 9 结案
     */
    private String caseStatus;

    /**
     * 案件进展 1 未查勘案件 2 案件已查勘 3 案件被核价退回 4 案件被理算退回 5 已提交核价 6 案件已提交理算 7  案件已退回至理算 8 案件已提交经理 9 案件已提交总经理 10 案件已提交财务 11 理赔完毕
     */
    private String applyState;

    /**
     * 承统机构
     */
    private String undertakingAgency;

    /**
     * 统筹单位
     */
    private String coordinatingUnit;

    /**
     * 出险时间
     */
    private LocalDateTime insuranceTime;

    /**
     * 联系电话
     */
    private String holderMobile;

    /**
     * 出险地点
     */
    private String accidentAddress;

    /**
     * 驾驶员
     */
    private String driver;

    /**
     * 报案人
     */
    private String reporter;

    /**
     * 出险经过
     */
    private String accidentExplain;

    /**
     * 出险区域 1 市内 2 省内 3 省外 4 境外
     */
    private String accidentArea;

    /**
     * 勘查员
     */
    private String applyManUuid;

    /**
     * 道路类型 1 高速公路 2 普通公路 3 市区道路 4 庭院车场 5 矿山地带 6 考试场地带 7 乡村公路 99其他
     */
    private Long roadType;

    /**
     * 有无人员伤亡
     */
    private String isCasualties;

    /**
     * 是否提醒报交警
     */
    private String isReportPolice;

    /**
     * 是否提醒报交强
     */
    private String isCompulsory;

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
