package com.cdkj.borrowingmenber.weiget.bankcert;

import android.content.Context;
import android.text.TextUtils;

import com.cdkj.baselibrary.CdApplication;
import com.cdkj.baselibrary.api.BaseResponseListModel;
import com.cdkj.baselibrary.nets.NetHelper;
import com.cdkj.baselibrary.nets.NetUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.ToastUtil;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
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

    public static final int DOCTYPE = 0; //Document对象
    public static final int STRINGTYPE = 1;//String
    public static final int RESPONSETYPE = 2;//不做转换

    private int transitionType = 2;

    public BaseRhCertCallBack(Context context, int transitionType) {
        SoftReference<Context> mS = new SoftReference<>(context);
        this.context = mS.get();
        this.transitionType = transitionType;
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

                checkSuccessByType(response);

            } catch (Exception e) {
                if (LogUtil.isDeBug) {
                    onReqFailure(NETERRORCODE4, "未知错误" + e.toString());
                } else {
                    onReqFailure(NETERRORCODE4, "系统错误");
                }
            }

        } else {
            onReqFailure(NETERRORCODE4, "网络请求失败");
        }

    }

    /**
     * 根据type 判断转换类型
     *
     * @param response
     * @return
     * @throws Exception
     */
    private void checkSuccessByType(Response<ResponseBody> response) throws Exception {

        if (this.transitionType == RESPONSETYPE) {
            onSuccess(response.body());
            return;
        }

        String strRe = response.body().string();

        if (TextUtils.isEmpty(strRe)) {

            onReqFailure(NETERRORCODE4, "系统繁忙,请稍后再试");

            return;

        }
        if (this.transitionType == STRINGTYPE) {

            onSuccess(strRe);

        } else if (this.transitionType == DOCTYPE) {

            Document document = Jsoup.parse(strRe);

            if (document == null) {

                onReqFailure(NETERRORCODE4, "系统繁忙,请稍后再试");

                return;
            }

            Elements elements = document.getElementsByClass("error");      //出现错误提示布局

            if (elements != null && elements.size() > 0) {

                onReqFailure(NETERRORCODE4, "系统繁忙,请稍后再试");

                return;
            }

            if (TextUtils.isEmpty(document.title()) || TextUtils.isEmpty(document.text())) { //判断长时间未操作
                onReqFailure(NETERRORCODE4, "系统繁忙,请稍后再试");
                return;
            }
            onSuccess(document);
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
    protected void onSuccess(ResponseBody responseBody) {

    }

    /**
     * 请求成功 转为Document对象
     *
     * @param doc
     */
    protected void onSuccess(Document doc) {

    }

    /**
     * 请求成功 String
     *
     * @param str
     */
    protected void onSuccess(String str) {

    }

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
        ToastUtil.show(context, "系统繁忙,请稍后再试");
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
