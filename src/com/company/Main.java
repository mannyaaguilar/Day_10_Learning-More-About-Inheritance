package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Instructor scott = new Instructor("Scott", 24555, 394994);
        TeachingAssistant lori = new TeachingAssistant("Lori", 45000, 3734647);
        Intern kym = new Intern("Kym", 50000, 47567);
            lori.clockIn();
            lori.clockOut();

            scott.clockIn();
            scott.clockOut();

            kym.clockIn();
            kym.clockOut();
        }}


