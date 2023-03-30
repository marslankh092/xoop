package com.example.arslanconstraints10.SameAcitivities2;

public class ModelCardView {

    private String item_date;
    private String itemName;
    private String item_ccard;
    int item_image;

    public ModelCardView(String item_date, String item_ccard, String itemName,int item_image) {
        this.item_image=item_image;
        this.item_date = item_date;
        this.item_ccard = item_ccard;
        this.itemName = itemName;
    }


    public String getItem_date() {
        return item_date;
    }

    public void setItem_date(String item_date) {
        this.item_date = item_date;
    }

    public String getItem_ccard() {
        return item_ccard;
    }

    public void setItem_ccard(String item_ccard) {
        this.item_ccard = item_ccard;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}