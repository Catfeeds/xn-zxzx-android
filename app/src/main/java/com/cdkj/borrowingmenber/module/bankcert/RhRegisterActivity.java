package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;

import com.bigkoo.pickerview.OptionsPickerView;
import com.cdkj.baselibrary.activitys.WebViewActivity;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityRhRegiBinding;
import com.cdkj.borrowingmenber.model.RhCardTypeModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * 人行注册页面
 * Created by cdkj on 2018/1/4.
 */

public class RhRegisterActivity extends AbsBaseLoadActivity {

    private List<RhCardTypeModel> rhCardTypeModels;

    private String mCardTpyeCode;//选择的证件类型Code

    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhRegisterActivity.class);
        context.startActivity(intent);
    }

    private ActivityRhRegiBinding mBinding;

    private OptionsPickerView mCardTypePicker;//学历选择


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_regi, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        initCardTypePicker();

        initListener();

    }

    private void initListener() {

        mBinding.linCardType.setOnClickListener(v -> {
            if (mCardTypePicker != null) mCardTypePicker.show();
        });

        mBinding.tvRead1.setOnClickListener(v -> {
            WebViewActivity.openURL(this, "服务协议", "https://ipcrs.pbccrc.org.cn/html/servearticle.html");
        });

    }

    private void initCardTypePicker() {
        mCardTypePicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {

            RhCardTypeModel rhCardTypeModel = rhCardTypeModels.get(options1);

            if (rhCardTypeModel == null) return;
            mCardTpyeCode = rhCardTypeModel.getTypeCode();
            mBinding.tvCardType.setText(rhCardTypeModel.getTypeString());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();

        mSubscription.add(Observable.just("")
                .observeOn(Schedulers.newThread())
                .map(s -> {
                    String[] types = getResources().getStringArray(R.array.id_card_type);
                    rhCardTypeModels = parseCardType(types);
                    return rhCardTypeModels;
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(rhCardTypeModels -> {
                    mCardTypePicker.setPicker(rhCardTypeModels);
                }, Throwable::printStackTrace));

    }

    /**
     * 解析证件类型
     *
     * @param types
     * @return
     */
    @NonNull
    private List<RhCardTypeModel> parseCardType(String[] types) {
        List<RhCardTypeModel> rhCardTypeModels = new ArrayList<>();

        for (String type : types) {
            if (TextUtils.isEmpty(type)) continue;

            RhCardTypeModel rhCardTypeModel = new RhCardTypeModel();

            rhCardTypeModel.setTypeCode(StringUtils.subStringEnd(type, type.length() - 1)); //截取code

            rhCardTypeModel.setTypeString(StringUtils.subString(type, 0, type.length() - 1));//截取类型名称

            LogUtil.E("证件类型" + rhCardTypeModel.getTypeString() + " __" + rhCardTypeModel.getTypeCode());

            rhCardTypeModels.add(rhCardTypeModel);
        }
        return rhCardTypeModels;
    }
}
