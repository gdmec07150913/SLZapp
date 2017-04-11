package com.example.pak_lup.slzapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.activity.indexMainActivity;
import com.example.pak_lup.slzapp.adapter.ViewPagetAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by hasee on 2017/3/9.
 */

public class indexfragment extends Fragment{
    ViewPager viewPager;
    TabLayout tabLayout;
    Toolbar toobar;
    TextView tv;

    List<String> titleList;
    List<Fragment> fragmentList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentList=new ArrayList<>();
        fragmentList.add(new indexfragment_xunwu());
        fragmentList.add(new indexfragment_zhaoling());

        titleList=new ArrayList<>();
        titleList.add("寻物启事");
        titleList.add("失物招领");
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_index,container,false);
        findView(v);
        setTab();
        setToolbar();
        return v;
    }

    private void setToolbar() {

        ((AppCompatActivity)getActivity()).setSupportActionBar(toobar);

        toobar.setNavigationIcon(R.mipmap.ic_launcher);
        toobar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("toobar", "onClick: is Clicked");
            }
        });
    }

    private void setTab() {
        tabLayout.addTab(tabLayout.newTab().setText("寻物启事"));
        tabLayout.addTab(tabLayout.newTab().setText("失物招领"));
        viewPager.setAdapter(new ViewPagetAdapter(getChildFragmentManager(),fragmentList,titleList));
        tabLayout.setupWithViewPager(viewPager,true);
    }

    private void findView(View v) {
        tabLayout= (TabLayout) v.findViewById(R.id.tab_index);
        viewPager= (ViewPager) v.findViewById(R.id.vp_index);

        toobar= (Toolbar) v.findViewById(R.id.toolbar);
        tv= (TextView) v.findViewById(R.id.tv_title);
        tv.setText("拾乐志");
        toobar.setTitle("");
    }
}
