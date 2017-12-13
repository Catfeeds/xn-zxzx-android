package com.cdkj.borrowingmenber.model;

/**
 * 身份证解析报告
 * Created by 李先俊 on 2017/12/13.
 */

public class IdCardUrlReportModel {
/* map.put("identifyPicHand", mPicQiURL3);//手持
        map.put("identifyPicReverse", mPicQiURL1);//反面
        map.put("identifyPic", mPicQiURL2);//正面*/


    private String identifyPicHand;
    private String identifyPicReverse;
    private String identifyPic;

    public String getIdentifyPicHand() {
        return identifyPicHand;
    }

    public void setIdentifyPicHand(String identifyPicHand) {
        this.identifyPicHand = identifyPicHand;
    }

    public String getIdentifyPicReverse() {
        return identifyPicReverse;
    }

    public void setIdentifyPicReverse(String identifyPicReverse) {
        this.identifyPicReverse = identifyPicReverse;
    }

    public String getIdentifyPic() {
        return identifyPic;
    }

    public void setIdentifyPic(String identifyPic) {
        this.identifyPic = identifyPic;
    }
}
