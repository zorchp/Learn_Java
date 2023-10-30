import java.lang.Float;

public class DataType {
    public static void t1() {
        byte b1 = 127;
        short s1 = -32768;
        int i1 = 2147483647;
        long l1 = 9_223_372_036_854_775_807L;
        float f1 = 0.1f;
        double d1 = 0.1f;
        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);
    }

    public static void t2() {
        char c = '1';
        char c1 = '\0';
        boolean b = true;
        boolean b1 = false;
        String s = "abc\0abc"; // \0 表示空字符
        System.out.println(b);
        System.out.println(s);
    }

    public static void t3() {
        final double PI = 3.14;
        System.out.println(PI);
    }

    public static void main(String[] args) {
        // t1();
        // t2();
        t3();
    }
}
