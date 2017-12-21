package com.cdkj.borrowingmenber.weiget.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.cdkj.borrowingmenber.R;

import java.util.Locale;

/**
 * 同盾解析进度dialog
 */

public class TdParseProgressDialog extends AlertDialog {

    private ProgressBar mProgressBar;
    private TextView mTipTxt;
    private TextView mProTxt;
    private boolean mIsForceUpdate = false;

    public static final int maxNum = 10;

    public TdParseProgressDialog(@NonNull Context context, String title, boolean isForceUpdate) {
        super(context);
        setTitle(title);
        init();
        mIsForceUpdate = isForceUpdate;
        this.setCancelable(mIsForceUpdate);
        mProgressBar.setMax(maxNum);
    }

    private void init() {
        View view = getLayoutInflater().inflate(R.layout.dialog_td_progress, null, false);
        mProgressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        mTipTxt = (TextView) view.findViewById(R.id.tv_loading_tip);
        mProTxt = (TextView) view.findViewById(R.id.tv_loading_pro);
        this.setView(view);

    }

    public void setProgress(float progress) {

        mTipTxt.setText(String.format(Locale.getDefault(), "%.2f%%", progress * 10));

        if (progress >= maxNum) {
            mTipTxt.setText("认证完成");
            this.setCancelable(true);
            dismiss();
        }
        mProgressBar.setProgress((int) progress);

        mProTxt.setText(progress * 10 + " / 100");
    }
}
