package week_6_homework;

import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {

       // Calling scanner
        Scanner sc = new Scanner(System.in);
        // Creating a statement for user to enter value
        System.out.print("Enter Decimal number : ");
        int d = sc.nextInt();

        // Converting integer into binary form by using toBinary string method
        System.out.print("Binary equivalent of "+d+" is : ");
        System.out.print(Integer.toBinaryString(d));

    }
}
