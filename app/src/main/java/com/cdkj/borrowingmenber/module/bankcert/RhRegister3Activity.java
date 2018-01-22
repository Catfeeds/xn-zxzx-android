package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhRegiStep3Binding;

/**
 * Created by cdkj on 2018/1/9.
 */

public class RhRegister3Activity extends AbsBaseLoadActivity {

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhRegister3Activity.class);
        context.startActivity(intent);
    }

    private ActivityRhRegiStep3Binding mBinding;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_regi_step_3, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        mBaseBinding.titleView.setMidTitle("完成注册");

        mBinding.btnGoLogin.setOnClickListener(v -> {
            RhLoginActivity.open(this);
            finish();
        });

    }
}
