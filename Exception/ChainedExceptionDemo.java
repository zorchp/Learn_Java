public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void m1() throws Exception {
        try {
            m2();
        } catch (Exception ex) {
            // throw new Exception("new info from m1", ex);
            throw new Exception("new info from m1");
        }
    }
    /*
     * if not pass 2nd arg, show:
     *
     * java.lang.Exception: new info from m1
     * at ChainedExceptionDemo.m1(ChainedExceptionDemo.java:15)
     * at ChainedExceptionDemo.main(ChainedExceptionDemo.java:4)
     *
     */

    public static void m2() throws Exception {
        throw new Exception("new info from m2");
    }
}
// java.lang.Exception: new info from m1
// at ChainedExceptionDemo.m1(ChainedExceptionDemo.java:14)
// at ChainedExceptionDemo.main(ChainedExceptionDemo.java:4)
// at
// java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
// at java.base/java.lang.reflect.Method.invoke(Method.java:580)
// at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
// at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
// at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
// Caused by: java.lang.Exception: new info from m2
// at ChainedExceptionDemo.m2(ChainedExceptionDemo.java:19)
// at ChainedExceptionDemo.m1(ChainedExceptionDemo.java:12)
// ... 6 more
