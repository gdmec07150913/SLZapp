package com.example.pak_lup.slzapp.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.activity.collect;
import com.example.pak_lup.slzapp.activity.pbActivity;
import com.example.pak_lup.slzapp.activity.publish;
import com.example.pak_lup.slzapp.activity.updateuser;
import com.example.pak_lup.slzapp.activity.upkey;


/**
 * Created by hasee on 2017/3/9.
 */

public class minefragment extends Fragment implements View.OnClickListener {
    Toolbar toobar;
    TextView tv;
    ImageView iv;
    Button bt1,bt2,bt3,bt4;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_mine,container,false);
        findView(v);
        iv= (ImageView) v.findViewById(R.id.pbimg_mine);
        iv.setOnClickListener(this);
        bt1= (Button) v.findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2= (Button) v.findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3= (Button) v.findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4= (Button) v.findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        return v;
    }

    private void findView(View v) {
        toobar= (Toolbar) v.findViewById(R.id.toolbar);
        tv= (TextView) v.findViewById(R.id.tv_title);
        tv.setText("我的");
        toobar.setTitle("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pbimg_mine:
                Intent intent1 = new Intent(getActivity(), pbActivity.class);
                startActivity(intent1);
                break;
            case R.id.bt1:
                Intent intent2 = new Intent(getActivity(), updateuser.class);
                startActivity(intent2);
                break;
            case R.id.bt2:
                Intent intent3 = new Intent(getActivity(), publish.class);
                startActivity(intent3);
                break;
            case R.id.bt3:
                Intent intent4 = new Intent(getActivity(), collect.class);
                startActivity(intent4);
                break;
            case R.id.bt4:
                Intent intent5 = new Intent(getActivity(), upkey.class);
                startActivity(intent5);
                break;
        }
    }
}
