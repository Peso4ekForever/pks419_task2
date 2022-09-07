package com.task2.company;

public class Animal {
    private int food;
    private String location;
    private boolean isSleep;

    public Animal(int food, String location, boolean isSleep) {
        this.food = food;
        this.location = location;
        this.isSleep = isSleep;
    }

    public String makeNoise() {
        if (isSleep) {
            return "*Животное спит*";
        }
        return "*Животное издало звук*";
    }

    public void eat(int foodPoints) {
        this.food += foodPoints;
    }

    public void sleep() {
        this.isSleep = true;
    }

    public int getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
