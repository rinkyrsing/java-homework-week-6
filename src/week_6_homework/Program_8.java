package week_6_homework;

import java.util.Scanner;

public class Program_8 {
    //Creating a program to calculate the area of a triangle
    public static void main(String[] args) {
        // Declaring the variables
        double height;
        double base;

        // Creating a scanner and statement for user to enter the value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of base of triangle: ");
        base = scanner.nextDouble();
        System.out.println("Enter the length of height of triangle: ");
        height = scanner.nextDouble();

        // Formula --> area = (base * height) / 2
        double area = (base * height) / 2;
        System.out.println("The Area of Triangle is: " + area);


    }

}
