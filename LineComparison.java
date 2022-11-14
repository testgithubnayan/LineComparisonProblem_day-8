package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program");
        calculateLength();
    }

    public static void calculateLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates of first point x1 y1 : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter coordinates of second point x2 y2 : ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("length of first line is: " + length);
    }
}
