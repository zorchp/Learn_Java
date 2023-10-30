public class TestArray1 {
    public static void t1() {
        int[] arr1 = { 1, 2, 3 };
        // System.out.println(arr1);
        arr1[0] = 12;
        for (int x : arr1) {
            System.out.println(x);
        }
    }

    public static void t2() {
        // copy an array
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] arr3 = arr2;// reference
        arr3[0] = 12;
        // System.out.println(arr2[0]);//12
        int[] arr4 = new int[arr2.length];
        System.arraycopy(arr2, 0, arr4, 0, arr2.length);
        for (int y : arr4) {
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        // t1();
        t2();
    }
}
