package com.task3.task1;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> productsList;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Product getProductFromArray(int index) {
        return productsList.get(index);
    }

    public void addProductInCategory(Product product){
        productsList.add(product);
    }
}
