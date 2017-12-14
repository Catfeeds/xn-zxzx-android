package com.cdkj.borrowingmenber.module.report.viewbinding;

import android.app.Activity;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.cdkj.baselibrary.utils.ImgUtils;
import com.cdkj.borrowingmenber.databinding.ActivityMyReportBinding;
import com.cdkj.borrowingmenber.model.IdCardUrlReportModel;

/**
 * 处理身份证报告数据
 * Created by cdkj on 2017/12/13.
 */

public class IdcardReportBinding {

    private ActivityMyReportBinding mBinding;

    public IdcardReportBinding(ActivityMyReportBinding binding) {
        mBinding = binding;
        init();
    }

    private void init() {
        //身份证点击
//        mBinding.idcardLayout.fraIdcard.setOnClickListener(v -> {
//            if (mBinding.idcardLayout.linIdCard.getVisibility() == View.GONE) {
//                mBinding.idcardLayout.linIdCard.setVisibility(View.VISIBLE);
//            } else {
//                mBinding.idcardLayout.linIdCard.setVisibility(View.GONE);
//            }
//        });
    }

    public void setShowData(Activity activity, String data) {
        if (data == null) {
            return;
        }
//        IdCardUrlReportModel idCardUrlReportModel = JSON.parseObject(data, IdCardUrlReportModel.class);
//
//        if (idCardUrlReportModel != null) {
//            ImgUtils.loadImg(activity, idCardUrlReportModel.getIdentifyPic(), mBinding.idcardLayout.imgIdcardPositive);  //正面
//            ImgUtils.loadImg(activity, idCardUrlReportModel.getIdentifyPicReverse(), mBinding.idcardLayout.imgIdcardReverse);  //反面
//            ImgUtils.loadImg(activity, idCardUrlReportModel.getIdentifyPicHand(), mBinding.idcardLayout.imgIdcardPeople); //正面
//        }

    }

}
