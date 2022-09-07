package com.task3.task1;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> purchasedProducts;

    public Product getPurchasedProductFromArray(int index) {
        return purchasedProducts.get(index);
    }

    public void addProductInBasket(Product product){
        purchasedProducts.add(product);
    }
}
