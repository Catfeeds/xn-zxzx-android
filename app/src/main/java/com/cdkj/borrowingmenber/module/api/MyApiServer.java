package com.cdkj.borrowingmenber.module.api;

import com.cdkj.baselibrary.api.BaseResponseListModel;
import com.cdkj.baselibrary.api.BaseResponseModel;
import com.cdkj.baselibrary.api.ResponseInListModel;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.FraudCertModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnModel;
import com.cdkj.borrowingmenber.model.KeyDataModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.model.UserInfoModel;
import com.cdkj.borrowingmenber.model.ZMCertFirstStepModel;
import com.cdkj.borrowingmenber.model.ZmScoreGetModel;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by cdkj on 2017/12/10.
 */

public interface MyApiServer {


    /**
     * 人行登录验证码
     *
     * @return
     */
    @Headers({
            "Accept: image/gif, image/jpeg, image/pjpeg, application/x-ms-application, application/xaml+xml, application/x-ms-xbap, */*",
            "Accept-Encoding: gzip, deflate",
            "Accept-Language: zh-CN",
            "Connection: Keep-Alive",
            "Cache-Control: no-cache",
            "Content-Type: application/x-www-form-urlencoded",
            "Host: ipcrs.pbccrc.org.cn",
            "Referer: https://ipcrs.pbccrc.org.cn/page/login/loginreg.jsp",
    })
    @GET("https://ipcrs.pbccrc.org.cn/imgrc.do")
    Call<ResponseBody> rhLoginCode(@Query("a") String a);


    /**
     * 人行登录
     *
     * @return
     */
    @Headers({
            "Accept: image/gif, image/jpeg, image/pjpeg, application/x-ms-application, application/xaml+xml, application/x-ms-xbap, */*",
            "Accept-Encoding: gzip, deflate",
            "Accept-Language: zh-CN",
            "Connection: Keep-Alive",
            "Cache-Control: no-cache",
            "Content-Type: application/x-www-form-urlencoded",
            "Host: ipcrs.pbccrc.org.cn",
            "Referer: https://ipcrs.pbccrc.org.cn/page/login/loginreg.jsp",
//            "User-Agent: Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 10.0; WOW64; Trident/7.0; Touch; .NET4.0C; .NET4.0E; Tablet PC 2.0)",
    })
    @FormUrlEncoded
    @POST("https://ipcrs.pbccrc.org.cn/login.do")
    Call<ResponseBody> rhLogin(@FieldMap Map<String, String> fields);


    /**
     * 获取等待认证列表
     *
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<ResponseInListModel<CertListModel>>> getWaiteCertList(@Field("code") String code, @Field("json") String json);


    /**
     * 获取调查单详情
     *
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<CertListModel>> getCertDetails(@Field("code") String code, @Field("json") String json);

    /**
     * zm one
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<ZMCertFirstStepModel>> ZmCertFirstStep(@Field("code") String code, @Field("json") String json);


    /**
     * 获取数据字典
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseListModel<KeyDataModel>> getKeyData(@Field("code") String code, @Field("json") String json);


    /**
     * 行业关注列表
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<IndustryFocusOnModel>> IndustryFocusOnInfoQuery(@Field("code") String code, @Field("json") String json);

    /**
     * 获取报告单
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<ReportModel>> getReportData(@Field("code") String code, @Field("json") String json);

    /**
     * zm 分获取
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<ZmScoreGetModel>> getZmScore(@Field("code") String code, @Field("json") String json);

    /**
     * zm 分获取
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<FraudCertModel>> fraudCertRequest(@Field("code") String code, @Field("json") String json);


    /**
     * 获取用户信息详情
     *
     * @param code
     * @param json
     * @return
     */
    @FormUrlEncoded
    @POST("api")
    Call<BaseResponseModel<UserInfoModel>> getUserInfoDetails(@Field("code") String code, @Field("json") String json);

}
