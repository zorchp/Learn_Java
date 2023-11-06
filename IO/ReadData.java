import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        File f = new File("/Users/hep/code/test.txt");
        try (Scanner input = new Scanner(f);) {
            while (input.hasNext()) {
                String firstname = input.next();
                int score = input.nextInt();
                System.out.println(firstname + " " + score);
            }
            input.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("FileNotFound");
        }
    }
}
