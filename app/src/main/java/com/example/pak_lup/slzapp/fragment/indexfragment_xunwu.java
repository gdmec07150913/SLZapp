package com.example.pak_lup.slzapp.fragment;


import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.adapter.IndexAdapter;
import com.example.pak_lup.slzapp.datasource.ItemBean_xunwu;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2017/3/9.
 */

public class indexfragment_xunwu extends Fragment {
    ListView mListView ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_xunwu,container,false);
        List<ItemBean_xunwu> itemBeanList = new ArrayList<>();
        for (int i = 0;i < 20; i ++){
            itemBeanList.add(new ItemBean_xunwu(R.drawable.touxiang, "名字" + i, "内容" + i));
        }
        mListView = (ListView) v.findViewById(R.id.lv_xunwu);
        //设置ListView的数据适配器
        mListView.setAdapter(new IndexAdapter(getActivity(),itemBeanList));
        return v;
    }
}
