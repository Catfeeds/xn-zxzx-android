package com.cdkj.borrowingmenber.module.report;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

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
import com.cdkj.borrowingmenber.adapters.AddressBookReportAdapter;
import com.cdkj.borrowingmenber.adapters.FocusonListAdapter;
import com.cdkj.borrowingmenber.databinding.ActivityMyReportBinding;
import com.cdkj.borrowingmenber.model.AddressBookReportModel;
import com.cdkj.borrowingmenber.model.FocusOnParseShowModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnListModel;
import com.cdkj.borrowingmenber.model.KeyDataModel;
import com.cdkj.borrowingmenber.model.LocationReportModel;
import com.cdkj.borrowingmenber.model.MyLocalFocusOnListModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.model.ReportUserInfoModel;
import com.cdkj.borrowingmenber.model.ThreeDataReportModel;
import com.cdkj.borrowingmenber.model.ZMScoreReportModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.module.report.viewbinding.IdcardReportBinding;
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
    private IdcardReportBinding idcardReportBinding;


    private AddressBookReportAdapter mAddressBookReportAdapter;

    List<AddressBookReportModel.AddressBookListBean> mAddressBookReportAList = new ArrayList<>();


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
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAddressBookReportAdapter = new AddressBookReportAdapter(mAddressBookReportAList);
        TextView textView = new TextView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.leftMargin = 15;
        params.topMargin = 10;
        params.bottomMargin = 10;
        textView.setLayoutParams(params);
        textView.setText("暂无通讯录数据");

        mAddressBookReportAdapter.setEmptyView(textView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        mBinding.addressBookLayout.recyclerAddressbook.setLayoutManager(linearLayoutManager);
        mBinding.addressBookLayout.recyclerAddressbook.setAdapter(mAddressBookReportAdapter);

        getReportRequest();

        idcardReportBinding = new IdcardReportBinding(mBinding);

    }

    private void initListener() {

        //基本信息点击
        mBinding.basicinfoLayout.fraUserInfo.setOnClickListener(v -> {
            if (mBinding.basicinfoLayout.linUserInfo.getVisibility() == View.GONE) {
                mBinding.basicinfoLayout.linUserInfo.setVisibility(View.VISIBLE);
            } else {
                mBinding.basicinfoLayout.linUserInfo.setVisibility(View.GONE);
            }
        });
        //职业信息点击
        mBinding.jobLayout.tvFraJob.setOnClickListener(v -> {
            if (mBinding.jobLayout.linJobInfo.getVisibility() == View.GONE) {
                mBinding.jobLayout.linJobInfo.setVisibility(View.VISIBLE);
            } else {
                mBinding.jobLayout.linJobInfo.setVisibility(View.GONE);
            }
        });
        //联系人点击
        mBinding.contactLayout.fraContactInfo.setOnClickListener(v -> {
            if (mBinding.contactLayout.linContactInfo.getVisibility() == View.GONE) {
                mBinding.contactLayout.linContactInfo.setVisibility(View.VISIBLE);
            } else {
                mBinding.contactLayout.linContactInfo.setVisibility(View.GONE);
            }
        });
        //行业关注清单点击
        mBinding.focusOnLayout.fraFocusList.setOnClickListener(v -> {
            if (mBinding.focusOnLayout.recyclerFocus.getVisibility() == View.GONE) {
                mBinding.focusOnLayout.recyclerFocus.setVisibility(View.VISIBLE);
            } else {
                mBinding.focusOnLayout.recyclerFocus.setVisibility(View.GONE);
            }
        });

        //芝麻信用分
        mBinding.zmLayout.fraZm.setOnClickListener(v -> {
            if (mBinding.zmLayout.linZmScore.getVisibility() == View.GONE) {
                mBinding.zmLayout.linZmScore.setVisibility(View.VISIBLE);
            } else {
                mBinding.zmLayout.linZmScore.setVisibility(View.GONE);
            }
        });
        //定位
        mBinding.locationLayout.fraLocatin.setOnClickListener(v -> {
            if (mBinding.locationLayout.linLocation.getVisibility() == View.GONE) {
                mBinding.locationLayout.linLocation.setVisibility(View.VISIBLE);
            } else {
                mBinding.locationLayout.linLocation.setVisibility(View.GONE);
            }
        });
        //欺诈信息
        mBinding.foraudLayout.fraFraud.setOnClickListener(v -> {
            if (mBinding.foraudLayout.linFraud.getVisibility() == View.GONE) {
                mBinding.foraudLayout.linFraud.setVisibility(View.VISIBLE);
            } else {
                mBinding.foraudLayout.linFraud.setVisibility(View.GONE);
            }
        });
        //通讯录
        mBinding.addressBookLayout.fraAddressbook.setOnClickListener(v -> {

            if (mBinding.addressBookLayout.recyclerAddressbook.getVisibility() == View.GONE) {
                mBinding.addressBookLayout.recyclerAddressbook.setVisibility(View.VISIBLE);
            } else {
                mBinding.addressBookLayout.recyclerAddressbook.setVisibility(View.GONE);
            }

        });

    }

    /**
     * 获取报告单数据
     */
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

        idcardReportBinding.setShowData(MyReportActivity.this, data.getPID1()); //加载身份证图片

        if (!TextUtils.isEmpty(data.getPZM5())) {  //芝麻分
            ZMScoreReportModel zmScore = JSON.parseObject(data.getPZM5(), ZMScoreReportModel.class);
            if (zmScore != null) {
                mBinding.zmLayout.tvScore.setText(zmScore.getSearchCode());
            }
        }

        if (!TextUtils.isEmpty(data.getPDW2())) {  //定位信息
            LocationReportModel locationReportModel = JSON.parseObject(data.getPDW2(), LocationReportModel.class);
            if (locationReportModel != null) {
                mBinding.locationLayout.tvAddress.setText(locationReportModel.getAddress());
                mBinding.locationLayout.tvLatitude.setText(locationReportModel.getLatitude());
                mBinding.locationLayout.tvLongitude.setText(locationReportModel.getLongitude());
                mBinding.locationLayout.tvCity.setText(locationReportModel.getProvince() + " " + locationReportModel.getCity() + " " + locationReportModel.getProvince());
            }
        }

        if (!TextUtils.isEmpty(data.getPZM7())) {  //欺诈三接口
            ThreeDataReportModel threeDataReportModel = JSON.parseObject(data.getPZM5(), ThreeDataReportModel.class);
            if (threeDataReportModel != null) {
                mBinding.foraudLayout.tvIemi.setText(threeDataReportModel.getImei());
                mBinding.foraudLayout.tvIp.setText(threeDataReportModel.getIp());
                mBinding.foraudLayout.tvMac.setText(threeDataReportModel.getWifimac());
            }
        }

        if (!TextUtils.isEmpty(data.getPTXL3())) { //通讯录数据
            AddressBookReportModel addressBookReportModel = JSON.parseObject(data.getPTXL3(), AddressBookReportModel.class);
            if (addressBookReportModel != null && addressBookReportModel.getAddressBookList() != null) {
                mAddressBookReportAList = addressBookReportModel.getAddressBookList();
                mAddressBookReportAdapter.notifyDataSetChanged();
            }
        }


        try {

            if (!TextUtils.isEmpty(data.getF2())) {    //用户信息
                JSONObject jsonObject = new JSONObject(data.getF2());
                mBinding.basicinfoLayout.tvIdcard.setText(jsonObject.getString("idNo"));
                mBinding.basicinfoLayout.tvName.setText(jsonObject.getString("realName"));
            }

            if (!TextUtils.isEmpty(data.getF1())) { //电话
                JSONObject jsonObject2 = new JSONObject(data.getF1());
                mBinding.basicinfoLayout.tvPhoneNum.setText(jsonObject2.getString("mobile"));
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
        mBinding.focusOnLayout.recyclerFocus.setLayoutManager(linearLayoutManager);

        TextView textView = new TextView(this);

        textView.setText("adfs");

        mFocusonListAdapter.setEmptyView(textView);

        mBinding.focusOnLayout.recyclerFocus.setAdapter(mFocusonListAdapter);

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
        mBinding.basicinfoLayout.tvChildNum.setText(reportUserInfoModel.getChildrenNum());
        mBinding.basicinfoLayout.tvLiveCity.setText(reportUserInfoModel.getProvinceCity());
        mBinding.basicinfoLayout.tvAddress.setText(reportUserInfoModel.getAddress());
        mBinding.basicinfoLayout.tvQq.setText(reportUserInfoModel.getQq());
        mBinding.basicinfoLayout.tvEmail.setText(reportUserInfoModel.getEmail());

        mBinding.jobLayout.tvJobCity.setText(reportUserInfoModel.getCompanyProvinceCity());
        mBinding.jobLayout.tvJobAddress.setText(reportUserInfoModel.getCompanyAddress());
        mBinding.jobLayout.tvJobCompanyName.setText(reportUserInfoModel.getCompany());
        mBinding.jobLayout.tvJobPhone.setText(reportUserInfoModel.getPhone());

        mBinding.contactLayout.tvFamilyName.setText(reportUserInfoModel.getFamilyName());
        mBinding.contactLayout.tvFamilyPhone.setText(reportUserInfoModel.getFamilyMobile());

        mBinding.contactLayout.tvSocietyName.setText(reportUserInfoModel.getSocietyName());
        mBinding.contactLayout.tvSocietyPhone.setText(reportUserInfoModel.getSocietyMobile());

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
                mBinding.basicinfoLayout.tvMarg.setText(kmodel.getDvalue());
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
                mBinding.basicinfoLayout.tvStudySing.setText(kmodel.getDvalue());
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
                mBinding.basicinfoLayout.tvLiveDays.setText(kmodel.getDvalue());
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
                mBinding.jobLayout.tvJob.setText(kmodel.getDvalue());
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
                mBinding.jobLayout.tvInMoney.setText(kmodel.getDvalue());
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
                mBinding.contactLayout.tvFamily.setText(kmodel.getDvalue());
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
                mBinding.contactLayout.tvSociety.setText(kmodel.getDvalue());
                break;
            }

        }
    }
}
