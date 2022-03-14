package week_6_homework;

public class Program_4 {
    // Declaring 2 instance and 2 static variables
    // Instance variable
    String x = "I am learning Java";
    String y = "Java is simple";

    // Static variables
    static int a = 500;
    static int b = 300;

    // Instance method calling four variables 2 instance and 2 static variables
    public void method() {
        System.out.println("I am instance method");
        System.out.println(x); // I am learning Java
        System.out.println(y);  // Java is simple
        System.out.println(a);  // 500
        System.out.println(b);  // 300

    }

    // Static method calling four variables 2 instance and 2 static variables
    public static void method1() {
        System.out.println("I am static method");
        // Creating object to call instance variable into static method
        Program_4 fourthProgramme = new Program_4();
        System.out.println(fourthProgramme.x); // I am learning Java
        System.out.println(fourthProgramme.y); // Java is simple
        System.out.println(a); // 500
        System.out.println(b); // 300
    }

    // Main method calling both methods instance and static
    public static void main(String[] args) {
        // Creating object to call instance method
        Program_4 fourthProgramme = new Program_4();
        fourthProgramme.method();
        method1();
    }
}
