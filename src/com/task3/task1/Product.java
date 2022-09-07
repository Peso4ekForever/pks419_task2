package com.task3.task1;

public class Product {
    private String name;
    private float price;
    private int rating;

    public Product(String name, float price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}

