public class MethodReturnArray {
    public static int[] reverse(int[] lst) {
        int[] ans = new int[lst.length];
        for (int i = 0; i < ans.length; ++i) {
            ans[ans.length - 1 - i] = lst[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] l1 = { 1, 2, 3, 4, 5 };
        for (int x : reverse(l1)) {
            System.out.println(x);
        }
    }
}
