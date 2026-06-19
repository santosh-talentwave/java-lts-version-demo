package java11demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientDemo {

    public static void main(String[] args) throws IOException, InterruptedException {
        //1. Build a reusable client
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        //2.Build the request(a simple GET)
//        HttpRequestDemo request = new HttpRequestDemo();
//        request.setUri("https://jsonplaceholder.typicode.com/todos/1");
//        request.setHeader("dgfdf");
//        request.setTimeout("5456");

//     HttpRequestDemo req = new HttpRequestDemo.Builder()
//        .uri("https://example.com")
//        .header("Content-Type: application/json")
//        .timeout("5000")
//        .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
                .header("Accept", "application/json")
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

        //3. Send synchronously and get the body as a string
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //4.Inspect the response
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Content-Type: " + response.headers().firstValue("content-type").orElse("unknown"));
        System.out.println("\n----Response body----");
        System.out.println(response.body());
    }
}
