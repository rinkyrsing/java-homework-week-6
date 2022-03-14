package week_6_homework;

public class Program_18 {
    //Creating instance variables for " addition, multiply, subtract, divide and
    //remainder of two numbers.

    public void method() {
        int a = 125;
        int b = 24;
        // performing addition of 2 number
        System.out.println("I am addition: " + (a + b));       // 149
        System.out.println("I am multiplication: " + (a * b)); //3000
        System.out.println("I am subtraction: " + (a - b));   // 101
        System.out.println("I am division: " + (a / b));     //5
        System.out.println("I am mod: " + (a % b));     //5
    }

    // Creating main method to call instance method
    public static void main(String[] args) {
        Program_18 obj = new Program_18();
        obj.method();
    }

}
