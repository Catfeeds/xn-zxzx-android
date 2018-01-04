package com.cdkj.borrowingmenber.weiget.bankcert;

import android.content.Context;

import com.cdkj.baselibrary.CdApplication;
import com.cdkj.baselibrary.api.BaseResponseListModel;
import com.cdkj.baselibrary.nets.NetHelper;
import com.cdkj.baselibrary.nets.NetUtils;
import com.cdkj.baselibrary.utils.LogUtil;

import java.lang.ref.SoftReference;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.cdkj.baselibrary.nets.NetHelper.NETERRORCODE4;
import static com.cdkj.baselibrary.nets.NetHelper.REQUESTFECODE4;
import static com.cdkj.baselibrary.nets.NetHelper.REQUESTOK;
import static com.cdkj.baselibrary.nets.NetHelper.getThrowableStateCode;
import static com.cdkj.baselibrary.nets.NetHelper.getThrowableStateString;


/**
 * （人行）网络请求回调
 * Created by Administrator on 2016/9/3.
 */
public abstract class BaseRhCertCallBack<T> implements Callback<ResponseBody> {

    private Context context;

    public BaseRhCertCallBack(Context context) {
        SoftReference<Context> mS = new SoftReference<>(context);
        this.context = mS.get();
    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

        onFinish();

        if (response == null || response.body() == null) {
            onNull();
            return;
        }

        if (response.isSuccessful()) {

            try {
                onSuccess(response.body());
            } catch (Exception e) {
                if (LogUtil.isDeBug) {
                    onReqFailure(NETERRORCODE4, "未知错误" + e.toString());
                } else {
                    onReqFailure(NETERRORCODE4, "程序出现未知错误");
                }
            }

        } else {
            onReqFailure(NETERRORCODE4, "网络请求失败");
        }

    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {

        if (call.isCanceled()) {                //如果是主动请求取消的就不执行
            return;
        }
        onFinish();
        if (!NetUtils.isNetworkConnected(CdApplication.getContext())) {
            onNoNet("暂无网络");
            return;
        }

        onReqFailure(getThrowableStateCode(t), getThrowableStateString(t));

    }


    /**
     * 请求成功
     *
     * @param responseBody
     */
    protected abstract void onSuccess(ResponseBody responseBody);

    /**
     * 请求失败
     *
     * @param errorCode
     * @param errorMessage
     */
    protected void onReqFailure(String errorCode, String errorMessage) {
        NetHelper.onReqFailure(context, errorCode, errorMessage);
    }



    /**
     * 请求数据为空
     */
    protected void onNull() {
        NetHelper.onNull(context);
    }

    /**
     * 请求结束 无论请求成功或者失败都会被调用
     */
    protected abstract void onFinish();

    /**
     * 无网络
     */
    protected void onNoNet(String msg) {
        NetHelper.onNoNet(context, msg);
    }

}
