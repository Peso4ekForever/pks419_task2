package com.task2.company;

public class Cat extends Animal {
    public Cat(int food, String location, boolean isSleep) {
        super(food, location, isSleep);
    }

    public String meow() {
        return "*Кошка мяучет*";
    }

    @Override
    public String makeNoise() {
        if (isSleep()) {
            return "*Животное спит лежа*";
        }
        return "*Животное замурчало*";
    }
}
