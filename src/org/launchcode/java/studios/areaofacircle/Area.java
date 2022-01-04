package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main (String[] args) {

        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double r = input.nextDouble();
        double pi = 3.14;
        double a = Circle.getArea(r);
        input.close();

        System.out.println("The area of a circle of radius " + r + "is "+ a);
    }
}
