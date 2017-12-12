package com.cdkj.borrowingmenber.module.certification;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivitySurveyDetailsBinding;

/**
 * 认证信息提示
 * Created by 李先俊 on 2017/12/9.
 */

public class SurveyInfoDetailsActivity extends AbsBaseLoadActivity {

    private ActivitySurveyDetailsBinding mBinding;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_survey_details, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

    }
}
