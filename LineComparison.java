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
        double length1 = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("length of first line is: " + length1);

        System.out.println("Enter points of second line : ");
        System.out.println("Enter coordinates of first point a1 b1 : ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter coordinates of second point a2 b2 : ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        Double length2 = Math.sqrt((Math.pow((a2-a1),2))+(Math.pow((b2-b1),2)));
        System.out.println("length of second line is: " + length2);

        checkLineEquality(length1 , length2);
    }

    static void checkLineEquality(Double length1, Double length2) {
        boolean result  = length2.equals(length1);
        if (result){
            System.out.println("Lines are equal");
        }
        else{
            System.out.println("Lines are not equal");

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
        double length1 = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println("length of first line is: " + length1);

        System.out.println("Enter points of second line : ");
        System.out.println("Enter coordinates of first point a1 b1 : ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println("Enter coordinates of second point a2 b2 : ");
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        Double length2 = Math.sqrt((Math.pow((a2-a1),2))+(Math.pow((b2-b1),2)));
        System.out.println("length of second line is: " + length2);

        checkLineEquality(length1 , length2);
        compareTwoLines(length1, length2);
    }

    static void checkLineEquality(Double length1, Double length2) {
        boolean result = length2.equals(length1);
        if (result){
            System.out.println("Lines are equal");
        }
        else{
            System.out.println("Lines are not equal");
        }
    }

    static void compareTwoLines(Double length1, Double length2) {
        int result = length2.compareTo(length1);
        if (result == 0){
            System.out.println("Two lines are equal");
        } else if (result > 0) {
            System.out.println("Line 2 is greater than line 1");
        }
        else {
            System.out.println("line 1 is greater than line 2");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for x1,y1 and x2,y2 of line1: ");
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Line line1 = new Line(p1, p2);
        Float length1 = line1.getLength();

        System.out.println("Enter values for x1,y1 and x2,y2 of line2: ");
        Point p3 = new Point(sc.nextInt(), sc.nextInt());
        Point p4 = new Point(sc.nextInt(), sc.nextInt());
        Line line2 = new Line(p3, p4);
        Float length2 = line2.getLength();

        System.out.println("Length of line1 = " + length1);
        System.out.println("Length of line2 = " + length2);

        if (length1.equals(length2)) {
            System.out.println("Both lines are equal");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("line1 is greater than line 2");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("line1 is smaller than line 2");

        }
    }
}
