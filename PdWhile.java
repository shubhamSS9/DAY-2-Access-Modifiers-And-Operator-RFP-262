package com.Assignments; //Write a Program to find Palindrome Number

import java.util.Scanner;

public class PdWhile {
    public static void main(String[] args) {
        int num,lastDigit,sum=0,a;
        System.out.println("Enter the number: ");

        Scanner r=new Scanner(System.in);
        num=r.nextInt();

        a=num;
        while (a>0){
            lastDigit=a%10;
            sum=(sum*10)+lastDigit;
            a=a/10;
        }
        if (sum==num){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
