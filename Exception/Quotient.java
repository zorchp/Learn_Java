import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 integers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if (n2 == 0) {
            System.out.println("div zero");
        } else {
            System.out.println(n1 + " / " + n2 + " is " + n1 / n2);
        }
        /*
         * enter 2 integers
         * 1 0
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * at Quotient.main(Quotient.java:10)
         */
    }
}
