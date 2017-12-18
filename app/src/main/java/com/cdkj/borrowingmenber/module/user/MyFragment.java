package com.cdkj.borrowingmenber.module.user;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cdkj.baselibrary.activitys.ImageSelectActivity2;
import com.cdkj.baselibrary.activitys.WebViewActivity;
import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.BaseLazyFragment;
import com.cdkj.baselibrary.model.IntroductionInfoModel;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.CameraHelper;
import com.cdkj.baselibrary.utils.ImgUtils;
import com.cdkj.baselibrary.utils.QiNiuHelper;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.baselibrary.utils.ToastUtil;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.FragmentMyBinding;
import com.cdkj.borrowingmenber.model.UserInfoModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.module.report.MyReportActivity;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;

import static android.app.Activity.RESULT_OK;

/**
 * 认证列表界面
 * Created by cdkj on 2017/12/9.
 */

public class MyFragment extends BaseLazyFragment {


    private FragmentMyBinding mBinding;

    private static final int LOGOFLAG = 111;


    public static MyFragment getInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, null, false);

        initListener();

        getServiceTime();
        getServiceTelephone();
        return mBinding.getRoot();

    }

    @Override
    public void onResume() {
        super.onResume();
        if (mBinding != null) {
            getUserInfoRequest(false);
        }

    }

    /**
     * 获取用户信息
     */
    public void getUserInfoRequest(boolean isShowdialog) {

        if (!SPUtilHelpr.isLoginNoStart()) {  //没有登录不用请求
            return;
        }

        Map<String, String> map = new HashMap<>();

        map.put("userId", SPUtilHelpr.getUserId());
        map.put("token", SPUtilHelpr.getUserToken());

        Call call = RetrofitUtils.createApi(MyApiServer.class).getUserInfoDetails("805121", StringUtils.getJsonToString(map));

        addCall(call);

        if (isShowdialog) showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<UserInfoModel>(mActivity) {
            @Override
            protected void onSuccess(UserInfoModel data, String SucMessage) {

                ImgUtils.loadLogo(MyFragment.this, MyCdConfig.QINIUURL + data.getPhoto(), mBinding.imgUserLogo);
                mBinding.tvUserName.setText(data.getMobile());
                SPUtilHelpr.saveUserPhoneNum(data.getMobile());
            }

            @Override
            protected void onFinish() {
                if (isShowdialog) disMissLoading();
            }
        });
    }


    private void initListener() {
        mBinding.rowSetting.setOnClickListener(v -> {
            SettingActivity.open(mActivity);
        });
        mBinding.rowReport.setOnClickListener(v -> {
            MyReportActivity.open(mActivity);
        });
        mBinding.linUserInfo.setOnClickListener(v -> {
            ImageSelectActivity2.launchFragment(MyFragment.this, LOGOFLAG);
        });
        mBinding.rowAboutUs.setOnClickListener(v -> {
            WebViewActivity.openkey(mActivity, "关于我们", "aboutUs ");
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //拍照回调
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null) {
            return;
        }
        String path = data.getStringExtra(CameraHelper.staticPath);

        uploadLogo(path);
    }

    /**
     * 上传logo在
     *
     * @param path
     */
    private void uploadLogo(String path) {
        QiNiuHelper qiNiuHelper = new QiNiuHelper(mActivity);

        qiNiuHelper.uploadSinglePic(new QiNiuHelper.QiNiuCallBack() {
            @Override
            public void onSuccess(String key) {
                updateUserPhoto(key);
            }

            @Override
            public void onFal(String info) {
                ToastUtil.show(mActivity, "头像上传失败");
            }
        }, path);
    }

    /**
     * 更新头像
     *
     * @param key
     */
    private void updateUserPhoto(final String key) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", SPUtilHelpr.getUserId());
        map.put("photo", key);
        map.put("token", SPUtilHelpr.getUserToken());

        Call call = RetrofitUtils.getBaseAPiService().successRequest("805080", StringUtils.getJsonToString(map));
        addCall(call);
        showLoadingDialog();
        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(mActivity) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    ImgUtils.loadLogo(MyFragment.this, MyCdConfig.QINIUURL + key, mBinding.imgUserLogo);
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }

    //获取系统参数 服务时间
    public void getServiceTime() {

        Map<String, String> map = new HashMap<>();
        map.put("ckey", "time");
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("companyCode", MyCdConfig.COMPANYCODE);

        Call call = RetrofitUtils.getBaseAPiService().getKeySystemInfo("805917", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IntroductionInfoModel>(mActivity) {
            @Override
            protected void onSuccess(IntroductionInfoModel data, String SucMessage) {
                if (TextUtils.isEmpty(data.getCvalue())) {
                    return;
                }

                mBinding.tvServiceTime.setText("服务时间：" + data.getCvalue());

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }    //获取系统参数 服务电话

    public void getServiceTelephone() {

        Map<String, String> map = new HashMap<>();
        map.put("ckey", "telephone");
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("companyCode", MyCdConfig.COMPANYCODE);

        Call call = RetrofitUtils.getBaseAPiService().getKeySystemInfo("805917", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IntroductionInfoModel>(mActivity) {
            @Override
            protected void onSuccess(IntroductionInfoModel data, String SucMessage) {

                mBinding.tvServicePhone.setText("服务电话:"+data.getCvalue());

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


    @Override
    protected void lazyLoad() {

    }

    @Override
    protected void onInvisible() {

    }
}
