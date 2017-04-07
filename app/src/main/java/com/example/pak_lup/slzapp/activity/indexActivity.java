package com.example.pak_lup.slzapp.activity;


import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.fragment.BlankFragment;
import com.example.pak_lup.slzapp.fragment.indexfragment;
import com.example.pak_lup.slzapp.fragment.minefragment;
import com.example.pak_lup.slzapp.fragment.zhitiaofragment;


/**
 * Created by Pak_Lup on 2017/3/11 0011.
 */

public class indexActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener,BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.index);
        bottomNavigationView= (BottomNavigationView) findViewById(R.id.bnv);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        initView();
    }

    private void initView() {
        getSupportFragmentManager().beginTransaction().add(R.id.container,new indexfragment()).commit();
    }

    public void switchFragment(Fragment frag){
        getSupportFragmentManager().beginTransaction().replace(R.id.container,frag).commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_index:
                switchFragment(new indexfragment());
                break;
            case R.id.menu_news:
                switchFragment(new zhitiaofragment());
                break;
            case R.id.menu_mine:
                switchFragment(new minefragment());
                break;
        }
        return true;
    }
}
