package com.cdkj.borrowingmenber.model;

import android.util.SparseArray;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 人行验证问题
 * Created by cdkj on 2018/1/11.
 */

public class RhRuestionModel {

    private String question;//问题

    private String derivativecode;//解析网页获得，无使用意义，回答问题后需要回传

    private String businesstype;

    private String questionno;

    private String kbanum;

    private String answerresult; //用户的回答key

    private List<String> options;//回答

    private List<String> optionsKey;//回答对应key


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDerivativecode() {
        return derivativecode;
    }

    public void setDerivativecode(String derivativecode) {
        this.derivativecode = derivativecode;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }

    public String getQuestionno() {
        return questionno;
    }

    public void setQuestionno(String questionno) {
        this.questionno = questionno;
    }

    public String getKbanum() {
        return kbanum;
    }

    public void setKbanum(String kbanum) {
        this.kbanum = kbanum;
    }

    public String getAnswerresult() {
        return answerresult;
    }

    public void setAnswerresult(String answerresult) {
        this.answerresult = answerresult;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getOptionsKey() {
        return optionsKey;
    }

    public void setOptionsKey(List<String> optionsKey) {
        this.optionsKey = optionsKey;
    }
}
