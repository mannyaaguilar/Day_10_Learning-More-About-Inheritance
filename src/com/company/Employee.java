package com.company;

public class Employee {

    public String name;
    public double salary;
    public int employeeNumber;
    public boolean working;

    public Employee(String name, double salary, int employeeNumber) {
        this.name = name;
        this.salary = salary;
        this.employeeNumber = employeeNumber;
        this.working = false;
           }
           public void clockIn(){
        this.working = true;
               System.out.println("Clocked In!");
           }
           public void clockOut(){
        this.working = false;
               System.out.println("Clocked Out!");
           }
}
