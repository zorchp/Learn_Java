public class SubString {
    public static void t1() {
        String s1 = "hello world";
        String ss1 = s1.substring(2, 5); // [2,5)
        String ss2 = s1.substring(2);
        System.out.println(ss1);
        System.out.println(ss2);
    }

    public static void t2() {
        String s1 = "hello world";
        int ss1 = s1.indexOf('l', 5, 10);
        System.out.println(ss1); // 9
        System.out.println("hello world".indexOf("llo", 1, 10)); // 2
    }

    public static void t3() {
        double d = Double.parseDouble("12.32");
        System.out.println(d);
    }

    public static void main(String[] args) {
        // t1();
        t2();
        // t3();
    }
}
