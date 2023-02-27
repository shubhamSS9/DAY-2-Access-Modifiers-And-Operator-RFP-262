package com.Assignments; //Write a program Distance.
// java that takes two integer command-line arguments x and y and prints the Euclidean
// distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

import java.util.Scanner;

public class DistanceBetw {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double distance;
        Scanner r=new Scanner(System.in);
        System.out.println("Enter x1 point: ");
        x1=r.nextInt();
        System.out.println("Enter x2 point: ");
        x2=r.nextInt();
        System.out.println("Enter y1 point: ");
        y1=r.nextInt();
        System.out.println("Enter y2 point: ");
        y2=r.nextInt();
        distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(distance);

    }
}
