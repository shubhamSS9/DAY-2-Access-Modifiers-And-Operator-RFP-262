package com.Assignments;         //Program to find leap year.

import java.util.Scanner;

public class LeapY {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter year: ");
        Scanner r=new Scanner(System.in);
        year=r.nextInt();
        if (year%400==0){
            System.out.println(year +"is leap year");
        }
        else if (year%4==0 && year%100!=0) {
            System.out.println(year +" is leap year");
        }
        else {
            System.out.println(year +" is not leap year");
        }
    }
}
