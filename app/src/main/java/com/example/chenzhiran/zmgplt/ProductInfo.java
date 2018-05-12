package com.example.chenzhiran.zmgplt;

import java.io.Serializable;

public class ProductInfo implements Serializable {
    private String mProductDesription;
    private int mPrice;
    private int mAvatarUrl;

    public ProductInfo(String productDescription, int price,int avatarUrl) {
        mProductDesription = productDescription;
        mPrice = price;
        mAvatarUrl = avatarUrl;
    }


    //
    public String getProductDesription() {
        return mProductDesription;
    }
    public void setProductDesription(String productDescription) {
        mProductDesription = productDescription;
    }

    public int getPrice() {
        return mPrice;
    }
    public void setPrice(int price) {
        mPrice = price;
    }

    public int getAvatarUrl() {
        return mAvatarUrl;
    }
    public void setAvatarUrl(int avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

}
