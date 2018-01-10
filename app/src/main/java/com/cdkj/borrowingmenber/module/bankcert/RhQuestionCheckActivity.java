package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * 人行问题验证
 * Created by cdkj on 2018/1/10.
 */

public class RhQuestionCheckActivity extends AbsBaseLoadActivity {

    private String token;

    public static void open(Context context, String token) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhQuestionCheckActivity.class);
        intent.putExtra("token", token);
        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        return null;
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        if (getIntent() != null) {
            token = getIntent().getStringExtra("token");
        }
        parseQurestin();

    }


    /**
     * 获取问题
     */
    public void getRuestionRequest() {

        if (TextUtils.isEmpty(token)) {
            showToast("获取问题失败");
            finish();
            return;
        }
        showLoadingDialog();
        Map<String, String> map = new HashMap<>();
        map.put("org.apache.struts.taglib.html.TOKEN", token);
        map.put("method", "checkishasreport");
        map.put("authtype", RhHelper.reportCheckType); //id radiobutton2 3 银行卡验证  id  radiobutton1 1 数字正式验证 id  radiobutton3 2 问题验证
        map.put("ApplicationOption", RhHelper.reportType);

        Call call = RetrofitUtils.createApi(MyApiServer.class).getCheckRuestion(map);

        addCall(call);

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {
                parseQurestin();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

    /**
     * 解析问题
     */
    private void parseQurestin() {

        String st = AppUtils.readAssetsTxt(this, "test.txt");

        Document document = Jsoup.parse(st);

//        LogUtil.E(document.text());

        Elements d = document.select("ul > li");

        int i = 0;
        for (Element element : d) {

            Elements elements = document.select("[name=kbaList[" + i + "].question]");

            for (Element element1 : elements) {

                LogUtil.E("问题" + i + element1.attr("value"));
            }

            Elements elements2 = document.select("[name=kbaList[" + i + "].options]");

            for (Element element2 : elements2) {

                LogUtil.E("值" + i + element2.attr("value"));
            }
            Elements an1 = document.select("[name=kbaList[" + i + "].options1]");
            Elements an2 = document.select("[name=kbaList[" + i + "].options2]");
            Elements an3 = document.select("[name=kbaList[" + i + "].options3]");
            Elements an4 = document.select("[name=kbaList[" + i + "].options4]");
            Elements an5 = document.select("[name=kbaList[" + i + "].options5]");

            LogUtil.E("答案" + i + an1.attr("value"));
            LogUtil.E("答案" + i + an2.attr("value"));
            LogUtil.E("答案" + i + an3.attr("value"));
            LogUtil.E("答案" + i + an4.attr("value"));
            LogUtil.E("答案" + i + an5.attr("value"));

            i++;

        }
    }

}
