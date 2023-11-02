public class TestMax {
    public static void main(String[] args) {
        // System.out.println(Max.max(1, "23"));
        System.out.println(Max.max(1, 23));
        // 类型检查
        System.out.println(Max.max_with_check(1, 23));
        // System.out.println(Max.max_with_check(1, "abc"));
    }
    class Max {
        public static Comparable max(Comparable o1, Comparable o2) {
            if (o1.compareTo(o2) > 0) {
                return o1;
            } else {
                return o2;
            }
        }
        public static <E extends Comparable<E>> E max_with_check(E o1, E o2) {
            if (o1.compareTo(o2) > 0) {
                return o1;
            } else {
                return o2;
            }
        }
    }
}
