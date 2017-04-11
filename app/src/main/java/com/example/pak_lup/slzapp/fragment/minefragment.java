package com.example.pak_lup.slzapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;


/**
 * Created by hasee on 2017/3/9.
 */

public class minefragment extends Fragment {
    Toolbar toobar;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mine,container,false);
        findView(v);
        return v;
    }

    private void findView(View v) {
        toobar= (Toolbar) v.findViewById(R.id.toolbar);
        tv= (TextView) v.findViewById(R.id.tv_title);
        tv.setText("我的");
        toobar.setTitle("");
    }

}
