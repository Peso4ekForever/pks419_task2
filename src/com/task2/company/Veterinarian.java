package com.task2.company;

public class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.printf("Статус животного: еда = %d местоположение: %s %n", animal.getFood(), animal.getLocation());
    }
}
