package com.company;

public class Intern extends Employee {
    public Intern(String name, double salary, int employeeNumber) {
        super(name, 0, employeeNumber);
        if(salary > 0){
            System.out.println("Hey, you are not allowed to make a salary!");
        }
    }
}
