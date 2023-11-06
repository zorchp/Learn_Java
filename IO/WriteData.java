import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) {
        String filename = "/Users/hep/code/test.txt";
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("file already exists");
            System.exit(1);
        }
        // try-with-resource
        try (PrintWriter output = new PrintWriter(file);) {
            output.print("Tom ");
            output.println(122);
            output.print("Jack ");
            output.println(123);
            output.close();
            System.out.println("Write to" + filename);
        }

        catch (FileNotFoundException fnfex) {
            System.out.println("File not found");
        }
    }
}
