package com.cdkj.borrowingmenber.module.certification;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.cdkj.baselibrary.activitys.AddBankCardActivity;
import com.cdkj.baselibrary.activitys.WebViewActivity;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.dialog.CommonDialog;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.PermissionHelper;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityAddressbookBinding;
import com.cdkj.borrowingmenber.weiget.CertificationStepHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;

/**
 * 通讯录认证
 * Created by cdkj on 2017/8/23.
 */

public class AddressBookCertActivity extends BaseCertStepActivity {

    private ActivityAddressbookBinding mBinding;

    private PermissionHelper mHelper;


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_addressbook, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        super.afterCreate(savedInstanceState);

        mBaseBinding.titleView.setMidTitle("通讯录认证");

        init();

        initListener();
    }

    private void init() {
        mHelper = new PermissionHelper(this);
//        if (getIntent() != null) {
//            if (getIntent().getBooleanExtra("isCheckCert", false)) {
//                mBinding.btnSure.setBackgroundResource(R.drawable.btn_no_click_gray);
//                mBinding.btnSure.setEnabled(false);
//            } else {
//                mBinding.btnSure.setBackgroundResource(R.drawable.selector_login_btn);
//                mBinding.btnSure.setEnabled(true);
//            }
//        }
    }

    private void initListener() {
        mBinding.tvRead1.setOnClickListener(v -> {
            WebViewActivity.openkey(this, "通讯录授权协议", "addressBookProtocol");
        });
        mBinding.tvRead2.setOnClickListener(v -> {
            WebViewActivity.openkey(this, "信息规则", "infoCollectRule");
        });

        mBinding.btnSure.setOnClickListener(v -> {
//            if (!mBinding.checkboxSure.isChecked()) {
//                showToast("请阅读并同意授权协议");
//                return;
//            }
            permissionRequest();

        });
    }

    /**
     * 通讯录权限申请
     */
    private void permissionRequest() {
        LogUtil.E("权限申请");
        mHelper.requestPermissions(new PermissionHelper.PermissionListener() {
            @Override
            public void doAfterGrand(String... permission) {
                showLoadingDialog();
                mSubscription.add(Observable.just("0")
                        .subscribeOn(Schedulers.io())
                        .observeOn(Schedulers.io())
                        .map(s -> AppUtils.getAllContactInfo(AddressBookCertActivity.this))
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(hashMaps -> {
                            if (hashMaps != null && hashMaps.size() > 0) {
                                pushMobileInfo(hashMaps);
                            } else {
                                disMissLoading();
                                CommonDialog commonDialog = new CommonDialog(AddressBookCertActivity.this).builder()
                                        .setTitle("通讯录认证失败").setContentMsg("1.请授予读取手机联系人权限\n" +
                                                "2.请检查通讯录是否有联系人。")
                                        .setPositiveBtn("确定", view -> {
                                        });
                                commonDialog.show();

                            }
                        }, throwable -> {
                            disMissLoading();
                        }));
            }

            @Override
            public void doAfterDenied(String... permission) {
                disMissLoading();
                showToast("请授予读取手机联系人权限");
            }
        }, Manifest.permission.READ_CONTACTS, Manifest.permission.READ_EXTERNAL_STORAGE);
    }


    /**
     * 上传通讯录数据
     *
     * @param hashMaps
     */
    private void pushMobileInfo(List<HashMap<String, String>> hashMaps) {

        Map<String, Object> map = new HashMap<>();

        map.put("searchCode", mCertListModel.getCode());
        map.put("addressBookList", hashMaps);

        Call call = RetrofitUtils.getBaseAPiService().successRequest("623053", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    if (hashMaps != null && hashMaps.size() > 0) {
                        mCertListModel.setPTXL3("N");
                        CertificationStepHelper.checkRequest(AddressBookCertActivity.this, mCertListModel);
                        finish();
                    }
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                UITipDialog.showFall(AddressBookCertActivity.this, errorMessage);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }


    //权限处理
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        mHelper.handleRequestPermissionsResult(requestCode, permissions, grantResults);
    }


}
