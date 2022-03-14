package week_6_homework;

import java.util.Scanner;

public class Program_10 {

    public static void main(String[] args) {
        /* Creating program that takes a number has input and prints its
          multiplication table up to 10  */

        int n = 0;
        // Creating scanner and for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();

        // Using for loop to repeat the numbers
        for (int i = 1; i <= 10; i++)

        {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }

}

