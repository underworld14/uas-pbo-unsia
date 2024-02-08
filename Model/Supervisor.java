package com.company.model;

public class Supervisor implements Employee {
    private final double BASE_SALARY = 10000000;
    private final double TRANSPORT_ALLOWANCE = 1000000;
    private final double OVERTIME_RATE = 10000;
    private final double WIFE_ALLOWANCE = 300000;
    private final double CHILD_ALLOWANCE = 100000;
    private final double ADDITIONAL_CHILD_ALLOWANCE = 200000;

    @Override
    public double calculateSalary(int hoursWorked, int numberOfChildren) {
        double salary = BASE_SALARY + TRANSPORT_ALLOWANCE;
        if (hoursWorked > 9) {
            salary += (hoursWorked - 9) * OVERTIME_RATE;
        }

        if (numberOfChildren > 1) {
            salary += WIFE_ALLOWANCE + ADDITIONAL_CHILD_ALLOWANCE;
        } else {
            salary += WIFE_ALLOWANCE + CHILD_ALLOWANCE;
        }

        return salary;
    }
}
