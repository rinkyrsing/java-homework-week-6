package week_6_homework;

public class Program_15 {

    public void method() {
        // Declaring the variables to swap with each other
        String p = "I am p and I Swap with q variables ---> Now I am q :) ";
        String q = "I am q and I Swap with p variables ---> Now I am p :)";
        String s; // its a temporarily variable

        // Swapping the variables
        s = p;
        p = q;
        q = s;

        System.out.println("p: " + p);
        System.out.println("q: " + q);
    }

    public static void main(String[] args) {

        // Creating object with "new" key word to call instance method
        Program_15 swapVariable = new Program_15();
        swapVariable.method();
    }
}
