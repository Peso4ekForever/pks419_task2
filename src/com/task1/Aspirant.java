package com.task1;

public class Aspirant extends Student {
    private static final boolean SCIENCE_WORK = true;

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 20000;
        }

        if (getAverageMark() < 5) {
            return 18000;
        }
        return 0;
    }

    public boolean getScienceWork() {
        return SCIENCE_WORK;
    }
}
