package com.cdkj.borrowingmenber.model;

/**
 * 用于展示的解析行业关注数据
 * Created by cdkj on 2017/12/12.
 */

public class FocusOnParseShowModel {

    private String bizName;//根据bizCode解析而得到的业务名称

    private String typeDescribe;// type code 解析得到被专注类型描述 如 AA001 为 逾期未还款

    private String typeDescribeDetail;// 具体专注类型描述 如 AA001003 为 逾期61-90天

    private String typeDescribeTitle;// 具体专注类型总述 如 AA001003 为 历史最大逾期天数

    private String maxMoney;//由 event_max_amt_code 解析
    private String maxMoneyName;//由 event_max_amt_code 解析

    private String evenTEndTimeDesc;//event_end_time_desc 违约时间

    private String extend;//扩展字段

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public void addExtend(String extend) {
        this.extend += extend + "\n";
    }

    public String getEvenTEndTimeDescName() {
        return evenTEndTimeDescName;
    }

    public void setEvenTEndTimeDescName(String evenTEndTimeDescName) {
        this.evenTEndTimeDescName = evenTEndTimeDescName;
    }

    private String evenTEndTimeDescName;//event_end_time_desc 违约时间

    public String getEvenTEndTimeDesc() {
        return evenTEndTimeDesc;
    }

    public void setEvenTEndTimeDesc(String evenTEndTimeDesc) {
        this.evenTEndTimeDesc = evenTEndTimeDesc;
    }

    public String getMaxMoneyName() {
        return maxMoneyName;
    }

    public void setMaxMoneyName(String maxMoneyName) {
        this.maxMoneyName = maxMoneyName;
    }

    public String getMaxMoney() {
        return maxMoney;
    }

    public void setMaxMoney(String maxMoney) {
        this.maxMoney = maxMoney;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getTypeDescribe() {
        return typeDescribe;
    }

    public void setTypeDescribe(String typeDescribe) {
        this.typeDescribe = typeDescribe;
    }

    public String getTypeDescribeDetail() {
        return typeDescribeDetail;
    }

    public void setTypeDescribeDetail(String typeDescribeDetail) {
        this.typeDescribeDetail = typeDescribeDetail;
    }

    public String getTypeDescribeTitle() {
        return typeDescribeTitle;
    }

    public void setTypeDescribeTitle(String typeDescribeTitle) {
        this.typeDescribeTitle = typeDescribeTitle;
    }
}
