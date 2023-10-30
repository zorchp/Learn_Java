public class TestPassArray {
    public static void main(String[] args) {
        int[] a = { 1, 2 };
        System.out.println("Before invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swap(a[0], a[1]);
        System.out.println("After invoking swap");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        //
        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    }

    public static void swap(int n1, int n2) {// 基本数据类型,值传递
        int tmp = n1;
        n1 = n2;
        n2 = tmp;
    }

    public static void swapFirstTwoInArray(int[] arr) {// 数组使用引用传递
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
