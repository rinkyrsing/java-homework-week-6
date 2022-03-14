package week_6_homework;

public class Program_3 {
    // Declaring 1 instance and 1 static variables
    byte x = 15;
    static byte y = 10;

    // Instance method calling both variables instance and static
    public void addition() {
        System.out.println("I an in instance method");
        System.out.println(x + y); // 25
    }

    // Static method calling both variables instance and static
    public static void method() {
        System.out.println("I am in static method");
        System.out.println(y);// 10
        // Creating object to call instance variable into static method
        Program_3 obj = new Program_3();
        System.out.println(obj.x - y);// 5

    }

    // Main method calling both methods instance and static
    public static void main(String[] args) {
        Program_3 obj = new Program_3();
        obj.addition();
        method();
    }
}
