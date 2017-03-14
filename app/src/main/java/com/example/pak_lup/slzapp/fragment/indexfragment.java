package com.example.pak_lup.slzapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pak_lup.slzapp.R;


/**
 * Created by hasee on 2017/3/9.
 */

public class indexfragment extends Fragment implements View.OnClickListener {
    private TextView tv1,tv2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_index,container,false);
        tv1= (TextView) v.findViewById(R.id.anxunwu);
        tv2= (TextView) v.findViewById(R.id.anzhaoling);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.anxunwu:
                getChildFragmentManager().beginTransaction().replace(R.id.neirong,new indexfragment_xunwu()).commit();
                break;
            case R.id.anzhaoling:
                getChildFragmentManager().beginTransaction().replace(R.id.neirong,new indexfragment_zhaoling()).commit();
                break;
        }
    }
}
