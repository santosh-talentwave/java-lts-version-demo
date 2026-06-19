package java11demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

    public static void main(String[] args) throws IOException {
        //a file in the project root
        Path file = Path.of("demo-output.txt");

        //1. Write a String to the file(creates or overwrites)
        String content = "hos=localhost\n" +
                "port=808\n" +
                "name=java11-demo\n" +
                "debug=true";
        Files.writeString(file, content);
        System.out.println("Wrote file: " + file.toAbsolutePath());

        //2. Read the whole file back into single String
        String readBack = Files.readString(file);
        System.out.println("\n-----File Content------");
        System.out.println(readBack);

        //2.Combine with lines
        readBack.lines()
                .map(String::strip)
                .filter(line -> !line.isBlank())
                .forEach(line -> {
                    String[] kv = line.split("=", 2);
                    System.out.println("Key= " + kv[0] + "Value =" + kv[1]);
                });
    }
}
