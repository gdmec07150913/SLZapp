package com.example.pak_lup.slzapp.fragment;


import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;
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
    Dialog dialog;
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
        setToolbar(v);
        return v;
    }

    private void setToolbar(View v) {

        toobar.inflateMenu(R.menu.index_toobal_menu);
        toobar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.add_item:
//                        Toast.makeText(getActivity(),""+item.getItemId(),Toast.LENGTH_LONG).show();
//                        添加界面跳转
                        showAddDialog();
                        break;
                }
                return false;
            }
        });
        v.findViewById(R.id.iv_dw).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),""+v.getId(),Toast.LENGTH_LONG).show();
//                定位界面跳转
            }
        });

    }
    private void showAddDialog() {
//       new AlertDialog.Builder(getActivity())
//               .setTitle("Dialog")
//               .setMessage("it is a dialog")
//                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                })
//       .show();
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.dialog_add,null);
        dialog=new Dialog(getActivity(),R.style.MyAddDialog);
        dialog.setContentView(v);
        Window window=dialog.getWindow();
        WindowManager.LayoutParams lp=window.getAttributes();
        dialog.setCanceledOnTouchOutside(true);
        lp.width=getActivity().getResources().getDisplayMetrics().widthPixels;
        Rect rect=new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int statusHeight=rect.top;
        lp.height=getActivity().getResources().getDisplayMetrics().heightPixels-toobar.getHeight()-statusHeight;
        window.setGravity(Gravity.BOTTOM);
        lp.alpha= (float) 0.9;
        window.setAttributes(lp);

        dialog.show();
        v.findViewById(R.id.add_xunwu).setOnClickListener(MyDialogClickListener);
        v.findViewById(R.id.add_zhaoling).setOnClickListener(MyDialogClickListener);
        v.findViewById(R.id.add).setOnClickListener(MyDialogClickListener);
    }
//
    View.OnClickListener MyDialogClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.add_xunwu:
                    Log.i("dialog", "onClick: "+1);
                    break;
                case R.id.add_zhaoling:
                    Log.i("dialog", "onClick: "+2);
                    break;
                case R.id.add:
                    if(dialog!=null){
                        dialog.dismiss();
                    }
                    break;
            }
        }
    };
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
