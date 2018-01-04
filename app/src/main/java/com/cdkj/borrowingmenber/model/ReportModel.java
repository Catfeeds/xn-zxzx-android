package com.cdkj.borrowingmenber.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 李先俊 on 2017/12/10.
 */

public class ReportModel implements Parcelable {

    /**
     * code : BG2017123441214406431
     * type : 0
     * portList : F1,F2,F3
     * loanUser : U2017123441214401025
     * salesUser : U201712041609378539778
     * searchCode : DC2017123441214404065
     * F1 : {"mobile":"13110992819"}
     * F2 : {"isSuccess":false,"idNo":"522321199509111655","realName":"李先俊"}
     * F3 : {"education":"0","marriage":"0","childrenNum":"3333","provinceCity":"北京市 北京市 昌平区","address":"eifwiefiewfiwe ","liveTime":"0","qq":"333333","email":"1111@111.com","occupation":"0","income":"0","company":"2332332","companyProvinceCity":"北京市 北京市 昌平区","companyAddress":"323232","phone":"3232233232","familyRelation":"0","familyName":"2333","familyMobile":"17777777777","societyRelation":"0","societyName":"rerererre","societyMobile":"15555555555"}
     * intact : 0.00
     * status : 1
     * watchStartDatetime : Sep 11, 2017 7:00:00 PM
     * watchInvaildDatetime : Sep 11, 2019 7:00:00 PM
     * createDatetime : Dec 10, 2017 12:14:41 PM
     * readCount : 1.0
     */

    private String code;
    private String type;
    private String portList;
    private String loanUser;
    private String salesUser;
    private String searchCode;
    private String F1;
    private String F2;
    private String F3;
    private String intact;
    private String status;
    private String watchStartDatetime;
    private String watchInvaildDatetime;
    private String createDatetime;
    private double readCount;
    private String PID1;
    private String PDW2;
    private String PTXL3;
    private String PYYS4;
    private String PZM5;
    private String PZM6;

    public String getPYYS4Status() {
        return PYYS4Status;
    }

    public void setPYYS4Status(String PYYS4Status) {
        this.PYYS4Status = PYYS4Status;
    }

    private String PZM7;
    private String PTD8;
    private String PRH9;
    private String PYYS4Status;//获取运营商认证结果 //：0：未认证，1：结果拉取中，2：认证成功，3：认证失败

    public String getPRH9() {
        return PRH9;
    }

    public void setPRH9(String PRH9) {
        this.PRH9 = PRH9;
    }

    public String getPID1() {
        return PID1;
    }

    public void setPID1(String PID1) {
        this.PID1 = PID1;
    }

    public String getPDW2() {
        return PDW2;
    }

    public void setPDW2(String PDW2) {
        this.PDW2 = PDW2;
    }

    public String getPTXL3() {
        return PTXL3;
    }

    public void setPTXL3(String PTXL3) {
        this.PTXL3 = PTXL3;
    }

    public String getPYYS4() {
        return PYYS4;
    }

    public void setPYYS4(String PYYS4) {
        this.PYYS4 = PYYS4;
    }

    public String getPZM5() {
        return PZM5;
    }

    public void setPZM5(String PZM5) {
        this.PZM5 = PZM5;
    }

    public String getPZM6() {
        return PZM6;
    }

    public void setPZM6(String PZM6) {
        this.PZM6 = PZM6;
    }

    public String getPZM7() {
        return PZM7;
    }

    public void setPZM7(String PZM7) {
        this.PZM7 = PZM7;
    }

    public String getPTD8() {
        return PTD8;
    }

    public void setPTD8(String PTD8) {
        this.PTD8 = PTD8;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPortList() {
        return portList;
    }

    public void setPortList(String portList) {
        this.portList = portList;
    }

    public String getLoanUser() {
        return loanUser;
    }

    public void setLoanUser(String loanUser) {
        this.loanUser = loanUser;
    }

    public String getSalesUser() {
        return salesUser;
    }

    public void setSalesUser(String salesUser) {
        this.salesUser = salesUser;
    }

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public String getF1() {
        return F1;
    }

    public void setF1(String F1) {
        this.F1 = F1;
    }

    public String getF2() {
        return F2;
    }

    public void setF2(String F2) {
        this.F2 = F2;
    }

    public String getF3() {
        return F3;
    }

    public void setF3(String F3) {
        this.F3 = F3;
    }

    public String getIntact() {
        return intact;
    }

    public void setIntact(String intact) {
        this.intact = intact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWatchStartDatetime() {
        return watchStartDatetime;
    }

    public void setWatchStartDatetime(String watchStartDatetime) {
        this.watchStartDatetime = watchStartDatetime;
    }

    public String getWatchInvaildDatetime() {
        return watchInvaildDatetime;
    }

    public void setWatchInvaildDatetime(String watchInvaildDatetime) {
        this.watchInvaildDatetime = watchInvaildDatetime;
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime;
    }

    public double getReadCount() {
        return readCount;
    }

    public void setReadCount(double readCount) {
        this.readCount = readCount;
    }

    public ReportModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.type);
        dest.writeString(this.portList);
        dest.writeString(this.loanUser);
        dest.writeString(this.salesUser);
        dest.writeString(this.searchCode);
        dest.writeString(this.F1);
        dest.writeString(this.F2);
        dest.writeString(this.F3);
        dest.writeString(this.intact);
        dest.writeString(this.status);
        dest.writeString(this.watchStartDatetime);
        dest.writeString(this.watchInvaildDatetime);
        dest.writeString(this.createDatetime);
        dest.writeDouble(this.readCount);
        dest.writeString(this.PID1);
        dest.writeString(this.PDW2);
        dest.writeString(this.PTXL3);
        dest.writeString(this.PYYS4);
        dest.writeString(this.PZM5);
        dest.writeString(this.PZM6);
        dest.writeString(this.PZM7);
        dest.writeString(this.PTD8);
        dest.writeString(this.PYYS4Status);
    }

    protected ReportModel(Parcel in) {
        this.code = in.readString();
        this.type = in.readString();
        this.portList = in.readString();
        this.loanUser = in.readString();
        this.salesUser = in.readString();
        this.searchCode = in.readString();
        this.F1 = in.readString();
        this.F2 = in.readString();
        this.F3 = in.readString();
        this.intact = in.readString();
        this.status = in.readString();
        this.watchStartDatetime = in.readString();
        this.watchInvaildDatetime = in.readString();
        this.createDatetime = in.readString();
        this.readCount = in.readDouble();
        this.PID1 = in.readString();
        this.PDW2 = in.readString();
        this.PTXL3 = in.readString();
        this.PYYS4 = in.readString();
        this.PZM5 = in.readString();
        this.PZM6 = in.readString();
        this.PZM7 = in.readString();
        this.PTD8 = in.readString();
        this.PYYS4Status = in.readString();
    }

    public static final Creator<ReportModel> CREATOR = new Creator<ReportModel>() {
        @Override
        public ReportModel createFromParcel(Parcel source) {
            return new ReportModel(source);
        }

        @Override
        public ReportModel[] newArray(int size) {
            return new ReportModel[size];
        }
    };
}
