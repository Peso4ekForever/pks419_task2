package com.task2.company;

public class Dog extends Animal {
    public Dog(int food, String location, boolean isSleep) {
        super(food, location, isSleep);
    }

    public String bark() {
        return "*Собака лает*";
    }

    @Override
    public String makeNoise() {
        if (isSleep()) {
            return "*Животное спит лежа*";
        }
        return "*Животное виляет хвостом*";
    }
}
