package com.example.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        try {
            EmployeeService service = context.getBean(EmployeeService.class);
            service.addEmployee();
            service.displayEmployee();
            service.calculateSalary();
        } finally {
            context.close();
        }
    }
}
