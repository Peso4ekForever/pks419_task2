package com.task3.task1;

public class Main {

    public static void main(String[] args) {

        Product bread = new Product("Хлеб", 2.22F, 4);
        Product vodka = new Product("Водка", 150.0F, 5);

        Category food = new Category("Еда");
        food.addProductInCategory(bread);

        Category drinks = new Category("Напитки");
        drinks.addProductInCategory(vodka);

        Basket currentBasket = new Basket();
        currentBasket.addProductInBasket(bread);
        User currentUser = new User("Andrey", "password", currentBasket);
    }
}

