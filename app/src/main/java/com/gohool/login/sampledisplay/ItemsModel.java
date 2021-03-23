package com.gohool.login.sampledisplay;

public class ItemsModel {
    private String name;
    private int img;
    public ItemsModel(String name, int img)
    {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return this.img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
