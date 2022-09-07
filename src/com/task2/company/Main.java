package com.task2.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animalsOnTreat = new Animal[3];

        animalsOnTreat[0] = new Cat(10, "Дом", false);
        animalsOnTreat[1] = new Dog(40, "Дом", false);
        animalsOnTreat[2] = new Horse(80, "Конюшня", true);

        for (int i = 0; i < animalsOnTreat.length; i++) {
            Veterinarian.treatAnimal(animalsOnTreat[i]);
        }
    }
}

