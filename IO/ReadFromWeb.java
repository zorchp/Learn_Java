import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFromWeb {
    public static void main(String[] args) {
        System.out.println("Enter a URL:");
        String urlString = new Scanner(System.in).next();
        try {
            URL url = new URL(urlString);
            int cnt = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String l = input.nextLine();
                cnt += l.length();
            }
            System.out.println(cnt);
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (IOException ex) {
            System.out.println("I/O err:no such file");
        }
    }
}
