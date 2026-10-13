package com.example.employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public void addEmployee() {
        System.out.println("Employee added: Sathya");
    }

    public void displayEmployee() {
        System.out.println("Employee ID: 101");
        System.out.println("Employee Name: Sathya");
    }

    public void calculateSalary() {
        double salary = 25000.0;
        System.out.println("Employee Salary: " + salary);
    }
}
