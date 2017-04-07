package com.example.pak_lup.slzapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.adapter.ViewPagetAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2017/3/9.
 */

public class zhitiaofragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;

    List<String> titleList;
    List<Fragment> fragmentList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fragmentList=new ArrayList<>();
        fragmentList.add(new zhitiaofragment_news());
        fragmentList.add(new zhitiaofragment_lianxiren());

        titleList=new ArrayList<>();
        titleList.add("消息");
        titleList.add("联系人");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_zhitiao,container,false);
        findView(v);
        setTab();
        return v;
    }

    private void setTab() {
        tabLayout.addTab(tabLayout.newTab().setText("消息"));
        tabLayout.addTab(tabLayout.newTab().setText("联系人"));
        viewPager.setAdapter(new ViewPagetAdapter(getChildFragmentManager(),fragmentList,titleList));
        tabLayout.setupWithViewPager(viewPager,true);
    }

    private void findView(View v) {
        tabLayout= (TabLayout) v.findViewById(R.id.tab_zhitiao);
        viewPager= (ViewPager) v.findViewById(R.id.vp_zhitiao);
    }
}
