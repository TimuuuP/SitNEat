package com.example.ium.sitneat;

public class Ingredient {

    public String name;
    private String category;
    public float price;
    public Integer img;

    public Ingredient(String n, String c, float p, Integer i){
        this.name=n;
        this.category=c;
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

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }
}
