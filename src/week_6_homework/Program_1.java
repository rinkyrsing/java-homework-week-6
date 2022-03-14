package week_6_homework;

public class Program_1 {
    // Declaring 2 instance variable

    String str = "I enjoy learning";
    int b = 10;

    // Instance method
    public void test()
    {
        System.out.println(str); // "I enjoy learning"
        System.out.println(b); // 10
    }

    // Calling instance method into main method through object.
    public static void main(String[] args) {
        Program_1 firstProgramme = new Program_1();
        firstProgramme.test();
    }
}
