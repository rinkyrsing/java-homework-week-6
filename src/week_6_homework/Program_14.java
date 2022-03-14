package week_6_homework;

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height of the rectangle: ");
        double height = scanner.nextDouble();

        System.out.println("Enter width of the rectangle : ");
        double width = scanner.nextDouble();
        scanner.close();
        // logic for finding the perimeter of rectangle = 2*(height + width)
        System.out.println("The perimeter of rectangle is: " + 2 *(height + width));
    }
}

