import java.lang.Thread;
import java.util.Scanner;

public class ReadByScanner {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println(input.nextDouble());
            // try {
            // Thread.sleep(1000); // 让线程休眠 1000 毫秒，即 1 秒
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
        }
    }
}
