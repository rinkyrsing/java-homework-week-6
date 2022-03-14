package week_6_homework;

public class Program_12 {

    public static void main(String[] args) {
        // Creating object to call instance method
        Program_12 program12 = new Program_12();
        program12.test();
    }

    public void test()
    {
        double a = 25.5;
        double b = 3.5;
        double c = 40.5;
        double d = 4.5;
        System.out.println((a * b - b * b) / (c - d));
    }

}

