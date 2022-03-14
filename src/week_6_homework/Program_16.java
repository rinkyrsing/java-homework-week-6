package week_6_homework;

import java.util.Scanner;

public class Program_16 {
    public static void method(){
        //Adding two binary number ---10 and 11 = 101

        // Creating a scanner
        Scanner sc = new Scanner(System.in);
        // Statement for user to enter the value
        System.out.println("Enter 1st Binary number : ");
        String x = sc.nextLine();
        System.out.println("Enter 2nd Binary number : ");
        String y = sc.nextLine();

    // to perform addition of 2 binary number, converting string into integer number
        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y,2);
        int n3 = n1 + n2;

     // Passing parameters and converting into binary numbers
        System.out.println("n1 : " + Integer.toBinaryString(n1));
        System.out.println("n2 : " + Integer.toBinaryString(n2));
        System.out.println("n3 = n1+n2 : " + Integer.toBinaryString(n3));
    }

    public static void main(String[] args) {
        Program_16 obj = new Program_16();
        obj.method();
    }

}
