package com.cdkj.borrowingmenber.model;

import java.util.List;

/**欺诈信息 报告
 * Created by 李先俊 on 2017/12/15.
 */

public class FraudReportModel {


    /**
     * score : 37
     * verifyInfoList : ["姓名与身份证号匹配","地址与本人不匹配","银行卡号与本人关系未知","IP与本人关系未知","MAC与本人匹配","IMEI与本人匹配"]
     * hit : no
     */

    private String score;
    private String hit;
    private List<String> verifyInfoList;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public List<String> getVerifyInfoList() {
        return verifyInfoList;
    }

    public void setVerifyInfoList(List<String> verifyInfoList) {
        this.verifyInfoList = verifyInfoList;
    }
}
