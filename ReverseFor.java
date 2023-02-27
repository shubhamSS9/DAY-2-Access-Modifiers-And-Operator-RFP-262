package com.Assignments; //Write a Program to reverse the integer number.

import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        int num,a,sum=0,lastDigit;
        System.out.println("Enter the number: ");

        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        for ( ;num != 0; num=num/10){
            lastDigit=num%10;
            sum=(sum*10)+lastDigit;
        }
        System.out.println("The number after reversing: " + sum);

    }
}
