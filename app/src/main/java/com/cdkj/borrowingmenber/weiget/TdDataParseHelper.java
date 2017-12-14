package com.cdkj.borrowingmenber.weiget;

/**
 * 同盾数据解析
 * Created by 李先俊 on 2017/12/14.
 */

public class TdDataParseHelper {

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

}
