package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;

import com.bigkoo.pickerview.OptionsPickerView;
import com.bumptech.glide.Glide;
import com.cdkj.baselibrary.activitys.WebViewActivity;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhRegiBinding;
import com.cdkj.borrowingmenber.databinding.ActivityRhRegiStep2Binding;
import com.cdkj.borrowingmenber.model.RhCardTypeModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * 人行注册页面 第二部
 * Created by cdkj on 2018/1/4.
 */
//TODO 人行注册输入正则验证
public class RhRegister2Activity extends AbsBaseLoadActivity {


    private String regiToken = "";//用于注册请求

    private String tcId = "";//获取得到验证码后得到 用于注册

    public static void open(Context context, String regiToken) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhRegister2Activity.class);
        intent.putExtra("regiToken", regiToken);
        context.startActivity(intent);
    }

    private ActivityRhRegiStep2Binding mBinding;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_regi_step_2, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        mBaseBinding.titleView.setMidTitle("补充用户信息");

        if (getIntent() != null) {
            regiToken = getIntent().getStringExtra("regiToken");
        }

        initListener();

    }

    private void initListener() {
        mBinding.btnSendCode.setOnClickListener(v -> {
            checkRegiInfo();
            getRegi2Code();
        });
        mBinding.btnSubmin.setOnClickListener(v -> {
            hideError();
            checkRegiInfo();
        });

    }

    /**
     * 检测注册信息
     */
    private void checkRegiInfo() {

        if (TextUtils.isEmpty(mBinding.editLoginName.getText().toString())) {
            showError("请输入登录名");
            return;
        }
        if (mBinding.editLoginName.getText().length() < 6 || mBinding.editLoginName.getText().length() > 16) {
            showError("请输入正确的登录名");
            return;
        }

        if (TextUtils.isEmpty(mBinding.editLoginPassword.getText().toString())) {
            showError("请输入登录密码");
            return;
        }

        if (mBinding.editLoginPassword.getText().length() < 6 || mBinding.editLoginPassword.getText().length() > 20) {
            showError("请输入正确的登录名");
            return;
        }

        if (TextUtils.isEmpty(mBinding.editLoginPasswordReInput.getText().toString())) {
            showError("请确认登录密码");
            return;
        }

        if (!TextUtils.equals(mBinding.editLoginPasswordReInput.getText().toString(),
                mBinding.editLoginPassword.getText().toString())) {
            showError("两次输入密码不一致");
            return;
        }
        if (TextUtils.isEmpty(mBinding.editPhone.getText().toString())) {
            showError("请输入手机号");
            return;
        }

        if (TextUtils.isEmpty(tcId)) {
            showError("请先获取动态码");
            return;
        }

        if (TextUtils.isEmpty(mBinding.editCode.getText().toString())) {
            showError("请输入动态码");
            return;
        }

        if (!TextUtils.isEmpty(mBinding.editEmail.getText().toString()) && !StringUtils.isEmail(mBinding.editEmail.getText().toString())) {
            showError("请输入正确的电子邮箱");
            return;
        }


        rhCheckRegLoginnameHasUsed();
    }


    /**
     * 检测用户名是否已经使用过
     */
    private void rhCheckRegLoginnameHasUsed() {

        showLoadingDialog();

        Map<String, String> map = new HashMap<>();

        map.put("method", "checkRegLoginnameHasUsed");
        map.put("loginname", mBinding.editLoginName.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhCheckRegLoginnameHasUsed(map, new Date().getTime() + "");

        addCall(call);

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.STRINGTYPE) {
            @Override
            protected void onSuccess(String str) {
                if (TextUtils.equals("0", str)) {   //0 代表可以使用
                    regi2Request();
                } else {
                    showError("该用户名已经被使用过");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }


    /**
     * 请求注册第二部验证码
     */
    private void getRegi2Code() {

        if (TextUtils.isEmpty(mBinding.editPhone.getText().toString())) {
            showToast("请输入手机号");
            return;
        }

        Map<String, String> map = new HashMap<>();
        map.put("method", "getAcvitaveCode");
        map.put("mobileTel", mBinding.editPhone.getText().toString());

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhRegi2Code(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.STRINGTYPE) {
            @Override
            protected void onSuccess(String str) {
                showToast("动态码发送成功，请注意查收。");
                tcId = str;
                mSubscription.add(AppUtils.startCodeDown(60, mBinding.btnSendCode));
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * 注册第二步骤请求
     */
    private void regi2Request() {

        Map<String, String> map = new HashMap<>();

        map.put("org.apache.struts.taglib.html.TOKEN", regiToken);  //解析页面的得到的token
        map.put("method", "saveUser");
        map.put("counttime", "1");        //发送验证码后 验证码倒计时剩余数字 1-60       //<input id="counttime" name="counttime" value="" type="hidden">
        map.put("tcId", tcId); //获取验证码得到
        map.put("userInfoVO.loginName", mBinding.editLoginName.getText().toString()); //获取验证码得到
        map.put("userInfoVO.password", mBinding.editLoginPassword.getText().toString());
        map.put("userInfoVO.confirmpassword", mBinding.editLoginPasswordReInput.getText().toString());
        map.put("userInfoVO.email", mBinding.editEmail.getText().toString());
        map.put("userInfoVO.mobileTel", mBinding.editPhone.getText().toString());
        map.put("userInfoVO.verifyCode", mBinding.editCode.getText().toString());
        map.put("userInfoVO.smsrcvtimeflag", "2");  //接受短信时段  1 仅在非休息时间发送（7时-23时） 2 全天均可发送（0时-24时）

        Call call = RetrofitUtils.createApi(MyApiServer.class).rhRegi2Request(map);

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {

                regiToken = RhHelper.checkGetToken(doc);

                Element errorEl = doc.getElementById("_error_field_");//判断是否有错误提示 有说明登录失败

                if (errorEl != null && !TextUtils.isEmpty(errorEl.text())) {
                    showError(errorEl.text());
                    return;
                }

//                Elements elemenRegi2 = doc.getElementsByClass("regist_text span-14");// 注册成功第二步 用于检测是否出现了第二步骤的元素 出现说明登录失败

                if (doc != null && StringUtils.contains(doc.text(), getString(R.string.rh_regi2_check1)) && StringUtils.contains(doc.text(), getString(R.string.rh_regi2_check2)) && StringUtils.contains(doc.text(), getString(R.string.rh_regi2_check3))) {
                    showError(getString(R.string.rh_regi_error));
                    return;
                }

                Elements elemenRegi3 = doc.getElementsByClass("table-con");// 判断第三步是否注册成功

                if (elemenRegi3 != null && StringUtils.contains(elemenRegi3.text(), "注册成功")) {
                    RhRegister3Activity.open(RhRegister2Activity.this);
                    finish();
                    return;
                }

                showError(getString(R.string.rh_regi_error));
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }


    /**
     * 解析页面根据id获取标签value
     *
     * @param doc
     * @param id
     * @return value
     */
    private String getInputValueById(Document doc, String id) {
        Element element = doc.getElementById(id);
        return element.attr("value");
    }

    private void showError(String text) {
        mBinding.errorInfo.setText(text);
        mBinding.errorInfo.setVisibility(View.VISIBLE);
        showToast(text);
    }

    private void hideError() {
        mBinding.errorInfo.setText("");
        mBinding.errorInfo.setVisibility(View.GONE);
    }
}
