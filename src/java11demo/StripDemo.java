package java11demo;

public class StripDemo {

    public static void main(String[] args) {
        String ascii = " backend ";

        System.out.println("Original:  " + ascii);
        System.out.println("strip:  " + ascii.strip());
        System.out.println("stripLeading:  " + ascii.stripLeading());
        System.out.println("stripTrailing: " + ascii.stripTrailing());

        System.out.println();

        String unicode = "\u2003 data \u2003";// \u2003  = em space
        System.out.println("trim:  " + unicode.trim());
        System.out.println("strip:  " + unicode.strip());
    }
}
