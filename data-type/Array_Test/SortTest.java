public class SortTest {
    public static void main(String[] args) {
        // t1();
        t2();
    }

    public static void t1() {
        double[] nums = { 6., 4.4, 1.9, 2.9, 3.4, 3.5 };
        // java.util.Arrays.sort(nums);
        java.util.Arrays.parallelSort(nums);
        for (double d : nums) {
            System.out.println(d);
        }
    }

    public static void t2() {
        char[] nums = { 'a', 'F', '4', 'B', 'D', 'P', 49 };// 49 is '1'
        java.util.Arrays.sort(nums, 1, 3);// partial sort, [1,2]
        // java.util.Arrays.parallelSort(nums,1,3);//partial sort
        for (char ch : nums) {
            System.out.println(ch);
        }
    }
}
