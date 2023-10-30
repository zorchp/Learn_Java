import java.util.Scanner;

public class BaseString {
    public static void t1() {
        String s1 = "hello world";
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        String s2 = " kw";
        System.out.println(s1.concat(s2));
        System.out.println(s1 + s2);
        System.out.println(s1.toUpperCase());
        // exception
        // System.out.println(s1.charAt(15));
    }

    public static void t2() { // get String from stdin
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        System.out.println(s1);
        // get line
        input = new Scanner(System.in);
        String line = input.nextLine();
        System.out.println(line);
    }

    public static void main(String[] args) {
        // t1();
        t2();
    }
}
