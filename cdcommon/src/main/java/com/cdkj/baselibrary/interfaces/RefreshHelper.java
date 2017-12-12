package com.cdkj.baselibrary.interfaces;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;

import com.cdkj.baselibrary.databinding.EmptyViewBinding;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李先俊 on 2017/10/15.
 */
//TODO 刷新辅助类优化 刷新动作监听分离 去除SmartRefreshLayout 去除EmptyViewBinding() 方法 loadDeflutEmptyView()方法
public class RefreshHelper<T> {

    private RefreshInterface mRefreshInterface;//刷新接口

    public BaseQuickAdapter mAdapter;//数据适配器

    private SmartRefreshLayout mRefreshLayout;

    private RecyclerView mRecyclerView;

    private int mPageIndex; //分页下标

    private int mLimit;//数据大小

    private List<T> mDataList;//数据

    private Context mContext;

    private String mErrorInfo;//错误提醒文本

    private
    @DrawableRes
    int mErrorImg;//错误提醒图片


    public void setErrorInfo(String mErrorInfo) {
        this.mErrorInfo = mErrorInfo;
    }

    public void setErrorImg(int mErrorImg) {
        this.mErrorImg = mErrorImg;
    }

    public int getmPageIndex() {
        return mPageIndex;
    }

    public int getmLimit() {
        return mLimit;
    }

    public List<T> getmDataList() {
        return mDataList;
    }

    public BaseQuickAdapter getmAdapter() {
        return mAdapter;
    }

    public SmartRefreshLayout getmRefreshLayout() {
        return mRefreshLayout;
    }

    public RecyclerView getmRecyclerView() {
        return mRecyclerView;
    }

    public EmptyViewBinding mEmptyBinding;

    public RefreshHelper(Context context, RefreshInterface mRefreshInterface) {
        this.mRefreshInterface = mRefreshInterface;
        this.mContext = context;
    }


    /**
     * 初始化
     *
     * @param pageIndex 分页下标
     * @param limit     分页个数
     */
    public void init(int pageIndex, int limit) {


        mRefreshLayout = mRefreshInterface.getRefreshLayout();
        mRecyclerView = mRefreshInterface.getRecyclerView();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        if (mRefreshInterface.loadDeflutEmptyView()) {
            mEmptyBinding = mRefreshInterface.getEmptyViewBindin();
        }

        mPageIndex = pageIndex;//分页下标

        mLimit = limit;//分页数量

        mDataList = new ArrayList<T>();

        mAdapter = mRefreshInterface.getAdapter(mDataList);

        if (mAdapter != null) {
            View tv = new View(mContext); //先设置 不显示任何东西的 emptyView
            mAdapter.setEmptyView(tv);
            mRecyclerView.setAdapter(mAdapter);
        }
        initRefreshLayout();

    }


    /**
     * 初始化刷新加载
     */
    private void initRefreshLayout() {

        if (mRefreshLayout == null) return;

        mRefreshLayout.setEnableLoadmoreWhenContentNotFull(true);//不满一行启动上啦加载

        mRefreshLayout.setEnableAutoLoadmore(false);//禁用惯性

        mRefreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) { //刷新
                onMRefresh(1, mLimit, false);
                mRefreshInterface.onRefresh(1, mLimit);
            }

            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {//加载
                if (mDataList.size() > 0) {
                    mPageIndex++;
                }
                onMLoadMore(mPageIndex, mLimit);
                mRefreshInterface.onLoadMore(mPageIndex, mLimit);
            }
        });
    }

    //执行默认刷新 mPageIndex变为一
    public void onDefaluteMRefresh(boolean isShowDialog) {
        mPageIndex = 1;
        mRefreshInterface.getListDataRequest(mPageIndex, mLimit, isShowDialog);
    }

    //执行默认刷新 mPageIndex++
    public void onDefaluteMLoadMore(boolean isShowDialog) {
        if (mDataList.size() > 0) {
            mPageIndex++;
        }
        mRefreshInterface.getListDataRequest(mPageIndex, mLimit, isShowDialog);
    }

    //刷新
    public void onMRefresh(int pageindex, int limit, boolean isShowDialog) {
        mPageIndex = pageindex;
        mLimit = limit;
        mRefreshInterface.getListDataRequest(pageindex, limit, isShowDialog);

    }

    //加载
    public void onMLoadMore(int pageIndex, int limit) {
        mPageIndex = pageIndex;
        mLimit = limit;
        mRefreshInterface.getListDataRequest(pageIndex, limit, false);
    }


    //加载错误布局
    public void loadError(String str) {

        if (mRefreshLayout != null) {
            if (mRefreshLayout.isRefreshing()) { //停止刷新
                mRefreshLayout.finishRefresh();
            }
            if (mRefreshLayout.isLoading()) {//停止加载
                mRefreshLayout.finishLoadmore();
            }
        }

        if (mRefreshInterface.loadDeflutEmptyView() && mEmptyBinding != null && mDataList.isEmpty()) {
            if (TextUtils.isEmpty(str)) {
                mEmptyBinding.tv.setText("加载错误");
            } else {
                mEmptyBinding.tv.setText(str);
            }
            mEmptyBinding.img.setVisibility(View.GONE);
            if (mAdapter != null) mAdapter.setEmptyView(mEmptyBinding.getRoot());
            if (mRefreshLayout != null && mRefreshLayout.isLoading())
                mRefreshLayout.finishLoadmore();

        } else if (mRefreshInterface.getEmptyView() != null && mDataList.isEmpty()) {
            if (mAdapter != null) mAdapter.setEmptyView(mRefreshInterface.getEmptyView());
        }

    }


    /**
     * 设置加载数据 实现分页逻辑
     *
     * @param datas
     */
    public void setData(List<T> datas) {

        if (mRefreshLayout != null) {
            if (mRefreshLayout.isRefreshing()) {
                mRefreshLayout.finishRefresh();
            }
            if (mRefreshLayout.isLoading()) {
                mRefreshLayout.finishLoadmore();
            }
        }

        if (mPageIndex == 1) {         //如果当前加载的是第一页数据
            if (datas != null) {
                mDataList.clear();
                mDataList.addAll(datas);
                if (mAdapter != null) {
                    mAdapter.notifyDataSetChanged();
                }
            }

        } else if (mPageIndex > 1) {
            if (datas == null || datas.size() <= 0) {
                mPageIndex--;
            } else {
                mDataList.addAll(datas);

                if (mAdapter != null) {
                    mAdapter.notifyDataSetChanged();
                }
            }
        }
        if (mRefreshInterface.loadDeflutEmptyView() && mEmptyBinding != null && mDataList.isEmpty()) {
            mEmptyBinding.tv.setText(mErrorInfo);
            if (mErrorImg <= 0) {
                mEmptyBinding.img.setVisibility(View.GONE);
            } else {
                mEmptyBinding.img.setImageResource(mErrorImg);
                mEmptyBinding.img.setVisibility(View.VISIBLE);
            }
            mEmptyBinding.img.setVisibility(View.VISIBLE);
            if (mAdapter != null) mAdapter.setEmptyView(mEmptyBinding.getRoot());

        } else if (mRefreshInterface.getEmptyView() != null && mDataList.isEmpty()) {
            if (mAdapter != null) mAdapter.setEmptyView(mRefreshInterface.getEmptyView());
        }
    }

    /**
     * 防止内存泄漏
     */
    public void clear() {
        mContext = null;
    }

}
