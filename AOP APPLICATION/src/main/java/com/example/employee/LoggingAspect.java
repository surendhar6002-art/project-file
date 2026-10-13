package com.example.employee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.example.employee.EmployeeService.addEmployee(..))")
    public void logBeforeAdd() {
        System.out.println("Logging: Adding employee");
    }

    @Before("execution(* com.example.employee.EmployeeService.displayEmployee(..))")
    public void logBeforeDisplay() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("execution(* com.example.employee.EmployeeService.calculateSalary(..))")
    public void logBeforeSalary() {
        System.out.println("Logging: Calculating salary");
    }
}
