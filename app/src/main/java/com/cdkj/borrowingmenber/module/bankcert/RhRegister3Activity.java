package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
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
        return null;
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
