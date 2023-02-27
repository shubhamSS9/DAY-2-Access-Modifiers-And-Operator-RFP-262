package com.Assignments;

import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();

        if (num==0){
            System.out.println("Number in word: zero" );
        } else if (num==1) {
            System.out.println("Number in word:one");
        } else if (num==2) {
            System.out.println("Number in word:two");
        } else if (num==3) {
            System.out.println("Number in word:three");
        } else if (num==4) {
            System.out.println("Number in word:four");
        } else if (num==5) {
            System.out.println("Number in word:five");
        } else if (num==6) {
            System.out.println("Number in word:six");
        } else if (num==7) {
            System.out.println("Number in word:seven");
        } else if (num==8) {
            System.out.println("Number in word:eight");
        } else if (num==9) {
            System.out.println("Number in word:nine");
        }
    }
}
