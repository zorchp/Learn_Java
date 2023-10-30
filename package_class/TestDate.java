public class TestDate {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime() + " ms");
        System.out.println(date.toString());
        // 1698654876538 ms
        // Mon Oct 30 16:34:36 CST 2023
        // ctor
        java.util.Date date1 = new java.util.Date(100);
        System.out.println(date1.getTime() + " ms");
        System.out.println(date1.toString());
    }
}
