package com.example.ium.sitneat;

/**
 * Created by Simone on 08/02/18.
 */

public class Ingredient {

    public String name;
    public float price;
    public Integer img;

    public Ingredient(String n, float p, Integer i){
        this.name=n;
        this.price=p;
        this.img=i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
