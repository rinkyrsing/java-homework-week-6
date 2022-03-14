package week_6_homework;

import java.util.Scanner;

public class Program_7 {
  /* Creating a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C) with help od scanner */

    public static void main(String[] args) {
        float temperature;
        System.out.println("Enter the temperature to convert into Celsius ");
        Scanner test = new Scanner(System.in);
        temperature = test.nextFloat();
        temperature = ((temperature - 32) * 5 / 9);
        System.out.println("tenperature in celsius: " + temperature);

    }

}
