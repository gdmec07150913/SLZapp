package com.example.pak_lup.slzapp;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.pak_lup.slzapp.fragment.BlankFragment;
import com.example.pak_lup.slzapp.fragment.indexfragment;
import com.example.pak_lup.slzapp.fragment.minefragment;
import com.example.pak_lup.slzapp.fragment.zhitiaofragment;


/**
 * Created by Pak_Lup on 2017/3/11 0011.
 */

public class index extends AppCompatActivity implements View.OnClickListener,BlankFragment.OnFragmentInteractionListener{
    private TextView tv3,tv4,tv5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.index);
        tv3= (TextView) findViewById(R.id.daohang_index);
        tv4= (TextView) findViewById(R.id.daohang_zhitiao);
        tv5= (TextView) findViewById(R.id.daohang_mine);

        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
       /* tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,new indexfragment_xunwu()).commit();
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.container,new indexfragment_zhaoling()).commit();
            }
        });*/
        initView();
    }

    private void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.container,new indexfragment()).commit();
    }

    public void switchFragment(Fragment frag){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,frag).commit();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.daohang_index:
                switchFragment(new indexfragment());
                break;
            case R.id.daohang_zhitiao:
                switchFragment(new zhitiaofragment());
                break;
            case R.id.daohang_mine:
                switchFragment(new minefragment());
                break;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
