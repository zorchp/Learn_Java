import java.util.*;

public class TestForEach {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("voirwv");
        c.add("jie");
        // lambda
        // c.forEach(e -> System.out.print(e.toUpperCase() + " "));
        // equals to
        c.forEach(new java.util.function.Consumer<String>() {
            public void accept(String s) {
                System.out.print(s.toUpperCase() + " ");
            }
        });
    }
}
