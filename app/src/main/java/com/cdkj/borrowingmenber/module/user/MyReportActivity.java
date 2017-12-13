package com.cdkj.borrowingmenber.module.user;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.BaseResponseListCallBack;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.adapters.FocusonListAdapter;
import com.cdkj.borrowingmenber.databinding.ActivityMyReportBinding;
import com.cdkj.borrowingmenber.model.FocusOnParseShowModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnListModel;
import com.cdkj.borrowingmenber.model.KeyDataModel;
import com.cdkj.borrowingmenber.model.MyLocalFocusOnListModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.model.ReportUserInfoModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.LocalFocusOnDataParseHelper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;

/**
 * 我的报告
 * Created by cdkj on 2017/12/11.
 */

public class MyReportActivity extends AbsBaseLoadActivity {

    private ActivityMyReportBinding mBinding;

    private List<KeyDataModel> mEducations = new ArrayList<>();//学历数据
    private String mEducationCode;//学历code


    private List<KeyDataModel> mMarriages = new ArrayList<>();//婚姻数据
    private String mMarriagesCode;//婚姻code


    private List<KeyDataModel> mLiveDays = new ArrayList<>();//居住时长数据
    private String mLiveDaysCode;

    private List<KeyDataModel> mJobs = new ArrayList<>();//职业数据
    private String mJobCode;//职业code


    private List<KeyDataModel> mInMoneys = new ArrayList<>();//收入数据
    private String mInMoneyCode;//收入code

    private List<KeyDataModel> mFamilys = new ArrayList<>();//亲属关系数据
    private String mFamilyCode;//亲属关系

    private List<KeyDataModel> mSocietys = new ArrayList<>();//社会关系数据
    private String mSocietysCode;//社会关系code


