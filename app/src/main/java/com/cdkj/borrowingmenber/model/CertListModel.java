package com.cdkj.borrowingmenber.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 认证列表
 * Created by cdkj on 2017/12/10.
 */

public class CertListModel implements Parcelable {


    /**
     * code : DC201712344120813884
     * loanUser : U2017123441208131187
     * salesUser : U201712041609378539778
     * reportCode : BG2017123441208136987
     * F1 : Y
     * F2 : Y
     * F3 : Y
     * PID1 : N
     * PDW2 : N
     * PTXL3 : N
     * PYYS4 : N
     * PZM5 : N
     * PZM6 : N
     * PZM7 : N
     * PTD8 : N
     * remainCount : 0
     * status : 0
     */

    private String code;
    private String loanUser;
    private String salesUser;
    private String reportCode;
    private String F1;
    private String F2;
    private String F3;
    private String PID1;
    private String PDW2;
    private String PTXL3;
    private String PYYS4;
    private String PZM5;
    private String PZM6;
    private String PZM7;
    private String PTD8;
    private int remainCount;
    private String status;

    public String getSalesUserMobile() {
        return salesUserMobile;
    }

    public void setSalesUserMobile(String salesUserMobile) {
        this.salesUserMobile = salesUserMobile;
    }

    private String salesUserMobile;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
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

    public int getRemainCount() {
        return remainCount;
    }

    public void setRemainCount(int remainCount) {
        this.remainCount = remainCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CertListModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.code);
        dest.writeString(this.loanUser);
        dest.writeString(this.salesUser);
        dest.writeString(this.reportCode);
        dest.writeString(this.F1);
        dest.writeString(this.F2);
        dest.writeString(this.F3);
        dest.writeString(this.PID1);
        dest.writeString(this.PDW2);
        dest.writeString(this.PTXL3);
        dest.writeString(this.PYYS4);
        dest.writeString(this.PZM5);
        dest.writeString(this.PZM6);
        dest.writeString(this.PZM7);
        dest.writeString(this.PTD8);
        dest.writeInt(this.remainCount);
        dest.writeString(this.status);
        dest.writeString(this.salesUserMobile);
    }

    protected CertListModel(Parcel in) {
        this.code = in.readString();
        this.loanUser = in.readString();
        this.salesUser = in.readString();
        this.reportCode = in.readString();
        this.F1 = in.readString();
        this.F2 = in.readString();
        this.F3 = in.readString();
        this.PID1 = in.readString();
        this.PDW2 = in.readString();
        this.PTXL3 = in.readString();
        this.PYYS4 = in.readString();
        this.PZM5 = in.readString();
        this.PZM6 = in.readString();
        this.PZM7 = in.readString();
        this.PTD8 = in.readString();
        this.remainCount = in.readInt();
        this.status = in.readString();
        this.salesUserMobile = in.readString();
    }

    public static final Creator<CertListModel> CREATOR = new Creator<CertListModel>() {
        @Override
        public CertListModel createFromParcel(Parcel source) {
            return new CertListModel(source);
        }

        @Override
        public CertListModel[] newArray(int size) {
            return new CertListModel[size];
        }
    };
}
