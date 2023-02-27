package com.Assignments;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int num1,num2,num3,sum1,sum2,sum3,sum4;
        System.out.println("Enter the numbers: ");
        Scanner r=new Scanner(System.in);
        num1=r.nextInt();
        num2=r.nextInt();
        num3=r.nextInt();

        sum1=num1+num2*num3;
        sum2=num3+num1/num2;
        sum3=num1%num2+num3;
        sum4=num1*num2+num3;

        System.out.println("sum1 : "+sum1);
        System.out.println("sum2 : "+sum2);
        System.out.println("sum3 : "+sum3);
        System.out.println("sum4 : "+sum4);

        int max=sum1;
        if (sum2>max){
            max=sum2;
        }
        if (sum3>max){
            max=sum3;
        }
        if (sum4>max){
            max=sum4;
        }
        System.out.println("Maximum value is: " + max);

        int min=sum1;
        if (sum2<min){
            min=sum2;
        }
        if (sum3<min){
            min=sum3;
        }
        if (sum4<min){
            min=sum4;
        }
        System.out.println("Minimum value is: " + min);
    }
}
