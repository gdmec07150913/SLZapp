package com.example.pak_lup.slzapp.datasource;

/**
 * Created by Pak_Lup on 2017/3/23 0023.
 */

public class ItemBean_xunwu {
    public int itemImageResId;//图像资源ID
    public String itemTitle;//标题
    public String itemContent;//内容

    public ItemBean_xunwu(int itemImageResId, String itemTitle, String itemContent) {
        this.itemImageResId = itemImageResId;
        this.itemTitle = itemTitle;
        this.itemContent = itemContent;
    }
}
