public class PassObj {
    int x;
    PassObj() {
        this.x = 0;
    }
    PassObj(int x_) {
        this.x = x_;
    }
    public static void main(String[] args) {
        PassObj t = new PassObj(10);
        System.out.println(t.x); // 10
        add(t);
        System.out.println(t.x); // 13
    }
    public static void add(PassObj t1) {
        t1.x += 3;
    }
}
