package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhFindPwd2Binding;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

/**
 * 找回登录密码 第二步
 * Created by cdkj on 2018/1/15.
 */

public class RhFindPwdStep2Activity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhFindPwdStep2Activity.class);
        context.startActivity(intent);
    }

    private ActivityRhFindPwd2Binding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_find_pwd2, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle(getString(R.string.rh_reset_pwd));
        initListener();
    }

    private void initListener() {

        mBinding.btnGetCode.setOnClickListener(v -> getCode());

        mBinding.btnNext.setOnClickListener(v -> findPwd());

    }

    private void findPwd() {

        mBinding.errorInfo.setVisibility(View.GONE);
        if (TextUtils.isEmpty(mBinding.editNewPwd.getText().toString())) {
            showToast(getString(R.string.rh_please_input_new_pwd));
            return;
        }
        if (TextUtils.isEmpty(mBinding.editConfirmPwd.getText().toString())) {
            showToast(getString(R.string.rh_check_new_pwd));
            return;
        }
        if (!TextUtils.equals(mBinding.editConfirmPwd.getText().toString(), mBinding.editNewPwd.getText().toString())) {
            showToast(getString(R.string.rh_check_pwd_no_pass));
            return;
        }
        if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
            showToast(getString(R.string.rh_please_input_phone_code_2));
            return;
        }

        Map<String, String> map = new HashMap<>();

//        map.put("org.apache.struts.taglib.html.TOKEN",token);//
        map.put("method", "resetPassword");
        map.put("counttime", "1");
        map.put("password", mBinding.editNewPwd.getText().toString());
        map.put("confirmpassword", mBinding.editConfirmPwd.getText().toString());
        map.put("verifyCode", mBinding.editCode.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindPWD1(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {
                Elements error = doc.getElementsByClass("erro_div3");

                if (error != null && !TextUtils.isEmpty(error.text())) {
                    showToast(error.text());
                    mBinding.errorInfo.setVisibility(View.VISIBLE);
                    mBinding.errorInfo.setText(error.text());
                    return;
                }
                if (StringUtils.contains(doc.text(), getString(R.string.rh_new_pwd)) && StringUtils.contains(doc.text(), getString(R.string.rh_phone_code)
                )) {
                    showToast(getString(R.string.rh_find_pwd_error));
                    return;
                }

                if (checkUserLevel(doc)) {
                    RhFindPwdQuestionCheckActivity.open(RhFindPwdStep2Activity.this, RhHelper.checkGetToken(doc));
                    finish();
                } else {
                    showSureDialog(getString(R.string.rh_cant_use), view -> {
                        finish();
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
     * 判断用户等级 等级低的才有问题验证
     * <p>
     * 通过 有没有问题验证相关元素出现来判断
     */
    public boolean checkUserLevel(Document document) {

        Element radiobutton3 = document.getElementById("radiobutton3");

        if (radiobutton3 == null || !TextUtils.equals(radiobutton3.attr("value"), "2")) {
            return false;
        }

        Element radiobutton3_label = document.getElementById("radiobutton3_label");

        if (radiobutton3_label == null || !TextUtils.equals(radiobutton3_label.text(), getString(R.string.rh_question_check))) {
            return false;
        }

        return true;

    }

    /**
     * 获取动态码
     */
    public void getCode() {

        Map<String, String> map = new HashMap<>();

        map.put("method", "getAcvitaveCode");
        map.put("counttime", "119");

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhFindPWDGetPhoneCode(map, Math.random() + "");

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.STRINGTYPE) {
            @Override
            protected void onSuccess(String str) {

                if (TextUtils.equals("success", str)) {  //获取成功
                    mSubscription.add(AppUtils.startCodeDown(120, mBinding.btnGetCode));
                    showToast("身份动态码已经发送，请注意查收");
                } else if (TextUtils.equals("noTradeCode", str)) { //系统异常
                    showToast("系统异常，请重试");
                } else { //获取错误
                    showToast("手机动态码发送失败，请重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

}
