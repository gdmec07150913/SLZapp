package com.example.pak_lup.slzapp.datasource;

/**
 * Created by Pak_Lup on 2017/3/23 0023.
 */

public class ItemBean_news {
    public int itemImageResId;//图像资源ID
    public String itemName;//标题
    public String itemMessage;//内容

    public ItemBean_news(int itemImageResId, String itemName, String itemMessage) {
        this.itemImageResId = itemImageResId;
        this.itemName = itemName;
        this.itemMessage = itemMessage;
    }
}
