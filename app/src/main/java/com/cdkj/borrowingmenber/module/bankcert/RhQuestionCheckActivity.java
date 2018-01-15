package com.cdkj.borrowingmenber.module.bankcert;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.appmanager.EventTags;
import com.cdkj.baselibrary.base.AbsBaseLoadActivity;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.AppUtils;
import com.cdkj.baselibrary.utils.LogUtil;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.adapters.RhRuestionAdapter;
import com.cdkj.borrowingmenber.databinding.ActivityRhQuestionCheckBinding;
import com.cdkj.borrowingmenber.databinding.LayoutQuestionTopTimeBinding;
import com.cdkj.borrowingmenber.model.RhRuestionModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.bankcert.BaseRhCertCallBack;
import com.cdkj.borrowingmenber.weiget.bankcert.RhHelper;

import org.greenrobot.eventbus.EventBus;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;

/**
 * 人行问题验证
 * Created by cdkj on 2018/1/10.
 */

public class RhQuestionCheckActivity extends AbsBaseLoadActivity {

    private String mQuestionToken;//用于请求问题token
    private String mSubmitQuestionToken = "";//用于提交token
    private List<RhRuestionModel> mRuestionList;//问题列表
    private RhRuestionAdapter rhRuestionAdapter;//问题适配器
    private LayoutQuestionTopTimeBinding mTimeLayout;

