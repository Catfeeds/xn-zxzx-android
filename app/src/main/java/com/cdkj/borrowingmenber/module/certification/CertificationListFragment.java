package com.cdkj.borrowingmenber.module.certification;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cdkj.baselibrary.api.ResponseInListModel;
import com.cdkj.baselibrary.base.BaseLazyFragment;
import com.cdkj.baselibrary.interfaces.BaseRefreshCallBack2;
import com.cdkj.baselibrary.interfaces.RefreshHelper2;
import com.cdkj.baselibrary.nets.BaseResponseModelCallBack;
import com.cdkj.baselibrary.nets.RetrofitUtils;
import com.cdkj.baselibrary.utils.StringUtils;
import com.cdkj.borrowingmenber.R;
import com.cdkj.borrowingmenber.adapters.CertListAdapter;
import com.cdkj.borrowingmenber.databinding.FragmentCertificationListBinding;
import com.cdkj.borrowingmenber.model.CertListModel;
import com.cdkj.borrowingmenber.module.api.MyApiServer;
import com.cdkj.borrowingmenber.weiget.CertificationStepHelper;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;

/**
 * 调查单列表界面
 * Created by cdkj on 2017/12/9.
 */

public class CertificationListFragment extends BaseLazyFragment {

    private FragmentCertificationListBinding mBinding;


    private RefreshHelper2<CertListModel> mRefreshHelper; //刷新辅助类

    public static CertificationListFragment getInstance() {
        CertificationListFragment fragment = new CertificationListFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //TODO inflater问题
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_certification_list, null, false);
        initRefresh();

        return mBinding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mBinding != null) {
            mRefreshHelper.onDefaluteMRefresh(true);
        }
    }

    /**
     * 初始化刷新相关
     */
    private void initRefresh() {
        mRefreshHelper = new RefreshHelper2<CertListModel>(mActivity, new BaseRefreshCallBack2<CertListModel>() {
            @Override
            public SmartRefreshLayout getRefreshLayout() {
                return mBinding.listLayout.refreshLayout;
            }

            @Override
            public RecyclerView getRecyclerView() {
                return mBinding.listLayout.rv;
            }

            @Override
            public BaseQuickAdapter getAdapter(List<CertListModel> listData) {
                return createAdapter(listData);
            }

            @Override
            public void getListDataRequest(int pageindex, int limit, boolean isShowDialog) {
                getListData(pageindex, limit, isShowDialog);
            }
        });

        mRefreshHelper.init(15);

    }

    @Override
    protected void lazyLoad() {
//        if (mBinding == null || mRefreshHelper == null) {
//            return;
//        }
//        mRefreshHelper.onDefaluteMRefresh(false);
    }

    @Override
    protected void onInvisible() {

    }

    /**
     * 创建适配器
     *
     * @return
     */
    private BaseQuickAdapter createAdapter(List<CertListModel> listData) {

        CertListAdapter adapter = new CertListAdapter(listData);

        adapter.setOnItemClickListener((adapter1, view, position) -> {

            CertListModel certListModel = adapter.getItem(position);

            if (certListModel == null) {
                return;
            }
//            CertificationStepHelper.openStepPage(mActivity, TdOperatorCertActivity.class, certListModel, null);
            CertificationStepHelper.checkRequest(mActivity, certListModel);
        });

        return adapter;
    }


    /**
     * 获取list列表数据
     *
     * @param pageindex
     * @param limit
     * @param isShowDialog
     */
    public void getListData(int pageindex, int limit, boolean isShowDialog) {

        Map map = RetrofitUtils.getRequestMap();

        map.put("limit", limit + "");
        map.put("start", pageindex + "");
        map.put("orderColumn", "create_datetime");
        map.put("orderDir", "desc");
        map.put("statusList", getStatusList());
//        map.put("status", "0,1");

        if (isShowDialog) {
            showLoadingDialog();
        }

        Call call = RetrofitUtils.createApi(MyApiServer.class).getWaiteCertList("805280", StringUtils.getJsonToString(map));

        addCall(call);

        call.enqueue(new BaseResponseModelCallBack<ResponseInListModel<CertListModel>>(mActivity) {

            @Override
            protected void onSuccess(ResponseInListModel<CertListModel> data, String SucMessage) {
                mRefreshHelper.setData(data.getList(), getString(R.string.no_cert_list), 0);
            }

            @Override
            protected void onReqFailure(String errorCode, String errorMessage) {
                mRefreshHelper.loadError(errorMessage, 0);
            }

            @Override
            protected void onFinish() {
                disMissLoading();
            }
        });

    }

    /**
     * 请求状态 0:待填写,1:填写中,2:以完成
     *
     * @return
     */
    public List<String> getStatusList() {
        List<String> statusList = new ArrayList<>();
        statusList.add("0");
        statusList.add("1");
        return statusList;
    }
}
