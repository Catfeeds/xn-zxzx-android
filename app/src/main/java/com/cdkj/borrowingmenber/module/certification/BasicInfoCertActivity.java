package com.cdkj.borrowingmenber.module.certification;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.bigkoo.pickerview.OptionsPickerView;
import com.cdkj.baselibrary.api.BaseApiServer;
import com.cdkj.baselibrary.appmanager.MyCdConfig;
import com.cdkj.baselibrary.dialog.UITipDialog;
import com.cdkj.baselibrary.model.IsSuccessModes;
import com.cdkj.baselibrary.nets.BaseResponseListCallBack;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.BaseCertStepActivity;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.databinding.ActivityBasicInfoBinding;
import com.cdkj.borrowingmenber.model.KeyDataModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationStepHelper;
import com.lljjcoder.citypickerview.widget.CityPicker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;


/**
 * 基本信息认证
 * Created by cdkj on 2017/12/10.
 */

public class BasicInfoCertActivity extends BaseCertStepActivity {

    private ActivityBasicInfoBinding mBinding;

    private List<KeyDataModel> mEducations = new ArrayList<>();//学历数据
    private String mEducationCode;//学历code
    private OptionsPickerView mEducationsPicker;//学历选择


    private List<KeyDataModel> mMarriages = new ArrayList<>();//婚姻数据
    private String mMarriagesCode;//婚姻code
    private OptionsPickerView mMarriagesPicker;//婚姻选择


    private List<KeyDataModel> mJobs = new ArrayList<>();//职业数据
    private String mJobCode;//职业code
    private OptionsPickerView mJobsPicker;//职业选择


    private List<KeyDataModel> mFamilys = new ArrayList<>();//亲属关系数据
    private String mFamilyCode;//亲属关系
    private OptionsPickerView mFamilysPicker;//亲属关系选择选择

    private List<KeyDataModel> mSocietys = new ArrayList<>();//社会关系数据
    private String mSocietysCode;//社会关系code
    private OptionsPickerView mSocietysPicker;//社会关系选择


    private List<KeyDataModel> mLiveDays = new ArrayList<>();//居住时长数据
    private String mLiveDaysCode;
    private OptionsPickerView mLiveDaysPicker;

    private List<KeyDataModel> mInMoneys = new ArrayList<>();//收入数据
    private String mInMoneyCode;//收入code
    private OptionsPickerView mInMoneyPicker;//收入选择

    private CityPicker mCityPicker;//城市选择

    private boolean isSelectLiveCity;//用于判断选择的时工作城市还是居住城市  true  居住城市


    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_basic_info, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {
        super.afterCreate(savedInstanceState);
        mBaseBinding.titleView.setMidTitle("基本信息认证");
        initPickerView();
        initCityPicker();
        initListener();
    }

    private void initPickerView() {

        mEducationsPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            KeyDataModel keyDataModel = mEducations.get(options1);
            if (keyDataModel == null) return;

            mEducationCode = keyDataModel.getDkey();
            mBinding.rowStudySing.setTextCenter(keyDataModel.getDvalue());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();

        mMarriagesPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            KeyDataModel keyDataModel = mMarriages.get(options1);
            if (keyDataModel == null) return;

            mMarriagesCode = keyDataModel.getDkey();
            mBinding.rowMarriage.setTextCenter(keyDataModel.getDvalue());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();

        mJobsPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            if (mJobs.get(options1) == null) return;

            mJobCode = mJobs.get(options1).getDkey();
            mBinding.rowJob.setTextCenter(mJobs.get(options1).getDvalue());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();

        mFamilysPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            if (mFamilys.get(options1) == null) return;
            mFamilyCode = mFamilys.get(options1).getDkey();
            mBinding.rowFamilyRelation.setTextCenter(mFamilys.get(options1).getDvalue());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();

        mSocietysPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            if (mSocietys.get(0) == null) return;
            mSocietysCode = mSocietys.get(options1).getDkey();
            mBinding.rowSocietyRelation.setTextCenter(mSocietys.get(options1).getDvalue());
        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();

        mLiveDaysPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            KeyDataModel keyDataModel = mLiveDays.get(options1);
            if (keyDataModel == null) return;

            mLiveDaysCode = keyDataModel.getDkey();
            mBinding.rowLiveDays.setTextCenter(keyDataModel.getDvalue());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();


        mInMoneyPicker = new OptionsPickerView.Builder(this, (options1, options2, options3, v) -> {
            if (mInMoneys.get(options1) == null) return;

            mInMoneyCode = mInMoneys.get(options1).getDkey();
            mBinding.rowJobMoney.setTextCenter(mInMoneys.get(options1).getDvalue());

        }).setContentTextSize(16).setLineSpacingMultiplier(4).build();


    }

