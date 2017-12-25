package com.cdkj.borrowingmenber.module.certification;

import android.Manifest;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

import com.cdkj.baselibrary.activitys.WebViewActivity;
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

public class AddressBookCertActivity2 extends BaseCertStepActivity {

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
//            WebViewActivity.openkey(this, "通讯录授权协议", "addressBookProtocol");
            permissionRequest(1);
        });
        mBinding.tvRead2.setOnClickListener(v -> {
//            WebViewActivity.openkey(this, "信息规则", "infoCollectRule");

            permissionRequest(2);
        });

        mBinding.btnSure.setOnClickListener(v -> {
//            if (!mBinding.checkboxSure.isChecked()) {
//                showToast("请阅读并同意授权协议");
//                return;
//            }

            permissionRequest(3);
        });
    }

    /**
     * 通讯录权限申请
     */
    private void permissionRequest(int i) {
        LogUtil.E("权限申请");
        mHelper.requestPermissions(new PermissionHelper.PermissionListener() {
            @Override
            public void doAfterGrand(String... permission) {

                switch (i) {
                    case 2:
                        mSubscription.add(Observable.just("0")
                                .subscribeOn(Schedulers.io())
                                .observeOn(Schedulers.io())
                                .map(s -> AppUtils.getAllPhoneContacts(AddressBookCertActivity2.this))
                                .observeOn(AndroidSchedulers.mainThread())
                                .doFinally(() -> disMissLoading())
                                .subscribe(hashMaps -> {
                                    LogUtil.E("通讯录_2________" + hashMaps.size());
                                    LogUtil.BIGLOG("通讯录_2________" + StringUtils.getJsonToString(hashMaps));

                                }, throwable -> {
                                    disMissLoading();
                                }));
                        break;
                }
                showLoadingDialog();

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

        if (isCertCodeEmpty()) {
            showToast("通讯录认证失败，请退出重试。");
            return;
        }

        Map<String, Object> map = new HashMap<>();

        map.put("searchCode", mCertCode);
        map.put("addressBookList", hashMaps);

        Call call = RetrofitUtils.getBaseAPiService().successRequest("805257", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    if (hashMaps != null && hashMaps.size() > 0) {
                        getCheckData(NEXTSTEP);
                    }
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                UITipDialog.showFall(AddressBookCertActivity2.this, errorMessage);
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
