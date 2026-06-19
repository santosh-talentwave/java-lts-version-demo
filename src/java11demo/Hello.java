package java11demo;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Running directly from source!");
        System.out.println("No .class file was created.");
        if (args.length > 0){
            System.out.println("First argument is " + args[0]);
        }
    }
}
