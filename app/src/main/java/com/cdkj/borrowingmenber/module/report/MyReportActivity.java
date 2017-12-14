package com.cdkj.borrowingmenber.module.report;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
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
import com.cdkj.baselibrary.utils.ImgUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.adapters.AddressBookReportAdapter;
import com.cdkj.borrowingmenber.adapters.FocusonListAdapter;
import com.cdkj.borrowingmenber.databinding.ActivityMyReportBinding;
import com.cdkj.borrowingmenber.databinding.LayoutBasicUserInfoBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportAddressbokBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportFocusOnBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportFraudBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportIdcardBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportLocationBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportPhoneBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportZmBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportZmCertBinding;
import com.cdkj.borrowingmenber.model.AddressBookReportModel;
import com.cdkj.borrowingmenber.model.FocusOnParseShowModel;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.IdCardUrlReportModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnListModel;
import com.cdkj.borrowingmenber.model.KeyDataModel;
import com.cdkj.borrowingmenber.model.LocationReportModel;
import com.cdkj.borrowingmenber.model.MyLocalFocusOnListModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.model.ReportUserInfoModel;
import com.cdkj.borrowingmenber.model.ThreeDataReportModel;
import com.cdkj.borrowingmenber.model.ZMScoreReportModel;
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


    private FocusonListAdapter mFocusonListAdapter;
    private AddressBookReportAdapter mAddressBookReportAdapter;

    List<AddressBookReportModel.AddressBookListBean> mAddressBookReportAList = new ArrayList<>();
    List<FocusOnParseShowModel> mFocusOnList = new ArrayList<>();

    private LayoutReportPhoneBinding phoneLayout;
    private LayoutReportZmCertBinding zmCertLayout;
    private LayoutBasicUserInfoBinding basicinfoLayout;
    private LayoutReportIdcardBinding idCardLayout;
    private LayoutReportLocationBinding locationLayout;
    private LayoutReportAddressbokBinding addressBookLayout;
    private LayoutReportZmBinding zmScoreLayout;
    private LayoutReportFocusOnBinding focusOnLayout;
    private LayoutReportFraudBinding fraudLayout;


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

        initViews();
    }

    private void initViews() {
        //电话
        phoneLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_phone, null, false);
        mBinding.showViewPhone.addShowView(phoneLayout.getRoot());

        //芝麻认证
        zmCertLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_zm_cert, null, false);
        mBinding.showViewZmCert.addShowView(zmCertLayout.getRoot());

        //基本信息
        basicinfoLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_basic_user_info, null, false);
        mBinding.showViewBasicinfo.addShowView(basicinfoLayout.getRoot());

        //身份证
        idCardLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_idcard, null, false);
        mBinding.showViewIdcard.addShowView(idCardLayout.getRoot());

        //定位
        locationLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_location, null, false);
        mBinding.showViewLocation.addShowView(locationLayout.getRoot());

        //通讯录
        addressBookLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_addressbok, null, false);
        mBinding.showViewAddressbook.addShowView(addressBookLayout.getRoot());

        //芝麻分
        zmScoreLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_zm, null, false);
        mBinding.showViewZmScore.addShowView(zmScoreLayout.getRoot());

        //关注清单
        focusOnLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_focus_on, null, false);
        mBinding.showViewFocusOn.addShowView(focusOnLayout.getRoot());

        //关注清单
        fraudLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_fraud, null, false);
        mBinding.showViewFraud.addShowView(fraudLayout.getRoot());

        initAddressBookAdapter();

        initFocusOnAdapter(mFocusOnList);

    }

    @Override
    protected void onStart() {
        super.onStart();
        getReportRequest();
    }

    private void initAddressBookAdapter() {
        mAddressBookReportAdapter = new AddressBookReportAdapter(mAddressBookReportAList);
        TextView textView = getEmptyTextView("暂无通讯录数据");
        mAddressBookReportAdapter.setEmptyView(textView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        addressBookLayout.recyclerAddressbook.setLayoutManager(linearLayoutManager);
        addressBookLayout.recyclerAddressbook.setAdapter(mAddressBookReportAdapter);
    }

    @NonNull
    private TextView getEmptyTextView(String str) {
        TextView textView = new TextView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.leftMargin = 30;
        params.topMargin = 15;
        params.bottomMargin = 15;
        textView.setLayoutParams(params);
        textView.setText(str);
        textView.setTextColor(ContextCompat.getColor(this, R.color.text_black_cd));
        return textView;
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


        if (!TextUtils.isEmpty(data.getPID1())) {
            IdCardUrlReportModel idCardUrlReportModel = JSON.parseObject(data.getPID1(), IdCardUrlReportModel.class);

            if (idCardUrlReportModel != null) {
                ImgUtils.loadImg(MyReportActivity.this, idCardUrlReportModel.getIdentifyPic(), idCardLayout.imgIdcardPositive);  //正面
                ImgUtils.loadImg(MyReportActivity.this, idCardUrlReportModel.getIdentifyPicReverse(), idCardLayout.imgIdcardReverse);  //反面
                ImgUtils.loadImg(MyReportActivity.this, idCardUrlReportModel.getIdentifyPicHand(), idCardLayout.imgIdcardPeople); //正面
            }

        }


        if (!TextUtils.isEmpty(data.getPZM5())) {  //芝麻分
            ZMScoreReportModel zmScore = JSON.parseObject(data.getPZM5(), ZMScoreReportModel.class);
            if (zmScore != null) {
                zmScoreLayout.tvScore.setText(zmScore.getSearchCode());
            }
        }

        if (!TextUtils.isEmpty(data.getPDW2())) {  //定位信息
            LocationReportModel locationReportModel = JSON.parseObject(data.getPDW2(), LocationReportModel.class);
            if (locationReportModel != null) {
                locationLayout.tvAddress.setText(locationReportModel.getAddress());
                locationLayout.tvLatitude.setText(locationReportModel.getLatitude());
                locationLayout.tvLongitude.setText(locationReportModel.getLongitude());
                locationLayout.tvCity.setText(locationReportModel.getProvince() + " " + locationReportModel.getCity() + " " + locationReportModel.getProvince());
            }
        }

        if (!TextUtils.isEmpty(data.getPZM7())) {  //欺诈三接口
            ThreeDataReportModel threeDataReportModel = JSON.parseObject(data.getPZM5(), ThreeDataReportModel.class);
            if (threeDataReportModel != null) {
                fraudLayout.tvIemi.setText(threeDataReportModel.getImei());
                fraudLayout.tvIp.setText(threeDataReportModel.getIp());
                fraudLayout.tvMac.setText(threeDataReportModel.getWifimac());
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


            if (!TextUtils.isEmpty(data.getF1())) { //电话
                JSONObject jsonObject2 = new JSONObject(data.getF1());
                if (phoneLayout != null) {
                    phoneLayout.tvPhoneNum.setText(jsonObject2.getString("mobile"));
                }
            }


            if (!TextUtils.isEmpty(data.getF2())) {    //用户信息

                IdAndNameModel idAndNameModel = JSON.parseObject(data.getF2(), IdAndNameModel.class);

                if (idAndNameModel != null) {
                    if (basicinfoLayout != null) {          //基本信息
                        basicinfoLayout.tvIdcard.setText(idAndNameModel.getIdNo());
                        basicinfoLayout.tvName.setText(idAndNameModel.getRealName());
                    }

                    if (zmCertLayout != null) {            //芝麻认证
                        zmCertLayout.tvIdNum.setText(idAndNameModel.getIdNo());
                        zmCertLayout.tvName.setText(idAndNameModel.getRealName());
                    }
                }

            }

            if (!TextUtils.isEmpty(data.getF1())) { //电话
                JSONObject jsonObject2 = new JSONObject(data.getF1());
                if (basicinfoLayout != null) {
                    basicinfoLayout.tvPhoneNum.setText(jsonObject2.getString("mobile"));
                }
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


    /**
     * 行业关注清单适配器
     *
     * @param data
     */
    private void initFocusOnAdapter(List<FocusOnParseShowModel> data) {

        mFocusonListAdapter = new FocusonListAdapter(data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        focusOnLayout.recyclerFocus.setLayoutManager(linearLayoutManager);

        mFocusonListAdapter.setEmptyView(getEmptyTextView("暂无行业关注"));

        focusOnLayout.recyclerFocus.setAdapter(mFocusonListAdapter);


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
                .filter(focusOnParseShowModels -> focusOnParseShowModels != null)
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> disMissLoading())
                .subscribe(s -> {
                    mFocusOnList.clear();
                    mFocusOnList.addAll(s);
                    mFocusonListAdapter.notifyDataSetChanged();

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
        basicinfoLayout.tvChildNum.setText(reportUserInfoModel.getChildrenNum());
        basicinfoLayout.tvLiveCity.setText(reportUserInfoModel.getProvinceCity());
        basicinfoLayout.tvAddress.setText(reportUserInfoModel.getAddress());
        basicinfoLayout.tvQq.setText(reportUserInfoModel.getQq());
        basicinfoLayout.tvEmail.setText(reportUserInfoModel.getEmail());

        basicinfoLayout.jobLayout.tvJobCity.setText(reportUserInfoModel.getCompanyProvinceCity());
        basicinfoLayout.jobLayout.tvJobAddress.setText(reportUserInfoModel.getCompanyAddress());
        basicinfoLayout.jobLayout.tvJobCompanyName.setText(reportUserInfoModel.getCompany());
        basicinfoLayout.jobLayout.tvJobPhone.setText(reportUserInfoModel.getPhone());

        basicinfoLayout.contactLayout.tvFamilyName.setText(reportUserInfoModel.getFamilyName());
        basicinfoLayout.contactLayout.tvFamilyPhone.setText(reportUserInfoModel.getFamilyMobile());

        basicinfoLayout.contactLayout.tvSocietyName.setText(reportUserInfoModel.getSocietyName());
        basicinfoLayout.contactLayout.tvSocietyPhone.setText(reportUserInfoModel.getSocietyMobile());

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
                basicinfoLayout.tvMarg.setText(kmodel.getDvalue());
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
                basicinfoLayout.tvStudySing.setText(kmodel.getDvalue());
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
                basicinfoLayout.tvLiveDays.setText(kmodel.getDvalue());
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
                basicinfoLayout.jobLayout.tvJob.setText(kmodel.getDvalue());
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
                basicinfoLayout.jobLayout.tvInMoney.setText(kmodel.getDvalue());
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
                basicinfoLayout.contactLayout.tvFamily.setText(kmodel.getDvalue());
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
                basicinfoLayout.contactLayout.tvSociety.setText(kmodel.getDvalue());
                break;
            }

        }
    }
}
