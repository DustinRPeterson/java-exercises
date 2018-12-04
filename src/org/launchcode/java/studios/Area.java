//Create a console program that calculates the area of a circle
//Bonus: Use a while loop to confirm the user enters a valid input

package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius = 0;
        double area;
        Scanner scanner = new Scanner(System.in);   //Create new scanner for input

        //Get radius for the circle, if input is not valid (greater than 0) loop will continue.
        while(radius <= 0) {
            System.out.print("Enter a radius: ");
            radius = scanner.nextDouble();
        }


        area = Math.PI * radius * radius; // Area for circle is equal to pi * r^2

        System.out.println(String.format("The area of a circle with radius %f is %f", radius, area)); //Return area of the circle with the initial radius
    }
}
