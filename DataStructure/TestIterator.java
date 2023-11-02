import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        c1.add("New York");
        c1.add("Atlanta");
        c1.add("Dallas");
        c1.add("Madison");
        Iterator<String> it = c1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().toUpperCase() + " ");
        }
    }
}
