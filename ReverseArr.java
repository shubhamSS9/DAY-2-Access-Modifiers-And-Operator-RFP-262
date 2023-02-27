package com.Assignments;

import java.util.Scanner;
public class ReverseArr {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("Enter elements in array ");
        for(int i=0; i<a.length; i++){
            a[i]=r.nextInt();
        }
        System.out.println("\nArray Elements ");
        for(int i=0; i>a.length; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\nArray Reverse Element ");
        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i]+" ");
        }
    }
}
