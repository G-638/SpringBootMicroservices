package com.example.employee.model;

import lombok.Getter;
import lombok.Setter;

public class Employee {

    @Getter @Setter
    private  String name;

    @Getter @Setter
    private int salary;


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
