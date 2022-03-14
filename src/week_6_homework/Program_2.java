package week_6_homework;

public class Program_2 {
    // Declaring static variables
    static double s = 50;
    static double d = 30;

    // Calling static variable into static method
    public static void test()
    {
        System.out.println(s * d);
    }


    // Calling static method into main method
    public static void main(String[] args) {
        test();
    }
}
