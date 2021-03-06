package com.cdkj.borrowingmenber.weiget.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cdkj.borrowingmenber.R;


/**
 * 用于报告页面展示隐藏
 * <p>
 * Created by cdkj on 2017/12/1.
 */

public class ReportShowAndHideLayout extends LinearLayout {

    private TextView tvTitle;
    private ImageView imageView;

    private String txtTitle;

    private View showView;//要显示隐藏的View

    public ReportShowAndHideLayout(Context context) {
        this(context, null);
    }

    public ReportShowAndHideLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ReportShowAndHideLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        final TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ReportShowAndHideStyle, 0, 0);
        txtTitle = typedArray.getString(R.styleable.ReportShowAndHideStyle_txt_report_title);
        typedArray.recycle();
        init(context);
        tvTitle.setText(txtTitle);
    }


    private void init(Context context) {
        this.setOrientation(VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.layout_report_show, this, true);
        tvTitle = findViewById(R.id.tv_report_title);
        imageView = findViewById(R.id.img_right);
        FrameLayout frameLayout = findViewById(R.id.fra_report);
        //指示图标动画
        ObjectAnimator animStart = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 90f);
        ObjectAnimator animEnd = ObjectAnimator.ofFloat(imageView, "rotation", 90f, 0f);

        frameLayout.setOnClickListener(v -> {
            if (showView == null) return;
            if (showView.getVisibility() == GONE) {
                animStart.start();
                showView.setVisibility(VISIBLE);

            } else {
                animEnd.start();
                showView.setVisibility(GONE);
            }
        });


    }

    public void addShowView(View view) {
        if (view == null || showView == view) return;
        showView = view;
        showView.setVisibility(GONE);
        addView(view, 1);
    }


}
