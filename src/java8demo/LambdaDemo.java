package java8demo;

public class LambdaDemo {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running...");
            }
        });

        t1.start();
        System.out.println("======================");
        Thread  t2 = new Thread(() -> {
            System.out.println("Thread is running...");
            System.out.println("Hello from Thread...");
        });
        t2.start();

        System.out.println("====================");
        Thread  t3 = new Thread(() -> System.out.println("Thread is running..."));
        t3.start();

    }
}
