package week_6_homework;

import java.util.Scanner;

public class Program_5 {
    // Declaring 2 instance and 2 static variable
    static int r1;
    static int r2;

    public static void main(String[] args) {
        // Creating scanner for user to read the statement
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in first number: ");
        r1 = scanner.nextInt();

        System.out.print("Enter in second number: ");
        r2 = scanner.nextInt();
        // Creating object to call instance method
        Program_5 obj = new Program_5();
        obj.addition();
        obj.subtraction();
        // I can call static method with out object
        division();
        multiplication();
 }

   // Creating two instance method addition and subtraction method
   public void addition()
   {
       int num = r1 + r2;
       System.out.println("Addition of this number is : " + num );
   }

    public void subtraction()
    {
      int num = r1 - r2;
        System.out.println("Subtraction of this number is : " + num);
    }

    // Creating two static method division and multiplication
    public static void division()
    {
       int mun = r1 / r1;
        System.out.println("Division of this number is : " + mun );
    }
    public static void multiplication()
    {
      int mun = r1 * r2;
        System.out.println("Multiplication of this number is : " + mun );
    }

}

