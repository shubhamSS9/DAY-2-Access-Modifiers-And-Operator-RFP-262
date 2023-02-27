package com.Assignments; // Write a Program for the sum of n natural numbers

import java.util.Scanner;// Write a Program for the sum of n natural numbers.

public class NaturalFor {
    public static void main(String[] args) {
        int num,i,sum=0;
        System.out.println("Enter the number: ");
        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        for (i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of n natural number are: "+sum);
    }
}