    private void initListener() {

        mBinding.btnNext.setOnClickListener(v -> {
            if (!checkInput() || mCertListModel == null) {
                return;
            }
            dataSubmit();

        });

        mBinding.rowStudySing.setOnClickListener(v -> {//学历选择
            showEducationPicker();
        });

        mBinding.rowMarriage.setOnClickListener(v -> { //婚姻选择
            showMarriagesicker();
        });

        mBinding.rowCity.setOnClickListener(v -> {//城市选择
            showCityPicker(true);
        });
        mBinding.rowJob.setOnClickListener(v -> {//工作选择
            showJopPicker();
        });

        mBinding.rowFamilyRelation.setOnClickListener(v -> { //亲属关系
            showFamilyPicker();
        });

        mBinding.rowSocietyRelation.setOnClickListener(v -> { //家庭关系
            showSocietyPicker();
        });

        mBinding.rowLiveDays.setOnClickListener(v -> { //居住时长
            showLiveDaysPicker();
        });
        mBinding.rowJobCity.setOnClickListener(v -> {
            showCityPicker(false);
        });

        mBinding.rowJobMoney.setOnClickListener(v -> {
            showMoneyPicker();
        });

    }

    /**
     * 提交数据
     */
    private void dataSubmit() {
        showLoadingDialog();
        mSubscription.add(Observable.just(getRequestMap())
                .subscribeOn(Schedulers.newThread())
                .map(map -> StringUtils.getJsonToString(map))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(str -> {
                    Call call = RetrofitUtils.createApi(BaseApiServer.class).successRequest("805253", str);
                    addCall(call);
                    call.enqueue(new BaseResponseModelCallBack<IsSuccessModes>(this) {
                        @Override
                        protected void onSuccess(IsSuccessModes data, String SucMessage) {
                            if (data.isSuccess()) {
                                //通过验证后检测下一步 重新进行检测  这个步骤不在进行验证
//                                mCertListModel.setF3("N");
//                                mReportModel.setF3("N");

//                                CertificationStepHelper.checkStartStep(BasicInfoCertActivity.this, mCertListModel, mReportModel);//检测并打开下一步
                                //通过验证后检测下一步 重新进行检测  这个步骤不在进行验证
                                mCertListModel.setF3("N");
                                CertificationStepHelper.checkRequest(BasicInfoCertActivity.this, mCertListModel);
                                finish();
                            } else {
                                UITipDialog.showFall(BasicInfoCertActivity.this, "基本信息认证失败，请重新认证");
                            }
                        }

                        @Override
                        protected void onFinish() {
                            disMissLoading();
                        }
                    });

                }, throwable -> {
                    disMissLoading();
                }));
    }

    private Map getRequestMap() {
        Map map = RetrofitUtils.getRequestMap();
        map.put("address", mBinding.editAddress.getText().toString());
        map.put("childrenNum", mBinding.editChild.getText().toString());
        map.put("companyAddress", mBinding.editJobAddress.getText().toString());
        map.put("companyProvinceCity", mBinding.rowJobCity.getCenterText());
        map.put("company", mBinding.editJobName.getText().toString());
        map.put("education", mEducationCode);
        map.put("email", mBinding.editEmail.getText().toString());
        map.put("qq", mBinding.editQq.getText().toString());
        map.put("familyMobile", mBinding.editFamilyPhone.getText().toString());
        map.put("familyName", mBinding.editFamilyName.getText().toString());
        map.put("familyRelation", mFamilyCode);
        map.put("income", mInMoneyCode);
        map.put("liveTime", mLiveDaysCode);
        map.put("marriage", mMarriagesCode);
        map.put("occupation", mJobCode);
        map.put("phone", mBinding.editJobPhone.getText().toString());
        map.put("provinceCity", mBinding.rowCity.getCenterText());
        map.put("searchCode", mCertListModel.getCode());
        map.put("societyName", mBinding.editSocietysName.getText().toString());
        map.put("societyRelation", mSocietysCode);
        map.put("societyMobile", mBinding.editSocietysPhone.getText().toString());
        return map;
    }

