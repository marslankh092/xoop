package com.example.arslanconstraints10.SearchViewOnly;

public class CountryModel {
    String name, desc;
    int image;

    public CountryModel(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
