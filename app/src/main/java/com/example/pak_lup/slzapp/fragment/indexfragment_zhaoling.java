package com.example.pak_lup.slzapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pak_lup.slzapp.R;

/**
 * Created by hasee on 2017/3/9.
 */
public class indexfragment_zhaoling extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_zhaoling,container,false);
        findView(v);
        return v;
    }

    private void findView(View v) {


    }
}