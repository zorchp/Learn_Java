import java.util.Scanner;

public class CalcFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer: ");
        int n = input.nextInt();
        input.close();

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
