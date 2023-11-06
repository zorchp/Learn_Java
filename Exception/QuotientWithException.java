import java.util.Scanner;

public class Quotient {
    public static int quotient(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 integers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        try {
            int ans = quotient(n1, n2);
            System.out.println(n1 + " / " + n2 + " = " + ans);
        } catch (ArithmeticException ex) {
            System.out.println("exception : an integer cannot be zero");
        }
        System.out.println("exec continues...");
    }
}
// enter 2 integers
// 0 0
// exception : an integer cannot be zero
// exec continues...
