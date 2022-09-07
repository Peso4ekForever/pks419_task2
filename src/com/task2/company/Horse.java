package com.task2.company;

public class Horse extends Animal {
    public Horse(int food, String location, boolean isSleep) {
        super(food, location, isSleep);
    }

    public String neigh() {
        return "*Лошадь заржала*";
    }

    @Override
    public String makeNoise() {
        if (isSleep()) {
            return "*Животное спит стоя*";
        }
        return "*Животное издало звук*";
    }

}
