package java11demo;

import java.util.List;
import java.util.stream.Collectors;

public class LinesDemo {

    public static void main(String[] args) {
        String log = "INFO server started\n "
                + "DEBUG Loading config\n"
                + "INFO Request handled\n"
                + "ERROR Null pointer\n ";
        System.out.println(log);
        log.lines().forEach(System.out::println);
        System.out.println(log.lines().count());

        log.lines()
                .filter(line -> line.startsWith("ERROR"))
                .forEach(System.out::println);

       List<String> infos= log.lines()
                .filter(line -> line.startsWith("INFO"))
                .collect(Collectors.toList());
       System.out.println(infos);

       String messy = " hello  \n  world  \n backend  ";
       System.out.println(messy);
       messy.lines()
               .map(String::strip)
               .forEach(System.out::println);


    }
}
