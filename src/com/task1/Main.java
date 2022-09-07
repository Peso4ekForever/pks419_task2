package com.task1;

public class Main {

    public static void main(String[] args) {
        Student developer = new Aspirant("Андрей", "Федоров", "ПКС-419", 5.0);
        System.out.printf("Студент %s %s из группы %s имеет среднюю оценку %f%n",
                developer.getFirstName(), developer.getLastName(), developer.getGroup(), developer.getAverageMark());

        Student[] students = new Student[3];

        students[0] = new Student("Вася", "Петров", "ПКС-419", 5);
        students[1] = new Aspirant("Глеб", "Грехем", "ПКС-419", 5);
        students[2] = new Student("Ярик", "Чернов", "ПКС-419", 4);


        for (int i = 0; i < 3; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}
