package com.cdkj.borrowingmenber.weiget;

/**
 * 同盾数据解析
 * Created by 李先俊 on 2017/12/14.
 */

public class TdDataParseHelper {

    /**
     * 获取联系人关系标签
     *
     * @param tag
     * @return
     */
    public static String getContactRelationString(String tag) {

        switch (tag) {
            case "FATHER":
                return "父亲";
            case "MOTHER":
                return "母亲";
            case "SPOUSE":
                return "配偶";
            case "CHILD":
                return "子女";
            case "OTHER_RELATIVE":
                return "其他亲属";
            case "FRIEND":
                return "朋友";
            case "COWORKER":
                return "同事";
            case "OTHERS":
                return "其它关系";
        }

        return tag;

    }

    /**
     * 获取同盾认证结果描述
     *
     * @return
     */
    public static String getTdFinalDecision(String tag) {

        switch (tag) {
            case "Accept":
                return "申请用户未检出高危风险，建议通过";
            case "Review":
                return "申请用户存在较大风险，建议进行人工审核";
            case "Reject":
                return "申请用户检测出高危风险，建议拒绝";
        }
        return "";
    }

}
