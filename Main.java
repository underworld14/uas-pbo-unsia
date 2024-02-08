package com.company;

import com.company.model.Employee;
import com.company.model.HRD;
import com.company.model.Karyawan;
import com.company.model.Supervisor;
import com.company.model.Technician;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Employee supervisor = new Supervisor();
        Employee hrd = new HRD();
        Employee technician = new Technician();
        Employee karyawan = new Karyawan();
        
        // Calculate salary for each employee type

        // Output for example 10 hours worked, with 1 child
        System.out.println("===== Salary for 10 hours worked =====");
        System.out.println("Supervisor Salary: " + supervisor.calculateSalary(10, 1));
        System.out.println("HRD Salary: " + hrd.calculateSalary(10, 1));
        System.out.println("Technician Salary: " + technician.calculateSalary(10, 1));
        System.out.println("Karyawan Salary: " + karyawan.calculateSalary(10, 1));

        // output for example 9 hours working with 2 children
        System.out.println("===== Salary for 9 hours worked with 2 children =====");
        System.out.println("Supervisor Salary: " + supervisor.calculateSalary(9, 2));   
        System.out.println("HRD Salary: " + hrd.calculateSalary(9, 2));
        System.out.println("Technician Salary: " + technician.calculateSalary(9, 2));
        System.out.println("Karyawan Salary: " + karyawan.calculateSalary(9, 2));
    }
}