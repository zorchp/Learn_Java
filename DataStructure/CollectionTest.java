import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        t1();
    }
    public static void t1() {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("New York");
        c1.add("Atlanta");
        c1.add("Dallas");
        c1.add("Madison");
        System.out.println(c1);
        System.out.println(c1.contains("Dallas"));
        c1.remove("Dallas");
        System.out.println(c1.size());

        Collection<String> c2 = new ArrayList<>();
        c2.add("Seattle");
        c2.add("Portland");
        c2.add("Atlanta");
        c2.add("Los Angeles");
        System.out.println(c2);

        ArrayList<String> cc1 = (ArrayList<String>) (c1.clone()); // 拷贝一份
        cc1.addAll(c2);
        System.out.println(cc1);

        cc1 = (ArrayList<String>) (c1.clone());
        cc1.retainAll(c2);
        System.out.println(cc1);

        cc1 = (ArrayList<String>) (c1.clone());
        cc1.removeAll(c2);
        System.out.println(cc1);
    }
}
// [New York, Atlanta, Dallas, Madison]
// true
// 3
// [Seattle, Portland, Atlanta, Los Angeles]
// [New York, Atlanta, Madison, Seattle, Portland, Atlanta, Los Angeles]
// [Atlanta]
// [New York, Madison]
