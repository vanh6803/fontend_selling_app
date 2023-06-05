package com.example.myapplication.Models;

public class HotProduct {
    private int resourceId;
    private String titleHotProduct;

    public HotProduct(int resourceId, String titleHotProduct) {
        this.resourceId = resourceId;
        this.titleHotProduct = titleHotProduct;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTitleHotProduct() {
        return titleHotProduct;
    }

    public void setTitleHotProduct(String titleHotProduct) {
        this.titleHotProduct = titleHotProduct;
    }
}
