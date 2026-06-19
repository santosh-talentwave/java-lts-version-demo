package java11demo;

public class RepeatDemo {
    public static void main(String[] args) {
        //simple repetition
        System.out.println("=".repeat(20));
        System.out.println("Backend Report");
        System.out.println("=".repeat(30));

        //building a seperator
        String seperator = "-".repeat(10);
        System.out.println(seperator);

        //padding/indentation
        String indent = " ".repeat(4);
        System.out.println(indent + "indented line");

        //edge cases
        System.out.println("ab".repeat(3));
        System.out.println("x".repeat(0));
    }
}
