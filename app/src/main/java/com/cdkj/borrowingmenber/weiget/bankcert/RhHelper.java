package com.cdkj.borrowingmenber.weiget.bankcert;

import android.text.TextUtils;

import com.cdkj.baselibrary.utils.LogUtil;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Created by 李先俊 on 2018/1/10.
 */

public class RhHelper {

    public static final String reportType = "21";  //21 个人信用报告  24 个人信用概要 25 个人信息提示

    public static final String reportCheckType = "2";  //id  3 银行卡验证  id   1 数字正式验证 id   2 问题验证
    /**
     * 检测获取token
     *
     * @param doc
     */
    public static String checkGetToken(Document doc) {
        String token = "";
        Elements elements = doc.select("input[name]");
        if (elements == null) return token;
        for (Element element : elements) {
            if (TextUtils.equals("org.apache.struts.taglib.html.TOKEN", element.attr("name"))) {
                token = element.attr("value");
                LogUtil.E("token" + token);
                break;
            }
        }
        return token;
    }



}
