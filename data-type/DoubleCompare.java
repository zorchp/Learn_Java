public class DoubleCompare {
    public static void main(String[] args) {
        double d1 = 0.1;
        double d3 = 0.5;
        while (d1 != d3) {
            d1 += 0.1;
        }
        System.out.println(d1);
        System.out.println(d3);
    }
}
