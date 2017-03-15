package com.example.pak_lup.slzapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.pak_lup.slzapp.fragment.BlankFragment;

import java.util.List;

/**
 * Created by Pak_Lup on 2017/3/15 0015.
 */

public class ViewPagetAdapter extends FragmentPagerAdapter {
    List<String> titleList;
    List<Fragment> fragmentList;
    public ViewPagetAdapter(FragmentManager fm,List<Fragment> fragmentList,List<String> titleList) {
        super(fm);
        this.fragmentList=fragmentList;
        this.titleList=titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }
}
