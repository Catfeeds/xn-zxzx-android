package com.cdkj.borrowingmenber.model;

import java.util.List;

/**
 * 对ReportModel的字段进行二次解析
 * Created by cdkj on 2017/12/15.
 */

public class ReportParseData {

    private MobileModel mobile;//电话  对应F1

    private IdAndNameModel idAndName;//身份证信息 对应 F2

    private ReportUserInfoModel useInfo;//基本信息 对应 F3

    private IdCardUrlReportModel idCardUrl;//身份证正反面 对应 PID1

    private LocationReportModel location;//定位 对应PDW2

    private List<AddressBookReportModel.AddressBookListBean> addressBook;//通讯录 PTXL3

    private TdOperatorModel tdOperator;//同盾运营商 PYYS4

    private ZMScoreReportModel zmScore;//芝麻分 PZM5

    private IndustryFocusOnListModel focusOnList;//行业关注清单 PZM6

    private FraudReportModel fradudData;//欺诈三接口 PZM7

    private TdCertMode tdCert;//同盾认证 PTD8

    private TdCertDetailModel tdCertDetail;//同盾认证详情 由TdCertMode在解析而得

    public MobileModel getMobile() {
        return mobile;
    }

    public void setMobile(MobileModel mobile) {
        this.mobile = mobile;
    }

    public IdAndNameModel getIdAndName() {
        return idAndName;
    }

    public void setIdAndName(IdAndNameModel idAndName) {
        this.idAndName = idAndName;
    }

    public ReportUserInfoModel getUseInfo() {
        return useInfo;
    }

    public void setUseInfo(ReportUserInfoModel useInfo) {
        this.useInfo = useInfo;
    }

    public IdCardUrlReportModel getIdCardUrl() {
        return idCardUrl;
    }

    public void setIdCardUrl(IdCardUrlReportModel idCardUrl) {
        this.idCardUrl = idCardUrl;
    }

    public LocationReportModel getLocation() {
        return location;
    }

    public void setLocation(LocationReportModel location) {
        this.location = location;
    }

    public List<AddressBookReportModel.AddressBookListBean> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(List<AddressBookReportModel.AddressBookListBean> addressBook) {
        this.addressBook = addressBook;
    }

    public TdOperatorModel getTdOperator() {
        return tdOperator;
    }

    public void setTdOperator(TdOperatorModel tdOperator) {
        this.tdOperator = tdOperator;
    }

    public ZMScoreReportModel getZmScore() {
        return zmScore;
    }

    public void setZmScore(ZMScoreReportModel zmScore) {
        this.zmScore = zmScore;
    }

    public IndustryFocusOnListModel getFocusOnList() {
        return focusOnList;
    }

    public void setFocusOnList(IndustryFocusOnListModel focusOnList) {
        this.focusOnList = focusOnList;
    }

    public FraudReportModel getFradudData() {
        return fradudData;
    }

    public void setFradudData(FraudReportModel fradudData) {
        this.fradudData = fradudData;
    }

    public TdCertMode getTdCert() {
        return tdCert;
    }

    public void setTdCert(TdCertMode tdCert) {
        this.tdCert = tdCert;
    }

    public TdCertDetailModel getTdCertDetail() {
        return tdCertDetail;
    }

    public void setTdCertDetail(TdCertDetailModel tdCertDetail) {
        this.tdCertDetail = tdCertDetail;
    }
}
