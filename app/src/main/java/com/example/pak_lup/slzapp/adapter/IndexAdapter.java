package com.example.pak_lup.slzapp.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pak_lup.slzapp.R;
import com.example.pak_lup.slzapp.datasource.ItemBean_xunwu;

import java.util.List;

/**
 * Created by Pak_Lup on 2017/3/23 0023.
 */

public class IndexAdapter extends BaseAdapter {
    private List<ItemBean_xunwu> mList;//数据源
    private LayoutInflater mInflater;//布局装载器对象

    public IndexAdapter(Context context, List<ItemBean_xunwu> list) {
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
            convertView = mInflater.inflate(R.layout.itemmessage_xunwu, null);

            //对viewHolder的属性进行赋值
            viewHolder.imageViewtx = (ImageView) convertView.findViewById(R.id.roundImageView);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name_xunwu);
            viewHolder.content = (TextView) convertView.findViewById(R.id.neirong_xunwu);
            viewHolder.imageViewmain = (ImageView) convertView.findViewById(R.id.image_xunwu);
            viewHolder.addpb = (TextView) convertView.findViewById(R.id.addpb_xunwu);



            //通过setTag将convertView与viewHolder关联
            convertView.setTag(viewHolder);
        }else{//如果缓存池中有对应的view缓存，则直接通过getTag取出viewHolder
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // 取出bean对象
        ItemBean_xunwu bean = mList.get(position);

        // 设置控件的数据
        viewHolder.imageViewtx.setImageResource(bean.itemImagetx);
        viewHolder.name.setText(bean.itemName);
        viewHolder.content.setText(bean.itemContent);
        viewHolder.imageViewmain.setImageResource(bean.itemImagemain);
        viewHolder.addpb.setText(bean.itemaddpb);


        return convertView;
    }
    // ViewHolder用于缓存控件，三个属性分别对应item布局文件的三个控件
    class ViewHolder{
        public ImageView imageViewtx;
        public TextView name;
        public TextView content;
        public ImageView imageViewmain;
        public TextView addpb;
    }
}
