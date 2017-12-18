package com.cdkj.borrowingmenber.module.certification;

import android.os.Bundle;
import android.support.annotation.NonNull;
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
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import org.greenrobot.eventbus.EventBus;

import java.util.Map;

import retrofit2.Call;

import static com.cdkj.baselibrary.appmanager.EventTags.LOCATIONSUCC;

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

        locationHelper = new LocationHelper(this, new GaoDeLocation(), new LocationCallBackListener() {
            @Override
            public void locationSuccessful(LocationModel locationModel) {
                dismissLocationDialog();
                if (mCertListModel == null || locationModel == null) {
                    showToast("定位失败，请重试");
                    return;
                }
                locationCert(locationModel);
            }

            @Override
            public void locationFailure(String msg) {
                dismissLocationDialog();
                showDoubleWarnListen("定位失败，无法进行下一步认证，请重试", view -> {
                    EventBus.getDefault().post(LOCATIONSUCC);//定位失败结束上一个界面
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
                    EventBus.getDefault().post(LOCATIONSUCC);//定位失败结束上一个界面
                    finish();
                });
            }
        });

        showDoubleWarnListen("是否进行定位认证？需要您授予定位权限", view -> {
            EventBus.getDefault().post(LOCATIONSUCC);//定位失败结束上一个界面
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
        locationHelper.destroyLocation();
        locationHelper = null;
        super.onDestroy();
    }

    /**
     * 定位认证
     *
     * @param locationModel
     */
    private void locationCert(LocationModel locationModel) {

        Map map = RetrofitUtils.getRequestMap();

        map.put("address", locationModel.getAddress() + ".");
        map.put("city", locationModel.getCity() + ".");
        map.put("latitude", locationModel.getLatitude() + ".");
        map.put("longitude", locationModel.getLongitude() + ".");
        map.put("province", locationModel.getDistrict() + ".");
        map.put("area", locationModel.getProvince() + ".");
        map.put("searchCode", mCertListModel.getCode());

        showLoadingDialog();

        Call call = RetrofitUtils.getBaseAPiService().successRequest("805255", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    mCertListModel.setPDW2("N");
                    CertificationHelper.checkRequest(LocationCertActivity.this, mCertListModel);
                    EventBus.getDefault().post(LOCATIONSUCC);//定位成功结束上一个界面
                    finish();
                } else {
                    showDoubleWarnListen("定位失败，无法进行下一步认证，请重试", view -> {
                        EventBus.getDefault().post(LOCATIONSUCC);//定位失败结束上一个界面
                        finish();
                    }, view -> {
                        locationHelper.startLocation();
                    });
                }
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                showDoubleWarnListen("定位失败，无法进行下一步认证，请重试", view -> {
                    EventBus.getDefault().post(LOCATIONSUCC);//定位失败结束上一个界面
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
        if (tipDialog.isShowing()) {
            tipDialog.dismiss();
        }

        tipDialog.show();
    }

    public void dismissLocationDialog() {
        if (tipDialog != null && tipDialog.isShowing()) {
            tipDialog.dismiss();
        }
    }

}
