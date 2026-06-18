package java8demo;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.map(String::trim).orElse("Guest"));

        System.out.println("===================");
        Optional<String> opt2 = Optional.ofNullable("Raju");
        System.out.println(opt2.map(String::trim).orElse("Guest"));

        System.out.println("===================");
        Optional<String> opt3 = Optional.of("Raju");
        System.out.println(opt3.get());

//        if(opt3.isPresent()) {
//            System.out.println(opt3.get());
//        }

        opt3.ifPresent(System.out::println);

        if(opt.isEmpty()) {
            System.out.println("empty");
        }
    }
}
