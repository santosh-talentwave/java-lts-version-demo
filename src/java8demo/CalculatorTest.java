package java8demo;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition is: " + add);
        Calculator sub = (a, b) -> a - b;
        System.out.println("Subtraction is: " + sub);
    }
}
