package java8demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo2 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Bob", "Tom");
        System.out.println(names);

        //filter
        names.stream()
                .filter(name -> name.startsWith("J"))
//                .forEach(name -> System.out.println(name));
                .forEach(System.out::println);

        System.out.println("===================");
        //map
        names.stream()
//                .map(name -> name.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("===================");
        //sort
        List<Integer> numbers = Arrays.asList(4, 2, 6, 9, 7, 2, 1, 6);
        System.out.println(numbers);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====================");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("====================");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);
        System.out.println("===================");
        numbers.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("===================");
        //collect
        List<Integer> evenList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenList);

        System.out.println("===================");
        //reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println("===================");
        //count
        long count = numbers.stream()
                .filter(n -> n > 2)
                .count();
        System.out.println(count);

        System.out.println("==================");
        //match
        boolean result = numbers.stream()
                .anyMatch(n -> n > 4);
        System.out.println(result);

        System.out.println("==================");
        Map<Integer, String> map  = Map.of(1, "A", 2, "B", 3, "C");
        map.entrySet().stream()
                .filter(e -> e.getKey() > 1)
                .forEach(System.out::println);

    }
}
