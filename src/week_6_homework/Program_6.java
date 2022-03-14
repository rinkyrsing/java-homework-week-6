package week_6_homework;

import java.util.Scanner;

public class Program_6 {
       /* Creating  program to enter any radius value of the circle and find out the
        area (Formula of Area A=PI*r*r) with */

    public static void main(String[] args) {
        // Declaring the variables
        double area;
        double radius;
        // Importing Scanner
        Scanner input = new Scanner(System.in);
        // Statement for user to read and enter the value
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
        input.close();
        // area (Formula of Area A=PI*r*r)
        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is: " + area);
    }

}
