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
import com.example.pak_lup.slzapp.activity.indexMainActivity;
import com.example.pak_lup.slzapp.adapter.IndexAdapter;
import com.example.pak_lup.slzapp.datasource.ItemBean_xunwu;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2017/3/9.
 */

public class indexfragment_xunwu extends Fragment implements AdapterView.OnItemClickListener {
    ListView mListView ;
    List<ItemBean_xunwu> itemBeanList;

    List<Integer> imglist;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_xunwu,container,false);
        itemBeanList = new ArrayList<>();
        imglist=new ArrayList<>();
        for (int i = 0;i < 20; i ++){
            if (i%2==0){
                imglist.add(R.drawable.touxiang);
            }
            imglist.add(R.drawable.touxiang2);
        }
        for (int i = 0;i < 20; i ++){
            itemBeanList.add(new ItemBean_xunwu(imglist.get(i), "名字" + i, "内容" + i,R.drawable.touxiang2,"+"+i+"皮币"));
        }
        mListView = (ListView) v.findViewById(R.id.lv_xunwu);
        //设置ListView的数据适配器
        mListView.setAdapter(new IndexAdapter(getActivity(),itemBeanList));
        mListView.setOnItemClickListener(this);
        return v;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("lv_info", "onItemClick: "+position);
        Intent intent=new Intent(getActivity(),indexMainActivity.class);
        intent.putExtra("touxiang",itemBeanList.get(position).getItemImagetx());
        intent.putExtra("name",itemBeanList.get(position).getItemName());
        intent.putExtra("message",itemBeanList.get(position).getItemContent());
        intent.putExtra("mainphoto",itemBeanList.get(position).getItemImagemain());
        intent.putExtra("pbadd",itemBeanList.get(position).getItemaddpb());
        startActivity(intent);
    }
}
