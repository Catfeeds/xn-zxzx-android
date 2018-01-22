package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhReportNoBinding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.greenrobot.eventbus.Subscribe;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import retrofit2.Call;

/**
 * 没有人行报告
 * Created by cdkj on 2017/12/28.
 */

public class RhNoReportActivity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhNoReportActivity.class);
        context.startActivity(intent);
    }

    private ActivityRhReportNoBinding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_report_no, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle(getString(R.string.rh_report));
    }

    @Override
    protected void onResume() {
        super.onResume();
        rhReportIsChecking();
    }

    public void rhReportIsChecking() {

        showLoadingDialog();

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhReportIsChecking();

        addCall(call);

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {

                Elements radio = doc.select("[disabled]");// 获取带有disabled属性的元素 三个资信报告类型选择框

                if (radio == null) {
                    return;
                }

                Element radiome = doc.getElementById("ApplicationOption1");//获取个人报告按钮

                if (checkRadioButtonDisabled(radio)) {          //认证中
                    mBinding.btnIKnow.setText(R.string.i_see);
                    mBinding.tvReportInfo.setText(R.string.rh_report_checkinto);
                    mBinding.btnIKnow.setOnClickListener(v -> finish());
                } else if (checkIsPass(radiome)) { //验证未通过 根据按钮的同级文本判断
                    mBinding.btnIKnow.setText(R.string.rh_re_check);
                    mBinding.tvReportInfo.setText(R.string.rh_report_no_pass);
                    mBinding.btnIKnow.setOnClickListener(v -> {
                        checkHasCode(doc);
                    });
                } else {
                    mBinding.btnIKnow.setText(R.string.rh_to_check);
                    mBinding.tvReportInfo.setText(R.string.rh_no_report);
                    mBinding.btnIKnow.setOnClickListener(v -> {
                        checkHasCode(doc);
                    });
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * 检查是否需要答题 （分为答题获取 和 验证码获取）
     *
     * @param doc
     */
    private void checkHasCode(Document doc) {


        if (StringUtils.contains(doc.text(), getString(R.string.rh_noreport_code_1)) || StringUtils.contains(doc.text(), getString(R.string.rh_noreport_code_2))) {
            showSureDialog(getString(R.string.rh_cant_use_question), view -> {
                finish();
            });
//            RhQuestionCodeCheckActivity.open(RhNoReportActivity.this, RhHelper.checkGetToken(doc), getAuthtype(doc));
        } else {
            RhQuestionCheckActivity.open(RhNoReportActivity.this, RhHelper.checkGetToken(doc));
        }

    }

    /**
     * authtype
     *
     * @param doc
     */
    public static String getAuthtype(Document doc) {
        Element element = doc.getElementById("authtype");
        if (element == null) return "5";                           //查看页面固定是5 为了保险还是从页面获取
        return element.attr("value");
    }

    @Subscribe
    public void events(String tag) {
        if (TextUtils.equals(tag, EventTags.RhQUESTIONFINISH)) { //答题完成结束当前界面
            finish();
        }
    }


    /**
     * 验证是否通过 根据按钮的同级文本判断
     *
     * @param radiome
     * @return
     */
    private boolean checkIsPass(Element radiome) {
        if (radiome == null) return false;

        Element next1 = radiome.nextElementSibling(); //获取下一个节点

        if (next1 == null) return false;

        Element next2 = next1.nextElementSibling();//获取下一个节点的节点

        if (next2 == null) return false;

        return StringUtils.contains(next2.text(), "验证未通过");
    }

    /**
     * 检测 disabled 元素禁用情况
     *
     * @param radio
     * @return
     */
    private boolean checkRadioButtonDisabled(Elements radio) {

        for (Element element : radio) {
            if (element == null) continue;

            if (TextUtils.equals(RhHelper.reportType, element.attr("value"))) {  // 如果获取的元素里 有 value=21 说明被禁用
                return true;
            }
        }
        return false;
    }

}
