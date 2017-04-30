package com.example.pak_lup.slzapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.activity.chatActivity;
import com.example.pak_lup.slzapp.adapter.NewsAdapter;
import com.example.pak_lup.slzapp.datasource.ItemBean_news;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2017/3/9.
 */

public class zhitiaofragment_news extends Fragment implements AdapterView.OnItemClickListener {
    ListView mListView ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_news,container,false);
        List<ItemBean_news> itemBeanList = new ArrayList<>();
        for (int i = 0;i < 20; i ++){
            itemBeanList.add(new ItemBean_news(R.drawable.touxiang, "名字" + i, "聊天内容" + i));
        }
        mListView = (ListView) v.findViewById(R.id.lv_news);
        //设置ListView的数据适配器
        mListView.setAdapter(new NewsAdapter(getActivity(),itemBeanList));
        mListView.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(getActivity(),chatActivity.class);
        startActivity(intent);
    }
}
