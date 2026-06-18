package java8demo;

public interface DefaultAndStaticInterfaceDemo {

    default void greet() {
        System.out.println("Hello, good morning!!!");
    }

    static void sayHi() {
        System.out.println("Hi there");
    }
}
