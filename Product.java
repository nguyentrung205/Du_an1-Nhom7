package com.example.myapplication;

public class Product {
    private String name;
    private String price;
    private int imageResId; // Sử dụng int thay vì String cho ảnh

    public Product(String name, String price, int imageResId) {
        this.name = name;
        this.price = price;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResId() {
        return imageResId;
    }
}
