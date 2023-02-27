package com.Assignments;

import java.util.Scanner;

public class DisplayUnit {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Unit: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if (n<10){
            System.out.println("Unit");
        } else if (n==10) {
            System.out.println("Ten");
        } else if (n==100) {
            System.out.println("Hundred");
        } else if (n==1000) {
            System.out.println("Thousand");
        }
    }
}
