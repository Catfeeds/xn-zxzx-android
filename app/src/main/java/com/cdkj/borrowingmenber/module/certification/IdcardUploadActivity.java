package com.cdkj.borrowingmenber.module.certification;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.activitys.ImageSelectActivity2;
import com.cdkj.baselibrary.api.BaseApiServer;
import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.model.QiniuGetTokenModel;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.CameraHelper;
import com.cdkj.baselibrary.utils.ImgUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.QiNiuHelper;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityIdcardConfirmBinding;
import com.cdkj.borrowingmenber.module.user.ImageSelectuCropActivity;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;

import org.greenrobot.eventbus.Subscribe;

import java.util.Map;

import retrofit2.Call;

/**
 * 身份证上传
 * Created by cdkj on 2017/12/10.
 */

public class IdcardUploadActivity extends BaseCertStepActivity {

    private ActivityIdcardConfirmBinding mBinding;

    //打开相机标识
    public final int PHOTOFLAG1 = 120;//正面
    public final int PHOTOFLAG2 = 121;//反面
    public final int PHOTOFLAG3 = 122;//手持
    private QiNiuHelper qiNiuHelper;
    private String mQiNiuToken;//七牛token

    //图片七牛地址
    public String mPicQiURL1;
    public String mPicQiURL2;
    public String mPicQiURL3;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_idcard_confirm, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setMidTitle("身份认证");

        initListener();

        initVar();

    }


    private void initVar() {
        qiNiuHelper = new QiNiuHelper(this);
    }

    private void initListener() {
        //正面照片上传
        mBinding.layoutIdcardPositive.setOnClickListener(v -> {
//            ImageSelectActivity2.launch(this, PHOTOFLAG1, true);
            ImageSelectuCropActivity.launch(this, PHOTOFLAG1);
        });
        //反面照片上传
        mBinding.layoutIdcardReverse.setOnClickListener(v -> {
//            ImageSelectActivity2.launch(this, PHOTOFLAG2, true);
            ImageSelectuCropActivity.launch(this, PHOTOFLAG2);
        });
        //手持照片上传
        mBinding.layoutIdcardPeople.setOnClickListener(v -> {
//            ImageSelectActivity2.launch(this, PHOTOFLAG3, true);
            ImageSelectuCropActivity.launch(this, PHOTOFLAG3);
        });

        mBinding.btnNext.setOnClickListener(v -> {
            if (!checkUrl()) return;
            upLoadPicUrl();
        });
    }

    /**
     * 上传图片地址
     */
    private void upLoadPicUrl() {

        if (isCertCodeEmpty()) {
            showToast("图片上传失败，请退出重试。");
            return;
        }

        Map map = RetrofitUtils.getRequestMap();

        map.put("identifyPicHand", mPicQiURL3);//手持
        map.put("identifyPicReverse", mPicQiURL2);//反面
        map.put("identifyPic", mPicQiURL1);//正面
        map.put("searchCode", mCertCode);

        Call call = RetrofitUtils.createApi(BaseApiServer.class).successRequest("805254", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
            @Override
            protected void onSuccess(IsSuccessModes data, String SucMessage) {
                if (data.isSuccess()) {
                    getCheckData(NEXTSTEP);
                } else {
                    UITipDialog.showInfo(IdcardUploadActivity.this, "上传失败,请退出重试");
                }
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    private boolean checkUrl() {
        if (TextUtils.isEmpty(mPicQiURL1)) {
            UITipDialog.showInfo(this, "请上传身份证正面照");
            return false;
        }
        if (TextUtils.isEmpty(mPicQiURL2)) {
            UITipDialog.showInfo(this, "请上传身份证反面照");
            return false;
        }
        if (TextUtils.isEmpty(mPicQiURL3)) {
            UITipDialog.showInfo(this, "请上传手持身份证照");
            return false;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //拍照回调
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK || data == null) {
            return;
        }
        String path = data.getStringExtra(CameraHelper.staticPath);

        if (TextUtils.isEmpty(path)) {
            switch (requestCode) {
                case PHOTOFLAG1:
                    showToast("身份证正面照上传错误,请重新拍摄");
                    break;
                case PHOTOFLAG2:
                    showToast("身份证反面照上传错误,请重新拍摄");
                    break;
                case PHOTOFLAG3:
                    showToast("身份证手持照上传错误,请重新拍摄");
                    break;
            }
            return;
        }
        getQiniuToken(requestCode, path);
    }

    /**
     * 获取七牛Token
     *
     * @param type
     * @param path
     */
    public void getQiniuToken(int type, String path) {

        if (!TextUtils.isEmpty(mQiNiuToken)) { //如果已经获取到token直接 上传图片
            getPicUrl(type, path);
            return;
        }

        Call call = qiNiuHelper.getQiniuToeknRequest();
        addCall(call);
        showLoadingDialog();
        call.enqueue(new BaseResponseModelCallBack<QiniuGetTokenModel>(this) {
            @Override
            protected void onSuccess(QiniuGetTokenModel data, String SucMessage) {
                if (data == null || TextUtils.isEmpty(data.getUploadToken())) {
                    LogUtil.E("服务器连接失败,请重试");
                    return;
                }
                mQiNiuToken = data.getUploadToken();
                getPicUrl(type, path);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }


    /**
     * @param type
     */
    public void getPicUrl(int type, String path) {

        showLoadingDialog();

        qiNiuHelper.uploadSinglePic(new QiNiuHelper.QiNiuCallBack() {
            @Override
            public void onSuccess(String key) {
                disMissLoading();
                switch (type) {
                    case PHOTOFLAG1:
                        mPicQiURL1 = key;
                        ImgUtils.loadImg(IdcardUploadActivity.this, path, mBinding.imgIdcardPositive);
                        break;
                    case PHOTOFLAG2:
                        mPicQiURL2 = key;
                        ImgUtils.loadImg(IdcardUploadActivity.this, path, mBinding.imgIdcardReverse);
                        break;
                    case PHOTOFLAG3:
                        mPicQiURL3 = key;
                        ImgUtils.loadImg(IdcardUploadActivity.this, path, mBinding.imgIdcardPeople);
                        break;
                }
            }

            @Override
            public void onFal(String info) {
                disMissLoading();
                switch (type) {
                    case PHOTOFLAG1:
                        showToast("身份证正面照上传错误,请重试");
                        break;
                    case PHOTOFLAG2:
                        showToast("身份证反面照上传错误,请重试");
                        break;
                    case PHOTOFLAG3:
                        showToast("身份证手持照上传错误,请重试");
                        break;
                }
            }
        }, path);
    }

}