    public static void open(Context context, String token) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, RhQuestionCheckActivity.class);
        intent.putExtra("token", token);
        context.startActivity(intent);
    }

    private ActivityRhQuestionCheckBinding mBinding;

    @Override
    public View addMainView() {
        mBinding = DataBindingUtil.inflate(getLayoutInflater(), R.layout.activity_rh_question_check, null, false);
        return mBinding.getRoot();
    }

    @Override
    public void afterCreate(Bundle savedInstanceState) {

        mBaseBinding.titleView.setMidTitle("回答问题");

        if (getIntent() != null) {
            mQuestionToken = getIntent().getStringExtra("token");
        }

        mBinding.btnSubmit.setOnClickListener(v -> {
            submitQuestion();
        });
        initAdapter();
        getRuestionRequest();
//        rxParseQuestion(null);
    }

    /**
     * 判断用户是否登录
     *
     * @return
     */
    private boolean checkHasAnswered() {
        for (RhRuestionModel rhRuestionModel : mRuestionList) {

            if (rhRuestionModel == null) continue;

            if (TextUtils.isEmpty(rhRuestionModel.getAnswerresult())) {
                showToast("必须对所有的题作答！");
                return false;
            }
            LogUtil.E("_______" + rhRuestionModel.getAnswerresult());
        }
        return true;
    }

    private void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        mBinding.recyclerQuestion.setLayoutManager(linearLayoutManager);
        mRuestionList = new ArrayList<>();
        rhRuestionAdapter = new RhRuestionAdapter(mRuestionList);
        mTimeLayout = DataBindingUtil.inflate(getLayoutInflater(), R.layout.layout_question_top_time, null, false);
        rhRuestionAdapter.addHeaderView(mTimeLayout.getRoot());
        rhRuestionAdapter.setHeaderAndEmpty(true);
        mBinding.recyclerQuestion.setAdapter(rhRuestionAdapter);
    }


    /**
     * 获取问题
     */
    public void getRuestionRequest() {

        if (TextUtils.isEmpty(mQuestionToken)) {
            showToast("系统繁忙,请稍后再试");
            finish();
            return;
        }
        showLoadingDialog();
        Map<String, String> map = new HashMap<>();
        map.put("org.apache.struts.taglib.html.TOKEN", mQuestionToken);
        map.put("method", "checkishasreport");
        map.put("authtype", RhHelper.reportCheckType); //id radiobutton2 3 银行卡验证  id  radiobutton1 1 数字正式验证 id  radiobutton3 2 问题验证
        map.put("ApplicationOption", RhHelper.reportType);

        Call call = RetrofitUtils.createApi(MyApiServer.class).getCheckRuestion(map);

        addCall(call);

        call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
            @Override
            protected void onSuccess(Document doc) {
                mSubmitQuestionToken = RhHelper.checkGetToken(doc);
                rxParseQuestion(doc);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });


    }

    /**
     * 解析问题
     *
     * @param doc
     */
    private void rxParseQuestion(Document doc) {
        showLoadingDialog();

        mSubscription.add(io.reactivex.Observable.just("")
                .observeOn(Schedulers.newThread())
                .map(s -> parseQuestion(doc))
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    disMissLoading();
                })
                .subscribe(qus -> {
                    mRuestionList.clear();
                    mRuestionList.addAll(qus);
                    rhRuestionAdapter.notifyDataSetChanged();
                    startgetAnswerreTimer();
                }, throwable -> {

                }));
    }


    /**
     * 开启答题定时器
     */
    private void startgetAnswerreTimer() {

        int mOutTime = 600;

        mSubscription.add(Observable.interval(0, 1, TimeUnit.SECONDS, AndroidSchedulers.mainThread())    // 定时器 600秒（10分钟）后停止答题
                .take(mOutTime)
                .observeOn(AndroidSchedulers.mainThread())
                .doOnComplete(() -> {
                    if (!AppUtils.isActivityExist(this)) { //如果界面已经销毁
                        return;
                    }
                    mBinding.btnSubmit.setEnabled(false);//禁用提交按钮
                    mBinding.btnSubmit.setVisibility(View.GONE);
                    showSureDialog(getString(R.string.rh_question_time_out), view -> {
                        finish();
                    });
                })
                .map(aLong -> mOutTime - aLong) //获取剩余秒数
                .map(aLong -> { //将剩余秒数转换为xx分xx秒
                    return StringUtils.formatInteger(Math.floor(aLong / 60)) + "分" + StringUtils.frontCompWithZoreString(aLong % 60, 2) + "秒";
                })
                .subscribe(time -> {
                    //显示剩余时间
                    mTimeLayout.tvTitle.setText(Html.fromHtml(String.format(getString(R.string.rh_question_time_) + "<font color='#FF0000'>%s</font>" + getString(R.string.rh_question_time_2), mRuestionList.size(), time)));

                }, throwable -> {
                    LogUtil.E("" + throwable);
                }));
    }

    /**
     * 解析问题
     */
    private List<RhRuestionModel> parseQuestion(Document document) {

        String st = AppUtils.readAssetsTxt(this, "test.txt");
        document = Jsoup.parse(st);

        Elements liEls = document.select("ul > li"); //问题和回答是包含在li标签里的

        ArrayList<RhRuestionModel> ruestionList = new ArrayList<>();

        for (int i = 0; i < liEls.size(); i++) {

            RhRuestionModel rhRuestionModel = new RhRuestionModel();

            rhRuestionModel.setQuestion(parseInputValueByAttr(document, "[name=kbaList[" + i + "].question]"));//解析问题

            if (TextUtils.isEmpty(rhRuestionModel.getQuestion())) {   //如果没有解析到问题
                continue;
            }

            rhRuestionModel.setOptionsKey(parseOptionsKey(document, i));//解析问题key

            rhRuestionModel.setOptions(parseOptions(document, rhRuestionModel.getOptionsKey().size(), i));//解析问题

            rhRuestionModel.setDerivativecode(parseInputValueByAttr(document, "[name=kbaList[" + i + "].derivativecode]")); //其它回传参数
            rhRuestionModel.setBusinesstype(parseInputValueByAttr(document, "[name=kbaList[" + i + "].businesstype]"));
            rhRuestionModel.setQuestionno(parseInputValueByAttr(document, "[name=kbaList[" + i + "].questionno]"));
            rhRuestionModel.setKbanum(parseInputValueByAttr(document, "[name=kbaList[" + i + "].kbanum]"));
            ruestionList.add(rhRuestionModel);
        }


        return ruestionList;
    }

    /**
     * 解析问题
     *
     * @param document
     * @param i
     * @return
     */
    @NonNull
    private List<String> parseOptions(Document document, int keySize, int i) {
        List<String> arrays2 = new ArrayList<>();
        for (int j = 0; j < keySize; j++) {
            Elements optionsElements = document.select("[name=kbaList[" + i + "].options" + (j + 1) + "]");      //获取问题对应回答
            arrays2.add(optionsElements.attr("value"));
        }
        return arrays2;
    }

    /**
     * 解析问题key
     *
     * @param document
     * @param i
     * @return
     */
    @NonNull
    private List<String> parseOptionsKey(Document document, int i) {
        Elements elements2 = document.select("[name=kbaList[" + i + "].options]"); //获取问题对应回答key
        List<String> arrays = new ArrayList<>();
        for (Element element2 : elements2) {
            arrays.add(element2.attr("value"));
        }
        return arrays;
    }

    /**
     * 根据属性获取input标签的value
     *
     * @param document
     * @param
     */
    private String parseInputValueByAttr(Document document, String attr) {
        Elements questionElements = document.select(attr);

        if (questionElements == null) {
            return "";
        }

        for (Element qe : questionElements) {
            return qe.attr("value");
        }
        return "";
    }


    /**
     * 回答问题
     */
    public void submitQuestion() {

        if (!checkHasAnswered()) {//检测所有问题是否回答
            return;
        }
        if (TextUtils.isEmpty(mSubmitQuestionToken)) {
            showToast(getString(R.string.rh_anw_question_error));
            return;
        }
        showLoadingDialog();
        mSubscription.add(io.reactivex.Observable.just("")
                .observeOn(Schedulers.newThread())
                .map(s -> getSubmitMap())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally(() -> {
                    disMissLoading();
                })
                .subscribe(qus -> {

                    Call call = RetrofitUtils.createApi(MyApiServer.class).submitQuestion(qus);

                    addCall(call);

                    call.enqueue(new BaseRhCertCallBack(this, BaseRhCertCallBack.DOCTYPE) {
                        @Override
                        protected void onSuccess(Document doc) {

                            if (StringUtils.contains(doc.text(), getString(R.string.rh_question_check_1))
                                    || StringUtils.contains(doc.text(), getString(R.string.rh_question_check_2))
                                    || StringUtils.contains(doc.text(), getString(R.string.rh_question_check_3))
                                    ) {
                                EventBus.getDefault().post(EventTags.RhQUESTIONFINISH); //结束上一页
                                RhQuestionDoneActivity.open(RhQuestionCheckActivity.this);
                                finish();
                            } else {
                                LogUtil.E("人行问题回答失败");
                                showToast(getString(R.string.rh_anw_question_error));
                            }

                        }

                        @Override
                        protected void onFinish() {
                            disMissLoading();
                        }
                    });

                }, throwable -> {

                }));
    }

    /**
     * 获取组合的提交问题参数
     *
     * @return
     */
    private Map<String, String> getSubmitMap() {
        Map<String, String> map = new HashMap<>();

        map.put("org.apache.struts.taglib.html.TOKEN", mSubmitQuestionToken);
        map.put("method", "");//不用提交
        map.put("authtype", RhHelper.reportCheckType);
        map.put("ApplicationOption", RhHelper.reportType);

        for (int i = 0; i < mRuestionList.size(); i++) {

            RhRuestionModel rhRuestionModel = mRuestionList.get(i);
            if (rhRuestionModel == null) continue;
            map.put("kbaList[" + i + "].derivativecode", rhRuestionModel.getDerivativecode());
            map.put("kbaList[" + i + "].businesstype", rhRuestionModel.getBusinesstype());
            map.put("kbaList[" + i + "].questionno", rhRuestionModel.getQuestionno());
            map.put("kbaList[" + i + "].kbanum", rhRuestionModel.getKbanum());
            map.put("kbaList[" + i + "].question", rhRuestionModel.getQuestion());
            map.put("kbaList[" + i + "].answerresult", rhRuestionModel.getAnswerresult()); //回答的答案key
            map.put("kbaList[" + i + "].options", rhRuestionModel.getAnswerresult());//回答的答案key
            for (int j = 0; j < rhRuestionModel.getOptions().size(); j++) {
                map.put("kbaList[" + i + "].options" + (j + 1), rhRuestionModel.getOptions().get(j)); //问题答案
            }
        }

        return map;
    }

}