    public static void open(Context context) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, MyReportActivity.class);
        context.startActivity(intent);
    }


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_my_report, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        mBaseBinding.titleView.setMidTitle(getString(R.string.my_report_page));
        initListener();

        getReportRequest();
        getMyData(null);

    }

    private void initListener() {

        mBinding.fraUserInfo.setOnClickListener(v -> {
            if (mBinding.linUserInfo.getVisibility() == View.GONE) {
                mBinding.linUserInfo.setVisibility(View.VISIBLE);
            } else {
                mBinding.linUserInfo.setVisibility(View.GONE);
            }
        });
        mBinding.tvFraJob.setOnClickListener(v -> {
            if (mBinding.linJobInfo.getVisibility() == View.GONE) {
                mBinding.linJobInfo.setVisibility(View.VISIBLE);
            } else {
                mBinding.linJobInfo.setVisibility(View.GONE);
            }
        });
        mBinding.fraContactInfo.setOnClickListener(v -> {
            if (mBinding.linContactInfo.getVisibility() == View.GONE) {
                mBinding.linContactInfo.setVisibility(View.VISIBLE);
            } else {
                mBinding.linContactInfo.setVisibility(View.GONE);
            }
        });

        mBinding.fraFocusList.setOnClickListener(v -> {
            if (mBinding.linFocusList.getVisibility() == View.GONE) {
                mBinding.linFocusList.setVisibility(View.VISIBLE);
            } else {
                mBinding.linFocusList.setVisibility(View.GONE);
            }
        });
    }

    public void getReportRequest() {

        Map map = RetrofitUtils.getRequestMap();
        map.put("loanUser", SPUtilHelpr.getUserId());

        Call call = RetrofitUtils.createApi(MyApiServer.class).getReportData("805333", StringUtils.getJsonToString(map));

        addCall(call);

        showLoadingDialog();

        call.enqueue(new BaseResponseModelCallBack<ReportModel>(this) {

            @Override
            protected void onSuccess(ReportModel data, String SucMessage) {
                setShowData(data);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    private void setShowData(ReportModel data) {
        if (data == null) {
            return;
        }

        try {

            if (!TextUtils.isEmpty(data.getF2())) {    //用户信息
                JSONObject jsonObject = new JSONObject(data.getF2());
                mBinding.tvIdcard.setText(jsonObject.getString("idNo"));
                mBinding.tvName.setText(jsonObject.getString("realName"));
            }

            if (!TextUtils.isEmpty(data.getF1())) { //电话
                JSONObject jsonObject2 = new JSONObject(data.getF1());
                mBinding.tvPhoneNum.setText(jsonObject2.getString("mobile"));
            }

            if (!TextUtils.isEmpty(data.getF3())) {//基本信息

                mSubscription.add(Observable.just(JSON.parseObject(data.getF3(), ReportUserInfoModel.class))
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .filter(reportUserInfoModel -> reportUserInfoModel != null)
                        .subscribe(reportUserInfoModel -> {

                            showUserInfo(reportUserInfoModel);

                        }, Throwable::printStackTrace));
            }

            if (!TextUtils.isEmpty(data.getPZM6())) { //行业关注数据

                mSubscription.add(Observable.just(JSON.parseObject(data.getPZM6(), IndustryFocusOnListModel.class))
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .filter(model -> model != null)
                        .map(industryFocusOnListModel -> {
                            if (industryFocusOnListModel.isIsMathed()) {       //判断有没有行业关注清单数据
                                mBinding.tvNoFocus.setVisibility(View.GONE);
                                mBinding.linRecycler.setVisibility(View.VISIBLE);
                            } else {
                                mBinding.tvNoFocus.setVisibility(View.VISIBLE);
                                mBinding.linRecycler.setVisibility(View.GONE);
                            }
                            return industryFocusOnListModel.getDetail();
                        })
                        .filter(detailBeans -> detailBeans != null && !detailBeans.isEmpty())
                        .subscribe(model -> {
                            getMyData(model);

                        }, Throwable::printStackTrace));

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }


    private void setFocusonListData(List<FocusOnParseShowModel> data) {

        FocusonListAdapter mFocusonListAdapter = new FocusonListAdapter(data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        mBinding.recyclerFocus.setLayoutManager(linearLayoutManager);
        mBinding.recyclerFocus.setAdapter(mFocusonListAdapter);

    }


    /**
     * 解析本地xml数据获取行业关注对照数据
     */
    public void getMyData(List<IndustryFocusOnListModel.DetailBean> data) {

        showLoadingDialog();
        mSubscription.add(Observable.just(AppUtils.readAssetsTxt(MyReportActivity.this, "local_focus_on.txt"))
                .subscribeOn(Schedulers.io())
                .map(s -> {
                    return JSON.parseArray(s, MyLocalFocusOnListModel.class);
                })
                .map(myLocalFocusOnListModels -> {
                    return new LocalFocusOnDataParseHelper(myLocalFocusOnListModels);
                })
                .map(localFocusOnDataParseHelper -> {
                    return localFocusOnDataParseHelper.parseShowData(data);
                })
                .filter(focusOnParseShowModels -> focusOnParseShowModels != null && !focusOnParseShowModels.isEmpty())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> disMissLoading())
                .subscribe(s -> {
                    setFocusonListData(s);
                }, throwable -> {
                    LogUtil.E("数据错误" + throwable);
                }));

    }


    /**
     * 设置要显示的数据
     *
     * @param reportUserInfoModel
     */
    private void showUserInfo(ReportUserInfoModel reportUserInfoModel) {
        mBinding.tvChildNum.setText(reportUserInfoModel.getChildrenNum());
        mBinding.tvLiveCity.setText(reportUserInfoModel.getProvinceCity());
        mBinding.tvAddress.setText(reportUserInfoModel.getAddress());
        mBinding.tvQq.setText(reportUserInfoModel.getQq());
        mBinding.tvEmail.setText(reportUserInfoModel.getEmail());

        mBinding.tvJobCity.setText(reportUserInfoModel.getCompanyProvinceCity());
        mBinding.tvJobAddress.setText(reportUserInfoModel.getCompanyAddress());
        mBinding.tvJobCompanyName.setText(reportUserInfoModel.getCompany());
        mBinding.tvJobPhone.setText(reportUserInfoModel.getPhone());

        mBinding.tvFamilyName.setText(reportUserInfoModel.getFamilyName());
        mBinding.tvFamilyPhone.setText(reportUserInfoModel.getFamilyMobile());

        mBinding.tvSocietyName.setText(reportUserInfoModel.getSocietyName());
        mBinding.tvSocietyPhone.setText(reportUserInfoModel.getSocietyMobile());

        mEducationCode = reportUserInfoModel.getEducation();
        mMarriagesCode = reportUserInfoModel.getMarriage();
        mLiveDaysCode = reportUserInfoModel.getLiveTime();
        mJobCode = reportUserInfoModel.getOccupation();

        mInMoneyCode = reportUserInfoModel.getIncome();

        mFamilyCode = reportUserInfoModel.getFamilyRelation();
        mSocietysCode = reportUserInfoModel.getSocietyRelation();

        getEducationData();
        getMarriagesData();
        getLivesData();
        getJobData();
        getInMoneyData();
        getFamilyData();
        getSocietysData();
    }

    /**
     * 获取婚姻数据
     */
    public void getMarriagesData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "marriage");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mMarriages = data;
                checkMarriage();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    public void checkMarriage() {
        if (mMarriages == null) return;
        for (KeyDataModel kmodel : mMarriages) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mMarriagesCode)) {
                mBinding.tvMarg.setText(kmodel.getDvalue());
                break;
            }

        }
    }

    /**
     * 获取学历数据
     */
    public void getEducationData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "education");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mEducations = data;
                checkEducation();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    //获取
    public void checkEducation() {
        if (mEducations == null) return;
        for (KeyDataModel kmodel : mEducations) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mEducationCode)) {
                mBinding.tvStudySing.setText(kmodel.getDvalue());
                break;
            }

        }
    }

    /**
     * 居住时长数据
     */
    public void getLivesData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "live_time");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mLiveDays = data;
                checkLives();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    public void checkLives() {
        if (mLiveDays == null) return;
        for (KeyDataModel kmodel : mLiveDays) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mLiveDaysCode)) {
                mBinding.tvLiveDays.setText(kmodel.getDvalue());
                break;
            }

        }
    }

    /**
     * 获取工作数据
     */
    public void getJobData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "occupation");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mJobs = data;
                checkJobs();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    public void checkJobs() {
        if (mJobs == null) return;
        for (KeyDataModel kmodel : mJobs) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mJobCode)) {
                mBinding.tvJob.setText(kmodel.getDvalue());
                break;
            }

        }
    }


    /**
     * 获取工作数据
     */
    public void getInMoneyData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "income");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mInMoneys = data;
                checkInmoneys();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    public void checkInmoneys() {
        if (mInMoneys == null) return;
        for (KeyDataModel kmodel : mInMoneys) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mInMoneyCode)) {
                mBinding.tvInMoney.setText(kmodel.getDvalue());
                break;
            }

        }
    }

    /**
     * 亲属关系数据
     */
    public void getFamilyData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "family_relation");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mFamilys = data;
                checkFamilys();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    public void checkFamilys() {
        if (mFamilys == null) return;
        for (KeyDataModel kmodel : mFamilys) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mFamilyCode)) {
                mBinding.tvFamily.setText(kmodel.getDvalue());
                break;
            }

        }
    }

    /**
     * 亲属关系数据
     */
    public void getSocietysData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "society_relation");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("623907", StringUtils.getJsonToString(map));
        addCall(call);
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                mSocietys = data;
                checkSocietys();
            }

            @Override
            protected void onFinish() {

            }
        });
    }

    public void checkSocietys() {
        if (mSocietys == null) return;
        for (KeyDataModel kmodel : mSocietys) {
            if (kmodel == null) continue;

            if (TextUtils.equals(kmodel.getDkey(), mSocietysCode)) {
                mBinding.tvSociety.setText(kmodel.getDvalue());
                break;
            }

        }
    }
}
