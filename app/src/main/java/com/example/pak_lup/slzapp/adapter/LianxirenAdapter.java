package com.example.pak_lup.slzapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.datasource.ItemBean_lianxiren;
import com.example.pak_lup.slzapp.datasource.ItemBean_news;

import java.util.List;

/**
 * Created by Pak_Lup on 2017/3/23 0023.
 */

public class LianxirenAdapter extends BaseAdapter {
    private List<ItemBean_lianxiren> mList;//数据源
    private LayoutInflater mInflater;//布局装载器对象

    public LianxirenAdapter(Context context, List<ItemBean_lianxiren> list) {
        mList = list;
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        //如果view未被实例化过，缓存池中没有对应的缓存
        if (convertView == null) {
            viewHolder = new ViewHolder();
            // 由于我们只需要将XML转化为View，并不涉及到具体的布局，所以第二个参数通常设置为null
            convertView = mInflater.inflate(R.layout.itemmessage_lianxiren, null);

            //对viewHolder的属性进行赋值
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.roundImageView);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name_lianxiren);

            //通过setTag将convertView与viewHolder关联
            convertView.setTag(viewHolder);
        }else{//如果缓存池中有对应的view缓存，则直接通过getTag取出viewHolder
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // 取出bean对象
        ItemBean_lianxiren bean = mList.get(position);

        // 设置控件的数据
        viewHolder.imageView.setImageResource(bean.itemImageResId);
        viewHolder.name.setText(bean.itemName);

        return convertView;
    }
    // ViewHolder用于缓存控件，三个属性分别对应item布局文件的三个控件
    class ViewHolder{
        public ImageView imageView;
        public TextView name;
    }
}
