package java8demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {

        //from a collection
        List<String> list = List.of("A", "B", "C");
        Stream<String> stream1 = list.stream();

        //from arrays
        String [] arr = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(arr);

        //Using Stream.of()
        Stream<Integer> stream3 = Stream.of(1, 2, 3);
    }
}
