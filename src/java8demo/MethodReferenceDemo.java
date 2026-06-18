package java8demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        //static
        BiFunction<Integer, Integer, Integer> add = Math::addExact;
        System.out.println(add.apply(1, 2));

        //instance of an existing object
        String message = "Hello";
        Function<String, String> fun = message::concat;
        System.out.println(fun.apply(" World!"));

        //instance of an arbitrary object
        List<String> names = Arrays.asList("John", "Jane", "Bob");
        names.forEach(System.out::println);

        //constructor
        Function<String, User> userCreator = User::new;//new User("rr")
        User user = userCreator.apply("John");
        System.out.println(user);
    }
}