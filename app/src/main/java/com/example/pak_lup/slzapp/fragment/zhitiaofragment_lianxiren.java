package com.example.pak_lup.slzapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.activity.userdataActivity;
import com.example.pak_lup.slzapp.adapter.LianxirenAdapter;
import com.example.pak_lup.slzapp.datasource.ItemBean_lianxiren;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2017/3/9.
 */

public class zhitiaofragment_lianxiren extends Fragment implements AdapterView.OnItemClickListener{
    ListView mListView ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_lianxiren,container,false);
        List<ItemBean_lianxiren> itemBeanList = new ArrayList<>();
        for (int i = 0;i < 20; i ++){
            itemBeanList.add(new ItemBean_lianxiren(R.drawable.touxiang2, "名字" + i));
        }
        mListView = (ListView) v.findViewById(R.id.lv_lianxiren);
        //设置ListView的数据适配器
        mListView.setAdapter(new LianxirenAdapter(getActivity(),itemBeanList));
        mListView.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("lv_info", "onItemClick: "+position);
        Intent intent=new Intent(getActivity(),userdataActivity.class);
        startActivity(intent);
    }
}
