package com.Assignments;  //Write a Program to reverse the integer number

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num,lastDigit,sum=0;
        System.out.println("Enter the number: ");
         Scanner r=new Scanner(System.in);
         num=r.nextInt();


        System.out.println("Number before reversing: " +num);
         while (num>0){
             lastDigit=num%10;
             sum=(sum*10)+lastDigit;
             num=num/10;
         }
        System.out.println("Number after reversing: " +sum);

    }
}
