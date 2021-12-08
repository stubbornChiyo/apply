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
 * 查勘表
 * </p>
 *
 * @author chirui
 * @since 2021-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ClaimSurvey extends Model<ClaimSurvey> {

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
     * 实际驾驶员
     */
    private String actualDriver;

    /**
     * 驾驶员性别 0 男 1 女
     */
    private String driverSex;

    /**
     * 是否指定驾驶员 0 否 1 是
     */
    private String isAppointDriver;

    /**
     * 准驾车证
     */
    private String allowedType;

    /**
     * 驾驶证号
     */
    private String driverLicense;

    /**
     * 事故原因
     */
    private String accidentReason;

    /**
     * 事故责任
     */
    private String responsibility;

    /**
     * 案件流程类型
     */
    private String processType;

    /**
     * 预付金额
     */
    private String advanceMoney;

    /**
     * 事故区域
     */
    private String accidentArea;

    /**
     * 事故处理部门 1 当事人自行协商处理事故非互碰自赔案件 2 交警简易程序处理非互碰自赔案件 3 交警一般程序处理 5 单方事故 6 当事人自行协商处理互碰自赔案件 7 交警简易程序处理互碰自赔案件 8 交警一般程序处理互碰自赔案件 9 其它处理部门 10 统筹公司处理
     */
    private String accidentDept;

    /**
     * 其他事故处理部门
     */
    private String accidentDeptOther;

    /**
     * 有无人员伤亡
     */
    private String isCasualties;

    /**
     * 道路类型 1 高速公路 2 普通公路 3 市区道路 4 庭院车场 5 矿山地带 6 考试场地带 7 乡村公路 99其他
     */
    private String roadType;

    /**
     * 事故类型 1 单方，未报交警，第一现场 2 单方，已报交警，第一现场 3 单方，未报交警，非现场 4 双方，未报交警，第一现场 5 双方，未报交警，非现场 6 双方，已报交警，非现场 7 双方，停车场或快速处理中心 8 多方，已报交警，第一现场 9 多方，未报交警，第一现场 10 多方，已报交警，非现场 11 多方，停车场事快速处理中心 12 单独伤人，已报交警，第一现场 13 单独伤人，未报交警，第一现场 14 单独伤人，未报交警，非现场 
     */
    private String accidentType;

    /**
     * 重大案件
     */
    private String isHeavyAccident;

    /**
     * 三者伤人数
     */
    private String thirdWoundNum;

    /**
     * 三者亡人数
     */
    private String thirdDeadNum;

    /**
     * 本车伤人数
     */
    private String selfWoundNum;

    /**
     * 本车亡人数
     */
    private String selfDeadNum;

    /**
     * 三者车辆数
     */
    private String thirdMotorNum;

    /**
     * 是否需要施救
     */
    private String isNeedRescue;

    /**
     * 是否有责死亡事故
     */
    private String isResponsibilityDead;

    /**
     * 是否道路交通事故
     */
    private String isRoadAccident;

    /**
     * 是否小额快赔案件
     */
    private String isNimblePay;

    /**
     * 预估案件
     */
    private String isReckonCase;

    /**
     * 是否有交管事故书
     */
    private String isHaveAccidentBook;

    /**
     * 交管事故书编号
     */
    private String accidentBookNo;

    /**
     * 是否互碰自赔案件
     */
    private String isSelfPay;

    /**
     * 是否代位求偿
     */
    private String isSubstitutePay;

    /**
     * 是否被代位求偿
     */
    private String isSubstitutedPay;

    /**
     * 是否第一现场
     */
    private String isPrimaryScene;

    /**
     * 查勘地点 1 第一现场（事故现场） 2 第一现场（快速处理中心) 3事故停车场 4修改厂 5其他
     */
    private String surveyAddress;

    /**
     * 查勘时间
     */
    private String surveyTime;

    /**
     * 查勘结果
     */
    private String surveyResult;

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
