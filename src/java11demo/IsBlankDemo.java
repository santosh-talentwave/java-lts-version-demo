package java11demo;

public class IsBlankDemo {

    public static void main(String[] args) {
        String empty = "";
        String spaces = "   ";
        String tabNewLine = "\t\n  ";
        String real = " backend ";

        System.out.println(empty);
        System.out.println(spaces);
        System.out.println(tabNewLine);
        System.out.println(real);

        System.out.println(empty.isEmpty());
        System.out.println(spaces.isEmpty());
        System.out.println(tabNewLine.isEmpty());
        System.out.println(real.isEmpty());

        System.out.println("===============");
        System.out.println(empty.isBlank());
        System.out.println(spaces.isBlank());
        System.out.println(tabNewLine.isBlank());
        System.out.println(real.isBlank());
    }
}
