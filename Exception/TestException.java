public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());
            System.out.println("Trace info");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (StackTraceElement ste : traceElements) {
                System.out.print("method " + ste.getMethodName());
                System.out.print(" (" + ste.getClassName() + ": ");
                System.out.println(ste.getLineNumber() + ")");
            }
        }
    }
    /*
     * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for
     * length 5 at TestException.sum(TestException.java:22) at
     * TestException.main(TestException.java:4) at
     * java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(
     * DirectMethodHandleAccessor.java:103)
     * at java.base/java.lang.reflect.Method.invoke(Method.java:580)
     * at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
     * at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
     * at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
     *
     * Index 5 out of bounds for length 5
     *
     * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for
     * length 5 Trace info method sum (TestException: 22) method main
     * (TestException: 4) method invoke
     * (jdk.internal.reflect.DirectMethodHandleAccessor: 103) method invoke
     * (java.lang.reflect.Method: 580) method execute
     * (com.sun.tools.javac.launcher.Main: 484) method run
     * (com.sun.tools.javac.launcher.Main: 208) method main
     * (com.sun.tools.javac.launcher.Main: 135)
     */

    private static int sum(int[] lst) {
        int ans = 0;
        for (int i = 0; i <= lst.length; ++i) {
            ans += lst[i];
        }
        return ans;
    }
}
