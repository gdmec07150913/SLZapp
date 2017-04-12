package com.example.pak_lup.slzapp.datasource;

/**
 * Created by Pak_Lup on 2017/3/23 0023.
 */

public class ItemBean_xunwu {
    public int itemImagetx;//头像
    public String itemName;//名字
    public String itemContent;//内容
    public int itemImagemain;//失物照片
    public String itemaddpb;//+皮币


    public ItemBean_xunwu(int itemImagetx, String itemName, String itemContent,int itemImagemain,String itemaddpb) {
        this.itemImagetx = itemImagetx;
        this.itemName = itemName;
        this.itemContent = itemContent;
        this.itemImagemain = itemImagemain;
        this.itemaddpb = itemaddpb;
    }

    public String getItemaddpb() {
        return itemaddpb;
    }

    public void setItemaddpb(String itemaddpb) {
        this.itemaddpb = itemaddpb;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }

    public int getItemImagemain() {
        return itemImagemain;
    }

    public void setItemImagemain(int itemImagemain) {
        this.itemImagemain = itemImagemain;
    }

    public int getItemImagetx() {
        return itemImagetx;
    }

    public void setItemImagetx(int itemImagetx) {
        this.itemImagetx = itemImagetx;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /* public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent;
    }

    public int getItemImageResId() {
        return itemImageResId;
    }

    public void setItemImageResId(int itemImageResId) {
        this.itemImageResId = itemImageResId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }*/
}
