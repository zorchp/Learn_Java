import java.security.SecureRandom; // not the same
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // t1();
        t2();
    }

    public static void t2() {
        SecureRandom generator1 = new SecureRandom();
        System.out.println("From SecureRandom: ");
        for (int i = 0; i < 10; ++i) {
            System.out.print(generator1.nextInt(1000) + " ");
        }
    }

    public static void t1() {
        // same seed 3
        Random generator1 = new Random(3);
        System.out.println("From generator1: ");
        for (int i = 0; i < 10; ++i) {
            System.out.print(generator1.nextInt(1000) + " ");
        }
        System.out.println();

        Random generator2 = new Random(3);
        System.out.println("From generator2: ");
        for (int i = 0; i < 10; ++i) {
            System.out.print(generator2.nextInt(1000) + " ");
        }
    }
}
