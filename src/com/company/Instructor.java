package com.company;

public class Instructor extends Employee {

        public Instructor(String name, double salary, int employeeNumber) {
        super(name, salary, employeeNumber);
        this.working = true;
            }
            @Override
    public void clockIn(){
                System.out.println("Employee is salary and always working");
            }
            @Override
    public void clockOut(){
        System.out.println("Employee is salary and always working");
    }
}
