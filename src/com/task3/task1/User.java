package com.task3.task1;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
}
