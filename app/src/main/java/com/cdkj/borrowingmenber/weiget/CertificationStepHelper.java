package com.cdkj.borrowingmenber.weiget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.cdkj.baselibrary.base.BaseActivity;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.module.certification.AddressBookCertActivity;
import com.cdkj.borrowingmenber.module.certification.BasicInfoCertActivity;
import com.cdkj.borrowingmenber.module.certification.IdcardUploadActivity;
import com.cdkj.borrowingmenber.module.certification.IndustryFocusOnActivity;
import com.cdkj.borrowingmenber.module.certification.LocationCertActivity;
import com.cdkj.borrowingmenber.module.certification.TdOperatorCertActivity;
import com.cdkj.borrowingmenber.module.certification.ThreeDataCertActivity;
import com.cdkj.borrowingmenber.module.certification.ZMCertificationActivity;
import com.cdkj.borrowingmenber.module.certification.ZMScoreGetActivity;

import java.util.Map;

import retrofit2.Call;


/**
 * 用于认证步骤
 * Created by 李先俊 on 2017/12/10.
 */

public class CertificationStepHelper {


    /**
     * 判断说明
     *
     * 1 通过调查单和报告单一起判断 （调查单就是调查列表 报告单通过调查单编号获取）
     *
     * 2 调查单  Y： 用户要进行验证  N：用户不用进行验证（页面不显示） 用户填写了之后值不为Y或N，而是变成用户所填写的值
     *
     * 3 报告单  当用户填写成功时 报告单的值为用户所填写的值 填写失败时为空
     *
     *
     */


    /**
     * 通过调查单和报告单检测要打开的步骤界面
     *
     * @param certListModel
     */
    public static void checkStartStep(Context context, CertListModel certListModel, ReportModel reportModel) {
//        if (isNeedCertPhone(certListModel)) {
//            //打开手机认证 （未使用）
//
//            return;
//        }

        if (context == null || certListModel == null || reportModel == null) {
            return;
        }

        if (isNeedCertZm(certListModel) || isNeedCertZm(reportModel, certListModel)) {
            //打开芝麻认证
            openStepPage(context, ZMCertificationActivity.class, certListModel, reportModel);
            return;
        }


        if (isNeedCertUserInfo(certListModel) || isNeedCertUserInfo(reportModel, certListModel)) {
            //打开基本信息认证
            openStepPage(context, BasicInfoCertActivity.class, certListModel, reportModel);
            return;
        }

        if (isNeedCertIdCard(certListModel) || isNeedCertIdCard(reportModel, certListModel)) {
            //打开身份证认证
            openStepPage(context, IdcardUploadActivity.class, certListModel, reportModel);
            return;
        }

        //位置定位
        if (isNeedCertLocatin(certListModel) || isNeedCertLocatin(reportModel, certListModel)) {
            openStepPage(context, LocationCertActivity.class, certListModel, reportModel);
            return;
        }
        //打开通讯录认证
        if (isNeedCertAddressBook(certListModel) || isNeedCertAddressBook(reportModel, certListModel)) {
            openStepPage(context, AddressBookCertActivity.class, certListModel, reportModel);
            return;
        }
        //打开运营商认证
        if (isNeedCertIEMI(certListModel) || isNeedCertIEMI(reportModel, certListModel)) {
            openStepPage(context, TdOperatorCertActivity.class, certListModel, reportModel);
            return;
        }
        //打开芝麻分认证
        if (isNeedCertZmNum(certListModel) || isNeedCertZmNum(reportModel, certListModel)) {
            openStepPage(context, ZMScoreGetActivity.class, certListModel, reportModel);
            return;
        }
        //打开行业清单认证
        if (isNeedCertHyqd(certListModel) || isNeedCertHyqd(reportModel, certListModel)) {
            openStepPage(context, IndustryFocusOnActivity.class, certListModel, reportModel);
            return;
        }
        //打开欺诈认证
        if (isNeedCertQz(certListModel) || isNeedCertQz(reportModel, certListModel)) {
            openStepPage(context, ThreeDataCertActivity.class, certListModel, reportModel);
            return;
        }
        //打开同盾认证
        if (isNeedCertTd(certListModel) | isNeedCertTd(reportModel, certListModel)) {
            return;
        }
    }

    /**
     * 请求报告订单 根据报告单和调查单一起判断
     *
     * @param context
     * @param certListModel
     */
    public static void checkRequest(Activity context, CertListModel certListModel) {
        Map map = RetrofitUtils.getRequestMap();
        map.put("reportCode", certListModel.getReportCode());

        Call call = RetrofitUtils.createApi(MyApiServer.class).getReportData("805331", StringUtils.getJsonToString(map));

        if (context instanceof BaseActivity) {
            ((BaseActivity) context).showLoadingDialog();
        }

        call.enqueue(new BaseResponseModelCallBack<ReportModel>(context) {
            @Override
            protected void onSuccess(ReportModel data, String SucMessage) {
//                CertificationStepHelper.openStepPage(context, TdOperatorCertActivity.class, certListModel, data);
                CertificationStepHelper.checkStartStep(context, certListModel, data);
            }

            @Override
            protected void onFinish() {
                if (context instanceof BaseActivity) {
                    ((BaseActivity) context).disMissLoading();
                }
            }
        });

    }


