package com.cdkj.borrowingmenber.module.certification;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.interfaces.GaoDeLocation;
import com.cdkj.baselibrary.interfaces.LocationCallBackListener;
import com.cdkj.baselibrary.interfaces.LocationHelper;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.model.LocationModel;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;


import java.util.Map;

import retrofit2.Call;


/**
 * 定位认证
 * Created by cdkj on 2017/12/12.
 */
//TODO 定位key替换
public class LocationCertActivity extends BaseCertStepActivity {

    LocationHelper locationHelper;

    private UITipDialog tipDialog;

    @Override
    public View addMainView() {
        return null;
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setVisibility(View.GONE);
        mBaseBinding.viewV.setVisibility(View.GONE);
        locationHelper = new LocationHelper(this, new GaoDeLocation(), new LocationCallBackListener() {
            @Override
            public void locationSuccessful(LocationModel locationModel) {
                dismissLocationDialog();
                if (isCertCodeEmpty() || locationModel == null) {
                    showToast("定位失败，请重试");
                    return;
                }
                locationCert(locationModel);
            }

            @Override
            public void locationFailure(String msg) {
                dismissLocationDialog();
                showDoubleWarnListen("定位失败，无法进行下一步认证，请重试", view -> {
                    finish();
                }, view -> {
                    showLocationDialog();
                    locationHelper.startLocation();
                });
            }

            @Override
            public void noPermissions() {
                dismissLocationDialog();
                showSureDialog("没有定位权限，无法进行下一步认证，请到设置界面授予APP定位权限", view -> {
                    finish();
                });
            }
        });

        showDoubleWarnListen("是否进行定位认证？需要您授予定位权限", view -> {
            finish();
        }, view -> {
            showLocationDialog();
            locationHelper.startLocation();
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        locationHelper.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onDestroy() {
        if(locationHelper!=null){
            locationHelper.destroyLocation();
            locationHelper = null;
        }

        if (tipDialog != null) {
            tipDialog.dismiss();
            tipDialog = null;
        }
        super.onDestroy();
    }

    /**
     * 获取到的定位信息为空时 上传.
     *
     * @param str
     * @return
     */
    public String getNotEmptyInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return ".";
        }

        return str;

    }

    /**
     * 定位认证
     *
     * @param locationModel
     */
    private void locationCert(LocationModel locationModel) {

        if (isCertCodeEmpty()) {
            showToast("认证失败,请重试");
            finish();
        }

        Map map = RetrofitUtils.getRequestMap();

        map.put("address", getNotEmptyInfo(locationModel.getAddress()));
        map.put("city", getNotEmptyInfo(locationModel.getCity()));
        map.put("latitude", getNotEmptyInfo(locationModel.getLatitude()));
        map.put("longitude", getNotEmptyInfo(locationModel.getLongitude()));
        map.put("province", getNotEmptyInfo(locationModel.getProvince()));
        map.put("area", getNotEmptyInfo(locationModel.getDistrict()));
        map.put("searchCode", mCertCode);

        showLoadingDialog();

        Call call = RetrofitUtils.getBaseAPiService().successRequest("805255", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    getCheckData(NEXTSTEP);
                } else {
                    showDoubleWarnListen("定位失败，无法进行下一步认证，请重试", view -> {
                        finish();
                    }, view -> {
                        locationHelper.startLocation();
                    });
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                showDoubleWarnListen("定位失败，无法进行下一步认证，请重试", view -> {
                    finish();

                }, view -> {
                    locationHelper.startLocation();
                });
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    public void showLocationDialog() {
        if (tipDialog == null) {
            tipDialog = new UITipDialog.Builder(this)
                    .setIconType(UITipDialog.Builder.ICON_TYPE_LOADING)
                    .setTipWord("定位中...")
                    .create();
        }
        if (!tipDialog.isShowing()) {
            tipDialog.show();
        }
    }

    public void dismissLocationDialog() {
        if (tipDialog != null && tipDialog.isShowing()) {
            tipDialog.dismiss();
        }
    }


}
