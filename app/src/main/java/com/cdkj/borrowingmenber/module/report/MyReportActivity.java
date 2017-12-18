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
import com.cdkj.baselibrary.activitys.ShowBigPhotoActivity;
import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.appmanager.SPUtilHelpr;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.nets.BaseResponseListCallBack;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.BigDecimalUtils;
import com.cdkj.baselibrary.utils.ImgUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.adapters.AddressBookReportAdapter;
import com.cdkj.borrowingmenber.adapters.FocusonListAdapter;
import com.cdkj.borrowingmenber.adapters.FraudReportListAdapter;
import com.cdkj.borrowingmenber.adapters.ReportContactPhoneNumAdapter;
import com.cdkj.borrowingmenber.adapters.TdReportCertRiskListAdapter;
import com.cdkj.borrowingmenber.databinding.ActivityMyReportBinding;
import com.cdkj.borrowingmenber.databinding.LayoutBasicUserInfoBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportAddressbokBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportFocusOnBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportFraudBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportIdcardBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportLocationBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportPhoneBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportTdCertBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportTdOperatorBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportZmBinding;
import com.cdkj.borrowingmenber.databinding.LayoutReportZmCertBinding;
import com.cdkj.borrowingmenber.model.AddressBookReportModel;
import com.cdkj.borrowingmenber.model.FocusOnParseShowModel;
import com.cdkj.borrowingmenber.model.FraudReportModel;
import com.cdkj.borrowingmenber.model.IdAndNameModel;
import com.cdkj.borrowingmenber.model.IdCardUrlReportModel;
import com.cdkj.borrowingmenber.model.IndustryFocusOnListModel;
import com.cdkj.borrowingmenber.model.KeyDataModel;
import com.cdkj.borrowingmenber.model.LocationReportModel;
import com.cdkj.borrowingmenber.model.MobileModel;
import com.cdkj.borrowingmenber.model.MyLocalFocusOnListModel;
import com.cdkj.borrowingmenber.model.ReportContactModel;
import com.cdkj.borrowingmenber.model.ReportModel;
import com.cdkj.borrowingmenber.model.ReportParseData;
import com.cdkj.borrowingmenber.model.ReportUserInfoModel;
import com.cdkj.borrowingmenber.model.TdCertDetailModel;
import com.cdkj.borrowingmenber.model.TdCertMode;
import com.cdkj.borrowingmenber.model.TdOperatorModel;
import com.cdkj.borrowingmenber.model.ZMScoreReportModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationHelper;
import com.cdkj.borrowingmenber.weiget.LocalFocusOnDataParseHelper;
import com.cdkj.borrowingmenber.weiget.TdDataParseHelper;

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

    //认证数据展示布局
    private LayoutReportPhoneBinding phoneLayout;
    private LayoutReportZmCertBinding zmCertLayout;
    private LayoutBasicUserInfoBinding basicinfoLayout;
    private LayoutReportIdcardBinding idCardLayout;
    private LayoutReportLocationBinding locationLayout;
    private LayoutReportAddressbokBinding addressBookLayout;
    private LayoutReportZmBinding zmScoreLayout;
    private LayoutReportFocusOnBinding focusOnLayout;
    private LayoutReportFraudBinding fraudLayout;
    private LayoutReportTdOperatorBinding tdOperatorLayout;
    private LayoutReportTdCertBinding tdCertLayout;


    private IdCardUrlReportModel idCardUrlReportModel;//包含了身份证url

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
        initListeners();
        initAddressBookAdapter();
        initFocusOnAdapter(mFocusOnList);
        getReportRequest();
    }

    private void initListeners() {
        idCardLayout.imgIdcardPositive.setOnClickListener(v -> { //正面
            if (idCardUrlReportModel == null) return;
            ShowBigPhotoActivity.open(this, MyCdConfig.QINIUURL + idCardUrlReportModel.getIdentifyPic());
        });
        idCardLayout.imgIdcardReverse.setOnClickListener(v -> {
            if (idCardUrlReportModel == null) return;
            ShowBigPhotoActivity.open(this, MyCdConfig.QINIUURL + idCardUrlReportModel.getIdentifyPicReverse());
        });
        idCardLayout.imgIdcardPeople.setOnClickListener(v -> {
            if (idCardUrlReportModel == null) return;
            ShowBigPhotoActivity.open(this, MyCdConfig.QINIUURL + idCardUrlReportModel.getIdentifyPicHand());
        });

    }


    /**
     * 初始化要显示的View
     */
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

        //欺诈接口
        fraudLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_fraud, null, false);
        mBinding.showViewFraud.addShowView(fraudLayout.getRoot());

        //运营商 （同盾）
        tdOperatorLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_td_operator, null, false);
        mBinding.showViewTdOperator.addShowView(tdOperatorLayout.getRoot());

        //同盾
        tdCertLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_report_td_cert, null, false);
        mBinding.showViewTd.addShowView(tdCertLayout.getRoot());

    }


    /**
     * 初始化通讯录适配器
     */
    private void initAddressBookAdapter() {
        mAddressBookReportAdapter = new AddressBookReportAdapter(mAddressBookReportAList);
        TextView textView = getEmptyTextView("暂无通讯录数据");
        mAddressBookReportAdapter.setEmptyView(textView);

        addressBookLayout.recyclerAddressbook.setLayoutManager(getLinearLayoutManager());
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
                setShowLayoutState(data.getPortList());
                parseReportDataRx(data);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * F1,F2,F3,PID1,PDW2,PTXL3,PYYS4,PZM5,PZM6,PZM7,PTD8
     * 根据portListString判断要显示的布局 没有认证的无需展示
     *
     * @param portListString
     */
    private void setShowLayoutState(String portListString) {
        List<String> portList = StringUtils.splitAsList(portListString, ",");
        if (portList != null && !portList.isEmpty()) {
            hindAllLayout();
            for (String s : portList) {
                switch (s) {
                    case CertificationHelper.F1:
                        mBinding.showViewPhone.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.F2:
                        mBinding.showViewZmCert.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.F3:
                        mBinding.showViewBasicinfo.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PID1:
                        mBinding.showViewIdcard.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PDW2:
                        mBinding.showViewLocation.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PTXL3:
                        mBinding.showViewAddressbook.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PYYS4:
                        mBinding.showViewTdOperator.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PZM5:
                        mBinding.showViewZmScore.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PZM6:
                        mBinding.showViewFocusOn.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PZM7:
                        mBinding.showViewFraud.setVisibility(View.VISIBLE);
                        break;
                    case CertificationHelper.PTD8:
                        mBinding.showViewTd.setVisibility(View.VISIBLE);
                        break;
                }
            }

        }
    }

    /**
     * 先隐藏所有布局
     */
    private void hindAllLayout() {
        mBinding.showViewPhone.setVisibility(View.GONE);
        mBinding.showViewZmCert.setVisibility(View.GONE);
        mBinding.showViewBasicinfo.setVisibility(View.GONE);
        mBinding.showViewIdcard.setVisibility(View.GONE);
        mBinding.showViewLocation.setVisibility(View.GONE);
        mBinding.showViewAddressbook.setVisibility(View.GONE);
        mBinding.showViewTdOperator.setVisibility(View.GONE);
        mBinding.showViewZmScore.setVisibility(View.GONE);
        mBinding.showViewFocusOn.setVisibility(View.GONE);
        mBinding.showViewFraud.setVisibility(View.GONE);
        mBinding.showViewTd.setVisibility(View.GONE);
    }

    /**
     * Rxjava 开启线程 解析报告数据
     *
     * @param
     */
    public void parseReportDataRx(ReportModel reportModel) {

        showLoadingDialog();
        try {                                                //捕获parseReportData 异常
            mSubscription.add(Observable.just(parseReportData(reportModel))
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .doFinally(() -> {
                        disMissLoading();
                    })
                    .subscribe(reportParseData -> {
                        setShowData(reportParseData);
                    }, throwable -> {
                        LogUtil.E("数据异常" + throwable.toString());
                        UITipDialog.showFall(MyReportActivity.this, "数据异常");
                    }));
        } catch (Exception e) {
            LogUtil.E("数据异常" + e.toString());
            UITipDialog.showFall(MyReportActivity.this, "数据异常");
            disMissLoading();
        }
    }

    /**
     * 解析报告数据
     *
     * @param reportModel
     */
    public ReportParseData parseReportData(ReportModel reportModel) {

        ReportParseData reportParseData = new ReportParseData();

        MobileModel mbMobileModel = JSON.parseObject(reportModel.getF1(), MobileModel.class); //解析电话
        reportParseData.setMobile(mbMobileModel);

        IdAndNameModel idAndNameModel = JSON.parseObject(reportModel.getF2(), IdAndNameModel.class);//姓名身份信息
        reportParseData.setIdAndName(idAndNameModel);

        ReportUserInfoModel reportUserInfoModel = JSON.parseObject(reportModel.getF3(), ReportUserInfoModel.class);//基本信息
        reportParseData.setUseInfo(reportUserInfoModel);

        IdCardUrlReportModel idCardUrlReportModel = JSON.parseObject(reportModel.getPID1(), IdCardUrlReportModel.class);//身份证图片
        reportParseData.setIdCardUrl(idCardUrlReportModel);

        LocationReportModel locationReportModel = JSON.parseObject(reportModel.getPDW2(), LocationReportModel.class);//定位
        reportParseData.setLocation(locationReportModel);

        List<AddressBookReportModel.AddressBookListBean> addressBookReportModel = JSON.parseArray(reportModel.getPTXL3(), AddressBookReportModel.AddressBookListBean.class);//通讯录
        reportParseData.setAddressBook(addressBookReportModel);

        TdOperatorModel tdOperatorModel = JSON.parseObject(reportModel.getPYYS4(), TdOperatorModel.class);//同盾运营商
        reportParseData.setTdOperator(tdOperatorModel);

        ZMScoreReportModel zmScore = JSON.parseObject(reportModel.getPZM5(), ZMScoreReportModel.class);//芝麻分
        reportParseData.setZmScore(zmScore);

        IndustryFocusOnListModel industryFocusOnListModel = JSON.parseObject(reportModel.getPZM6(), IndustryFocusOnListModel.class);//行业关注
        reportParseData.setFocusOnList(industryFocusOnListModel);

        FraudReportModel threeDataReportModel = JSON.parseObject(reportModel.getPZM7(), FraudReportModel.class);//欺诈
        reportParseData.setFradudData(threeDataReportModel);

        TdCertMode tdCertMode = JSON.parseObject(reportModel.getPTD8(), TdCertMode.class); //同盾
        reportParseData.setTdCert(tdCertMode);

        if (tdCertMode != null && !TextUtils.isEmpty(tdCertMode.getTdData())) {  //同盾详情
            TdCertDetailModel tdCertDetailModel = JSON.parseObject(tdCertMode.getTdData(), TdCertDetailModel.class);
            reportParseData.setTdCertDetail(tdCertDetailModel);
        }

        return reportParseData;
    }

    /**
     * 设置显示数据
     *
     * @param data
     */
    private void setShowData(ReportParseData data) {
        if (data == null) {
            return;
        }


        setShowUserBasicData(data);//基本信息 包含芝麻认证 身份证 姓名 电话

        setShowFocusOnData(data.getFocusOnList());//行业关注清单

        setShowZmScoreData(data.getZmScore());//芝麻分

        setShowIdCardData(data.getIdCardUrl());//身份证正反面

        setShowTdOperatorData(data.getTdOperator());//同盾运营商

        setShowLocationData(data.getLocation());//定位数据

        setShowFraudData(data.getFradudData());//欺诈 3接口

        setShowTdData(data.getTdCertDetail());//设置同盾数据

        sheShowAddressBooksData(data.getAddressBook());//通讯录数据;

    }


    /**
     * 设置行业关注数据
     *
     * @param data
     */
    private void setShowFocusOnData(IndustryFocusOnListModel data) {
        if (data == null || data.getDetail() == null) return;
        getLocaFocusOnData(data.getDetail());
    }

    /**
     * 设置用户基本信息
     *
     * @param data
     */
    private void setShowUserBasicData(ReportParseData data) {
        if (data == null) return;


        showUserInfo(data.getUseInfo()); //基本信息

        if (phoneLayout != null && data.getMobile() != null) {  //电话
            phoneLayout.tvPhoneNum.setText(data.getMobile().getMobile());
            basicinfoLayout.tvPhoneNum.setText(data.getMobile().getMobile());
        }


        IdAndNameModel idAndNameModel = data.getIdAndName();
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

    /**
     * 设置同盾认证数据
     *
     * @param tdCertDetailModel
     */
    private void setShowTdData(TdCertDetailModel tdCertDetailModel) {

        if (tdCertDetailModel != null) {
            tdCertLayout.tvTdScore.setText(tdCertDetailModel.getFinal_score());
            tdCertLayout.tvTdState.setText(TdDataParseHelper.getTdFinalDecision(tdCertDetailModel.getFinal_decision()));
            if (tdCertDetailModel.getRisk_items() != null) {
                tdCertLayout.tvRiskInfo.setText("共发现" + tdCertDetailModel.getRisk_items().size() + "条异常信息，详情请查看web端");

                tdCertLayout.recyclerTdRisk.setLayoutManager(getLinearLayoutManager());

                TdReportCertRiskListAdapter madCertRiskListAdapter = new TdReportCertRiskListAdapter(tdCertDetailModel.getRisk_items());

                tdCertLayout.recyclerTdRisk.setAdapter(madCertRiskListAdapter);
            }

        }
    }

    /**
     * 设置通讯录数据
     *
     * @param adlist
     */
    private void sheShowAddressBooksData(List<AddressBookReportModel.AddressBookListBean> adlist) {
        if (adlist == null) {
            return;
        }
        mAddressBookReportAList.clear();
        mAddressBookReportAList.addAll(adlist);
        mAddressBookReportAdapter.notifyDataSetChanged();
    }

    /**
     * 设置欺诈3接口数据
     *
     * @param threeDataReportModel
     */
    private void setShowFraudData(FraudReportModel threeDataReportModel) {
        if (threeDataReportModel != null) {
            fraudLayout.tvFraudScore.setText(threeDataReportModel.getScore());

            FraudReportListAdapter reportListAdapter = new FraudReportListAdapter(threeDataReportModel.getVerifyInfoList());
            fraudLayout.recyclerFraud.setAdapter(reportListAdapter);
            fraudLayout.recyclerFraud.setLayoutManager(getLinearLayoutManager());
        }
    }

    /**
     * 设置定位数据
     *
     * @param locationReportModel
     */
    private void setShowLocationData(LocationReportModel locationReportModel) {
        if (locationReportModel != null) {
            locationLayout.tvAddress.setText(locationReportModel.getAddress());
            locationLayout.tvLatitude.setText(locationReportModel.getLatitude());
            locationLayout.tvLongitude.setText(locationReportModel.getLongitude());
            locationLayout.tvCity.setText(locationReportModel.getProvince() + " " + locationReportModel.getCity() + " " + locationReportModel.getProvince());
        }
    }

    /**
     * 设置芝麻分显示
     *
     * @param zmScore
     */
    private void setShowZmScoreData(ZMScoreReportModel zmScore) {
        if (zmScore == null) return;
        zmScoreLayout.tvScore.setText(zmScore.getZmScore());
    }

    /**
     * 设置身份证 正反面数据
     *
     * @param idCardUrlReportModel
     */
    private void setShowIdCardData(IdCardUrlReportModel idCardUrlReportModel) {
        if (idCardUrlReportModel == null) {
            return;
        }
        this.idCardUrlReportModel = idCardUrlReportModel;
        ImgUtils.loadImg(MyReportActivity.this, MyCdConfig.QINIUURL + idCardUrlReportModel.getIdentifyPic(), idCardLayout.imgIdcardPositive);  //正面
        ImgUtils.loadImg(MyReportActivity.this, MyCdConfig.QINIUURL + idCardUrlReportModel.getIdentifyPicReverse(), idCardLayout.imgIdcardReverse);  //反面
        ImgUtils.loadImg(MyReportActivity.this, MyCdConfig.QINIUURL + idCardUrlReportModel.getIdentifyPicHand(), idCardLayout.imgIdcardPeople); //手持
    }


    /**
     * 设置同盾运营商数据
     *
     * @param tdOperatorModel
     */
    private void setShowTdOperatorData(TdOperatorModel tdOperatorModel) {

        setShowTdOperatorUserData(tdOperatorModel); //用户信息

        setShowTdOperatorMobilData(tdOperatorModel);//手机信息

        sheShowTdInfoCheck(tdOperatorModel); //状态检测

        setShowTdContactData(tdOperatorModel);//紧急联系人

    }

    /**
     * 设置同盾运营商 状态检测
     *
     * @param tdOperatorModel
     */
    private void sheShowTdInfoCheck(TdOperatorModel tdOperatorModel) {
        if (tdOperatorModel != null && tdOperatorModel.getInfo_match() != null) {         //运营商数据检测
            if (TextUtils.equals(tdOperatorModel.getInfo_match().getReal_name_check_yys(), "完全匹配") ||
                    TextUtils.equals(tdOperatorModel.getInfo_match().getReal_name_check_yys(), "模糊匹配")
                    ) {
                tdOperatorLayout.tvNameMatch.setText("和运营商数据匹配");
            } else {
                tdOperatorLayout.tvNameMatch.setText("和运营商数据不匹配");
            }

        }

        if (tdOperatorModel != null && tdOperatorModel.getInfo_check() != null) { //是否实名    检测
            if (TextUtils.equals(tdOperatorModel.getInfo_check().getIs_identity_code_reliable(), "是")) {
                tdOperatorLayout.tvNameReal.setText("已实名认证");//姓名和运营商是否匹配
            } else {
                tdOperatorLayout.tvNameReal.setText("未实名认证");//姓名和运营商是否匹配
            }
            if (TextUtils.equals(tdOperatorModel.getInfo_check().getIs_net_addr_call_addr_1month(), "是")) {
                tdOperatorLayout.tvPhoneAddrState.setText("和常用通话地址一致");//姓名和运营商是否匹配
            } else {
                tdOperatorLayout.tvPhoneAddrState.setText("和常用通话地址不一致");//姓名和运营商是否匹配
            }
        }
    }

    /**
     * 设置同盾运营商  手机信息
     *
     * @param tdOperatorModel
     */
    private void setShowTdOperatorMobilData(TdOperatorModel tdOperatorModel) {
        if (tdOperatorModel != null && tdOperatorModel.getMobile_info() != null) {         //运营商手机信息
            tdOperatorLayout.tvTdName2.setText("运营商登记姓名： " + tdOperatorModel.getMobile_info().getReal_name());
            tdOperatorLayout.tvTdPhone.setText(tdOperatorModel.getMobile_info().getUser_mobile());
            tdOperatorLayout.tvOperator.setText(tdOperatorModel.getMobile_info().getMobile_carrier());
            tdOperatorLayout.tvTellAddress.setText(tdOperatorModel.getMobile_info().getMobile_net_addr());
            tdOperatorLayout.tvPhoneMoney.setText(BigDecimalUtils.doubleValue(tdOperatorModel.getMobile_info().getAccount_balance()) / 100 + "");
            tdOperatorLayout.tvTdInTime.setText(tdOperatorModel.getMobile_info().getMobile_net_time());
            tdOperatorLayout.tvTdTellState.setText(tdOperatorModel.getMobile_info().getAccount_status());
        }
    }

    /**
     * 设置同盾运营商 用户信息
     *
     * @param tdOperatorModel
     */
    private void setShowTdOperatorUserData(TdOperatorModel tdOperatorModel) {
        if (tdOperatorModel != null && tdOperatorModel.getUser_info() != null) {   //运营商 用户信息
            tdOperatorLayout.tvTdName.setText(tdOperatorModel.getUser_info().getReal_name());
            tdOperatorLayout.tvIdCard.setText(tdOperatorModel.getUser_info().getIdentity_code());
            tdOperatorLayout.tvGender.setText(tdOperatorModel.getUser_info().getGender());
            tdOperatorLayout.tvAge.setText(tdOperatorModel.getUser_info().getAge());
            tdOperatorLayout.tvHomeAddress.setText(tdOperatorModel.getUser_info().getHome_addr());
            tdOperatorLayout.tvHomeTell.setText(tdOperatorModel.getUser_info().getHome_tel());
            tdOperatorLayout.tvCompanyName.setText(tdOperatorModel.getUser_info().getCompany_name());
            tdOperatorLayout.tvCompanyAddress.setText(tdOperatorModel.getUser_info().getWork_addr());
            tdOperatorLayout.tvCompanyTell.setText(tdOperatorModel.getUser_info().getWork_tel());
            tdOperatorLayout.tvTdEmail.setText(tdOperatorModel.getUser_info().getEmail());
        }
    }

    /**
     * 同盾   紧急联系人数据
     *
     * @param tdOperatorModel
     */
    private void setShowTdContactData(TdOperatorModel tdOperatorModel) {
        if (tdOperatorModel == null) {
            return;
        }
        List<ReportContactModel> reportContactModelList = new ArrayList<>();

        if (tdOperatorModel.getEmergency_contact1_detail() != null && !TextUtils.isEmpty(tdOperatorModel.getEmergency_contact1_detail().getContact_number())) {
            reportContactModelList.add(tdOperatorModel.getEmergency_contact1_detail());
        }
        if (tdOperatorModel.getEmergency_contact2_detail() != null && !TextUtils.isEmpty(tdOperatorModel.getEmergency_contact2_detail().getContact_number())) {
            reportContactModelList.add(tdOperatorModel.getEmergency_contact2_detail());
        }
        if (tdOperatorModel.getEmergency_contact3_detail() != null && !TextUtils.isEmpty(tdOperatorModel.getEmergency_contact3_detail().getContact_number())) {
            reportContactModelList.add(tdOperatorModel.getEmergency_contact3_detail());
        }
        if (tdOperatorModel.getEmergency_contact4_detail() != null && !TextUtils.isEmpty(tdOperatorModel.getEmergency_contact4_detail().getContact_number())) {
            reportContactModelList.add(tdOperatorModel.getEmergency_contact4_detail());
        }
        if (tdOperatorModel.getEmergency_contact5_detail() != null && !TextUtils.isEmpty(tdOperatorModel.getEmergency_contact5_detail().getContact_number())) {
            reportContactModelList.add(tdOperatorModel.getEmergency_contact5_detail());
        }


        ReportContactPhoneNumAdapter contactPhoneNumAdapter = new ReportContactPhoneNumAdapter(reportContactModelList);


        contactPhoneNumAdapter.setEmptyView(getEmptyTextView("暂无紧急联系人"));
        tdOperatorLayout.recyclerContact.setLayoutManager(getLinearLayoutManager());
        tdOperatorLayout.recyclerContact.setAdapter(contactPhoneNumAdapter);
    }


    /**
     * 行业关注清单适配器
     *
     * @param data
     */
    private void initFocusOnAdapter(List<FocusOnParseShowModel> data) {

        mFocusonListAdapter = new FocusonListAdapter(data);

        focusOnLayout.recyclerFocus.setLayoutManager(getLinearLayoutManager());

        mFocusonListAdapter.setEmptyView(getEmptyTextView("暂无行业关注"));

        focusOnLayout.recyclerFocus.setAdapter(mFocusonListAdapter);

    }


    /**
     * 解析本地xml数据获取行业关注对照数据
     */
    public void getLocaFocusOnData(List<IndustryFocusOnListModel.DetailBean> data) {

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
        if (reportUserInfoModel == null) {
            return;
        }

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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
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

    public LinearLayoutManager getLinearLayoutManager() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        return linearLayoutManager;
    }

}