    /**
     * 是否需要进行手机认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertPhone(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getF1(), "Y");
    }

    /**
     * 是否需要进行芝麻认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertZm(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getF2(), "Y");
    }

    /**
     * 是否需要进行芝麻认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertZm(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getF2()) && !TextUtils.equals(certListModel.getF2(), "Y") && !TextUtils.equals(certListModel.getF2(), "N") && !TextUtils.isEmpty(certListModel.getF2());
    }

    /**
     * 是否需要进行基本信息认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertUserInfo(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getF3(), "Y");
    }

    /**
     * 是否需要进行基本信息认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertUserInfo(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getF3()) && !TextUtils.equals(certListModel.getF3(), "Y") && !TextUtils.equals(certListModel.getF3(), "N") && !TextUtils.isEmpty(certListModel.getF3());
    }

    /**
     * 是否需要进行身份证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertIdCard(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPID1(), "Y");
    }

    /**
     * 是否需要进行身份证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertIdCard(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPID1()) && !TextUtils.equals(certListModel.getPID1(), "Y") && !TextUtils.equals(certListModel.getPID1(), "N") && !TextUtils.isEmpty(certListModel.getPID1());
    }

    /**
     * 是否需要进行定位认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertLocatin(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPDW2(), "Y");
    }

    /**
     * 是否需要进行定位认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertLocatin(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPDW2()) && !TextUtils.equals(certListModel.getPDW2(), "Y") && !TextUtils.equals(certListModel.getPDW2(), "N") && !TextUtils.isEmpty(certListModel.getPDW2());
    }


    /**
     * 是否需要通讯录认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertAddressBook(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPTXL3(), "Y");
    }

    /**
     * 是否需要通讯录认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertAddressBook(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPTXL3()) && !TextUtils.equals(certListModel.getPTXL3(), "Y") && !TextUtils.equals(certListModel.getPTXL3(), "N") && !TextUtils.isEmpty(certListModel.getPTXL3());
    }

    /**
     * 是否需要运营商认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertIEMI(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPYYS4(), "Y");
    }

    /**
     * 是否需要运营商认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertIEMI(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPYYS4()) && !TextUtils.equals(certListModel.getPYYS4(), "Y") && !TextUtils.equals(certListModel.getPYYS4(), "N") && !TextUtils.isEmpty(certListModel.getPYYS4());
    }


    /**
     * 是否需要芝麻分认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertZmNum(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPZM5(), "Y");
    }

    /**
     * 是否需要芝麻分认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertZmNum(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPZM5()) && !TextUtils.equals(certListModel.getPZM5(), "Y") && !TextUtils.equals(certListModel.getPZM5(), "N") && !TextUtils.isEmpty(certListModel.getPZM5());
    }

    /**
     * 是否需要行业关注清单认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertHyqd(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPZM6(), "Y");
    }

    /**
     * 是否需要行业关注清单认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertHyqd(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPZM6()) && !TextUtils.equals(certListModel.getPZM6(), "Y") && !TextUtils.equals(certListModel.getPZM6(), "N") && !TextUtils.isEmpty(certListModel.getPZM6());
    }


    /**
     * 是否需要欺诈认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertQz(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPZM7(), "Y");
    }

    /**
     * 是否需要欺诈认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertQz(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPZM7()) && !TextUtils.equals(certListModel.getPZM7(), "Y") && !TextUtils.equals(certListModel.getPZM7(), "N") && !TextUtils.isEmpty(certListModel.getPZM7());
    }

    /**
     * 是否需要同盾认证
     *
     * @param certListModel
     * @return
     */
    public static boolean isNeedCertTd(CertListModel certListModel) {
        return TextUtils.equals(certListModel.getPTD8(), "Y");
    }

    /**
     * 是否需要同盾认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertTd(ReportModel reportModel) {
        return TextUtils.isEmpty(reportModel.getPTD8());
    }

    /**
     * 是否需要同盾认证
     *
     * @param
     * @return
     */
    public static boolean isNeedCertTd(ReportModel reportModel, CertListModel certListModel) {
        return TextUtils.isEmpty(reportModel.getPTD8()) && !TextUtils.equals(certListModel.getPTD8(), "Y") && !TextUtils.equals(certListModel.getPTD8(), "N") && !TextUtils.isEmpty(certListModel.getPTD8());
    }


    /**
     * 打开认证界面
     *
     * @param context
     * @param clasName
     * @param certListModel
     */
    public static void openStepPage(Context context, Class clasName, CertListModel certListModel, ReportModel reportModel) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, clasName);
        intent.putExtra(INTENTGETCERTMODEL, certListModel);
        intent.putExtra(INTENTGETREPORTMODEL, reportModel);
        context.startActivity(intent);
    }

    //用于获取调查单数据
    public static final String INTENTGETCERTMODEL = "certListModel";
    public static final String INTENTGETREPORTMODEL = "ReportModel";


}
