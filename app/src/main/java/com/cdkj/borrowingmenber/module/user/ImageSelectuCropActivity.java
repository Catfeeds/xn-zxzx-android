package com.cdkj.borrowingmenber.module.user;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.cdkj.baselibrary.R;
import com.cdkj.baselibrary.interfaces.CameraPhotoListener;
import com.cdkj.baselibrary.utils.CameraHelper;
import com.cdkj.baselibrary.utils.ToastUtil;
import com.yalantis.ucrop.UCrop;

import java.io.File;

import static com.cdkj.baselibrary.utils.CameraHelper.CAPTURE_PHOTO_CODE;
import static com.cdkj.baselibrary.utils.CameraHelper.CAPTURE_WALBUM_CODE;

/**
 * 打开相机 相册 使用uCrop库进行裁剪
 */
public class ImageSelectuCropActivity extends Activity implements View.OnClickListener, CameraPhotoListener {

    private TextView tv_take_capture;// 拍照
    private TextView tv_alumb;// 相册选取
    private TextView tv_cancle;// 取消
    private View empty_view;// 取消

    private boolean isSplit = false;//执行相机或拍照后是否需要裁剪 默认不需要

    public static final int SHOWPIC = 1; //显示拍照按钮
    public static final int SHOWALBUM = 2;//显示相册

    private CameraHelper cameraHelper;

    public static void launch(Activity activity, int requestCode) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, ImageSelectuCropActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_image);
        initLayout();
        initVar();
    }

    private void initVar() {
        if (getIntent() != null) {
            isSplit = getIntent().getBooleanExtra("isSplit", isSplit); //获取是否裁剪
            switch (getIntent().getIntExtra("showType", 0)) {      //根据参数显示相册按钮还是显示拍照按钮 默认两个都显示
                case SHOWPIC:
                    tv_take_capture.setVisibility(View.VISIBLE);
                    tv_alumb.setVisibility(View.GONE);
                    break;
                case SHOWALBUM:
                    tv_take_capture.setVisibility(View.GONE);
                    tv_alumb.setVisibility(View.VISIBLE);
                    break;
                default:
                    tv_take_capture.setVisibility(View.VISIBLE);
                    tv_alumb.setVisibility(View.VISIBLE);
                    break;
            }
        } else {
            tv_take_capture.setVisibility(View.VISIBLE);
            tv_alumb.setVisibility(View.VISIBLE);
        }
        cameraHelper = new CameraHelper(this, this);
        cameraHelper.setSplit(isSplit);
    }

    protected void initLayout() {
        tv_take_capture = (TextView) findViewById(R.id.tv_take_capture);
        tv_alumb = (TextView) findViewById(R.id.tv_alumb);
        tv_cancle = (TextView) findViewById(R.id.tv_cancle);
        empty_view = findViewById(R.id.empty_view);

        tv_take_capture.setOnClickListener(this);
        tv_alumb.setOnClickListener(this);
        tv_cancle.setOnClickListener(this);
        empty_view.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.tv_take_capture) {
            cameraHelper.startCamera();
        } else if (i == R.id.tv_alumb) {
            cameraHelper.startAlbum();
        } else if (i == R.id.empty_view || i == R.id.tv_cancle) {
            finish();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //拍照回调
//        cameraHelper.onActivityResult(requestCode, resultCode, data);

        if (resultCode != Activity.RESULT_OK) {
            return;
        }
        switch (requestCode) {
            case CAPTURE_PHOTO_CODE:// 相机
                cropRawPhoto(cameraHelper.getImageUrl());
                break;
            case CAPTURE_WALBUM_CODE:// 相册
                cropRawPhoto(data.getData());
                break;
            case UCrop.REQUEST_CROP:
                // 成功（返回的是文件地址）
                Uri uri = UCrop.getOutput(data);
                if (uri != null) {
                    setResultFinish(uri.getPath());
                } else {
                    ToastUtil.show(this, "操作失败，请重试");
                    finish();
                }
                break;
            case UCrop.RESULT_ERROR:
                // 失败
                ToastUtil.show(this, "操作失败，请重试");
                finish();
//                mCameraTv.setText(UCrop.getError(data) + "");
                break;

            default:
                break;
        }

    }

    public void cropRawPhoto(Uri uri) {

        // 修改配置参数
        UCrop.Options options = new UCrop.Options();
        // 修改标题栏颜色
        options.setToolbarTitle("图片裁剪");
        options.setToolbarColor(getResources().getColor(R.color.colorPrimary));
        // 修改状态栏颜色
        options.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        // 隐藏底部工具
        options.setHideBottomControls(true);
        options.setShowCropGrid(false);
        // 图片格式
        options.setCompressionFormat(Bitmap.CompressFormat.JPEG);
        // 设置图片压缩质量
        options.setCompressionQuality(100);
        // 是否让用户调整范围(默认false)，如果开启，可能会造成剪切的图片的长宽比不是设定的
        // 如果不开启，用户不能拖动选框，只能缩放图片
        options.setFreeStyleCropEnabled(true);

        // 设置源uri及目标uri
        UCrop.of(uri, Uri.fromFile(new File(getCacheDir(), System.currentTimeMillis() + ".jpg")))
                // 长宽比
                .withAspectRatio(3, 2)
                // 配置参数
                .withOptions(options)
                .start(this);
    }


    //权限申请回调函数
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        cameraHelper.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (cameraHelper != null) {
            cameraHelper.clear();
        }
    }

    @Override
    public void onPhotoSuccessful(int code, String path) {
        setResultFinish(path);
    }

    private void setResultFinish(String path) {
        setResult(Activity.RESULT_OK, new Intent().putExtra(CameraHelper.staticPath, path));
        finish();
    }

    @Override
    public void onPhotoFailure(int code, String msg) {
        if (!TextUtils.isEmpty(msg)) {
            ToastUtil.show(this, msg);
        }
        finish();
    }

    @Override
    public void noPermissions(int code) {
        ToastUtil.show(this, getString(com.cdkj.borrowingmenber.R.string.no_camera_permission));
    }
}