    /**
     * 输入验证
     *
     * @return
     */
    private boolean checkInput() {

        if (TextUtils.isEmpty(mEducationCode)) {
            UITipDialog.showInfo(this, "请选择学历");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editSchool.getText().toString())) {
            UITipDialog.showInfo(this, "请输入毕业院校");
            return false;
        }
        if (TextUtils.isEmpty(mMarriagesCode)) {
            UITipDialog.showInfo(this, "请选择婚姻状况");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editChild.getText().toString())) {
            UITipDialog.showInfo(this, "请输入子女个数");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.rowCity.getCenterText())) {
            UITipDialog.showInfo(this, "请选择现居住地址");
            return false;
        }

        if (TextUtils.isEmpty(mBinding.editAddress.getText().toString())) {
            UITipDialog.showInfo(this, "请输入详细地址地址");
            return false;
        }

        if (TextUtils.isEmpty(mLiveDaysCode)) {
            UITipDialog.showInfo(this, "请选择居住年限");
            return false;
        }
        if (TextUtils.isEmpty(mJobCode)) {
            UITipDialog.showInfo(this, "请选择职业身份");
            return false;
        }
        if (TextUtils.isEmpty(mInMoneyCode)) {
            UITipDialog.showInfo(this, "请选择月收入");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.rowJobCity.getCenterText())) {
            UITipDialog.showInfo(this, "请选择单位省份");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editJobAddress.getText().toString())) {
            UITipDialog.showInfo(this, "请选择单位地址");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editJobName.getText().toString())) {
            UITipDialog.showInfo(this, "请选择单位名称");
            return false;
        }

        if (TextUtils.isEmpty(mFamilyCode)) {
            UITipDialog.showInfo(this, "请选择亲属关系");
            return false;
        }

        if (TextUtils.isEmpty(mBinding.editFamilyName.getText().toString())) {
            UITipDialog.showInfo(this, "请输入亲属姓名");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editFamilyPhone.getText().toString())) {
            UITipDialog.showInfo(this, "请输入亲属手机号");
            return false;
        }

        if (TextUtils.isEmpty(mSocietysCode)) {
            UITipDialog.showInfo(this, "请选择社会关系");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editSocietysName.getText().toString())) {
            UITipDialog.showInfo(this, "请输入社会关系姓名");
            return false;
        }
        if (TextUtils.isEmpty(mBinding.editSocietysPhone.getText().toString())) {
            UITipDialog.showInfo(this, "请输入社会关系手机号");
            return false;
        }

        return true;

    }

    private void showMoneyPicker() {
        if (mInMoneyPicker == null || mInMoneys == null) return;
        if (mInMoneys.isEmpty()) {
            getInMoneyData();
            return;
        }
        mInMoneyPicker.setPicker(mInMoneys);
        mInMoneyPicker.show();
    }

    private void showCityPicker(boolean isSelectLiveCity) {
        if (mCityPicker == null) return;
        this.isSelectLiveCity = isSelectLiveCity;
        mCityPicker.show();
    }

    private void showLiveDaysPicker() {
        if (mLiveDays == null || mLiveDaysPicker == null) return;
        if (mLiveDays.isEmpty()) {
            getLivesData();
            return;
        }
        mLiveDaysPicker.setPicker(mLiveDays);
        mLiveDaysPicker.show();
    }

    private void showSocietyPicker() {
        if (mSocietysPicker == null || mSocietys == null) return;
        if (mSocietys.isEmpty()) {
            getSocietysData();
            return;
        }
        mSocietysPicker.setPicker(mSocietys);
        mSocietysPicker.show();
    }

    private void showFamilyPicker() {
        if (mFamilysPicker == null || mFamilys == null) return;
        if (mFamilys.isEmpty()) {
            getFamilyData();
            return;
        }
        mFamilysPicker.setPicker(mFamilys);
        mFamilysPicker.show();
    }

    private void showJopPicker() {
        if (mJobsPicker == null || mJobs == null) return;
        if (mJobs.isEmpty()) {
            getJobData();
            return;
        }
        mJobsPicker.setPicker(mJobs);
        mJobsPicker.show();
    }

    private void showMarriagesicker() {
        if (mMarriages == null || mMarriages == null) return;
        if (mMarriages.isEmpty()) {
            getMarriagesData();
            return;
        }
        mMarriagesPicker.setPicker(mMarriages);
        mMarriagesPicker.show();
    }

    private void showEducationPicker() {
        if (mEducationsPicker == null || mEducations == null) return;

        if (mEducations.isEmpty()) {            //如果刚开始没有获取到学历数据 则重新获取
            getEducationData();
            return;
        }
        mEducationsPicker.setPicker(mEducations);
        mEducationsPicker.show();
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
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                if (data == null) {
                    return;
                }
                mFamilys.clear();
                mFamilys.addAll(data);
                if (mFamilys.isEmpty()) {
                    return;
                }
                showFamilyPicker();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
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
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                if (data == null) {
                    return;
                }
                mSocietys.clear();
                mSocietys.addAll(data);
                if (mSocietys.isEmpty()) {
                    return;
                }
                showSocietyPicker();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
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
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                if (data == null) {
                    return;
                }
                mJobs.clear();
                mJobs.addAll(data);

                if (mJobs.isEmpty()) {
                    return;
                }

                showJopPicker();

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }

    /**
     * 获取学历数据
     *
     * @param
     */
    public void getEducationData() {
        Map<String, String> map = new HashMap<>();
        map.put("companyCode", MyCdConfig.COMPANYCODE);
        map.put("systemCode", MyCdConfig.SYSTEMCODE);
        map.put("parentKey", "education");
        Call call = RetrofitUtils.createApi(MyApiServer.class).getKeyData("805906", StringUtils.getJsonToString(map));
        addCall(call);
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                if (data == null) {
                    return;
                }
                mEducations.clear();
                mEducations.addAll(data);

                if (mEducations.isEmpty()) {
                    return;
                }
                showEducationPicker();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
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
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                if (data == null) {
                    return;
                }
                mMarriages.clear();
                mMarriages.addAll(data);
                if (mMarriages.isEmpty()) {
                    return;
                }
                showMarriagesicker();

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }


    /**
     * 城市选择
     */
    private void initCityPicker() {
        mCityPicker = new CityPicker.Builder(BasicInfoCertActivity.this)
                .textSize(18)
                .titleBackgroundColor("#ffffff")
                .titleTextColor("#ffffff")
                .backgroundPop(0xa0000000)
                .confirTextColor("#3DA3FF")
                .cancelTextColor("#3DA3FF")
                .province("北京市")
                .city("北京市")
                .district("昌平区")
                .textColor(Color.parseColor("#000000"))
                .provinceCyclic(true)
                .cityCyclic(false)
                .districtCyclic(false)
                .visibleItemsCount(7)
                .itemPadding(10)
                .onlyShowProvinceAndCity(false)
                .build();


        //监听方法，获取选择结果
        mCityPicker.setOnCityItemClickListener(new CityPicker.OnCityItemClickListener() {
            @Override
            public void onSelected(String... citySelected) {
                if (isSelectLiveCity) {
                    mBinding.rowCity.setTextCenter(citySelected[0] + " " + citySelected[1] + " " + citySelected[2]);
                } else {
                    mBinding.rowJobCity.setTextCenter(citySelected[0] + " " + citySelected[1] + " " + citySelected[2]);
                }

            }

            @Override
            public void onCancel() {

            }
        });
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
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {
                if (data == null) {
                    return;
                }
                mLiveDays.clear();
                mLiveDays.addAll(data);
                if (mLiveDays.isEmpty()) {
                    return;
                }
                showLiveDaysPicker();

            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
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
        showLoadingDialog();
        call.enqueue(new BaseResponseListCallBack<KeyDataModel>(this) {

            @Override
            protected void onSuccess(List<KeyDataModel> data, String SucMessage) {

                if (data == null) {
                    return;
                }
                mInMoneys.clear();
                mInMoneys.addAll(data);
                if (mInMoneys.isEmpty()) {
                    return;
                }
                showMoneyPicker();
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });
    }

}
