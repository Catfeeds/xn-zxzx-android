package com.cdkj.borrowingmenber.model;

import java.util.List;

public class TdOperatorModel {

    private TdOpModel.MobileInfoBean mobile_info; //手机信息

    private TdOpModel.UserInfoBean user_info;//用户

//    private List<TdOpModel.AllContactDetailBean> all_contact_detail;//联系人

    private TdOpModel.InfoCheckBean info_check;//是否实名检测

    private TdOpModel.InfoMatchBean info_match; //和运营上数据是否匹配

    private ReportContactModel emergency_contact1_detail; //紧急联系人1-5
    private ReportContactModel emergency_contact2_detail;
    private ReportContactModel emergency_contact5_detail;
    private ReportContactModel emergency_contact4_detail;
    private ReportContactModel emergency_contact3_detail;

    public ReportContactModel getEmergency_contact1_detail() {
        return emergency_contact1_detail;
    }

    public void setEmergency_contact1_detail(ReportContactModel emergency_contact1_detail) {
        this.emergency_contact1_detail = emergency_contact1_detail;
    }

    public ReportContactModel getEmergency_contact2_detail() {
        return emergency_contact2_detail;
    }

    public void setEmergency_contact2_detail(ReportContactModel emergency_contact2_detail) {
        this.emergency_contact2_detail = emergency_contact2_detail;
    }

    public ReportContactModel getEmergency_contact5_detail() {
        return emergency_contact5_detail;
    }

    public void setEmergency_contact5_detail(ReportContactModel emergency_contact5_detail) {
        this.emergency_contact5_detail = emergency_contact5_detail;
    }

    public ReportContactModel getEmergency_contact4_detail() {
        return emergency_contact4_detail;
    }

    public void setEmergency_contact4_detail(ReportContactModel emergency_contact4_detail) {
        this.emergency_contact4_detail = emergency_contact4_detail;
    }

    public ReportContactModel getEmergency_contact3_detail() {
        return emergency_contact3_detail;
    }

    public void setEmergency_contact3_detail(ReportContactModel emergency_contact3_detail) {
        this.emergency_contact3_detail = emergency_contact3_detail;
    }

    public TdOpModel.InfoMatchBean getInfo_match() {
        return info_match;
    }

    public void setInfo_match(TdOpModel.InfoMatchBean info_match) {
        this.info_match = info_match;
    }

    public TdOpModel.InfoCheckBean getInfo_check() {
        return info_check;
    }

    public void setInfo_check(TdOpModel.InfoCheckBean info_check) {
        this.info_check = info_check;
    }

    public TdOpModel.MobileInfoBean getMobile_info() {
        return mobile_info;
    }

    public void setMobile_info(TdOpModel.MobileInfoBean mobile_info) {
        this.mobile_info = mobile_info;
    }

    public TdOpModel.UserInfoBean getUser_info() {
        return user_info;
    }

    public void setUser_info(TdOpModel.UserInfoBean user_info) {
        this.user_info = user_info;
    }

//    public List<TdOpModel.AllContactDetailBean> getAll_contact_detail() {
//        return all_contact_detail;
//    }
//
//    public void setAll_contact_detail(List<TdOpModel.AllContactDetailBean> all_contact_detail) {
//        this.all_contact_detail = all_contact_detail;
//    }
}
