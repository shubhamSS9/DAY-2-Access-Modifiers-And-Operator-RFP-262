package com.Assignments;

public class Palindrom {
    public static void main(String[] args) {
        int num=11311,reverse=0,rem,temp;
        temp=num;
        while (temp!=0){
            rem=temp%10;
            reverse=reverse*10+rem;
            temp/=10;
        }
        if (num==reverse){
            System.out.println(num +" is Palindrom");
        }
        else{
            System.out.println(num + " is not Palindrom");
        }
    }
}
