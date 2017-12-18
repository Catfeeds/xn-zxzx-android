package com.cdkj.borrowingmenber.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 李先俊 on 2017/8/8.
 */

public class UserInfoModel implements Parcelable {

    /**
     * userId : U201708081636580423983
     * loginName : 13765051712
     * mobile : 13765051712
     * nickname : 80423983
     * loginPwdStrength : 1
     * kind : C
     * level : 1
     * status : 0
     * createDatetime : Aug 8, 2017 4:36:58 PM
     * companyCode : CD-YLQ000014
     * systemCode : CD-YLQ000014
     * tradepwdFlag : false
     * totalFollowNum : 0
     * totalFansNum : 0
     */

    private String userId;
    private String loginName;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    private String realName;
    private String mobile;
    private String nickname;
    private String photo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.userId);
        dest.writeString(this.loginName);
        dest.writeString(this.realName);
        dest.writeString(this.mobile);
        dest.writeString(this.nickname);
        dest.writeString(this.photo);
    }

    public UserInfoModel() {
    }

    protected UserInfoModel(Parcel in) {
        this.userId = in.readString();
        this.loginName = in.readString();
        this.realName = in.readString();
        this.mobile = in.readString();
        this.nickname = in.readString();
        this.photo = in.readString();
    }

    public static final Creator<UserInfoModel> CREATOR = new Creator<UserInfoModel>() {
        @Override
        public UserInfoModel createFromParcel(Parcel source) {
            return new UserInfoModel(source);
        }

        @Override
        public UserInfoModel[] newArray(int size) {
            return new UserInfoModel[size];
        }
    };
}
