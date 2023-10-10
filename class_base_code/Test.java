public class Test{
    public static void main(String [] args) {
        D d = new D();//1
        A a = d; //2
        B b = d;//3 
        // D c = a;//4
    }
}

interface A{
    Object m1() ;}

interface B extends A{
    String m1();
}

class D implements B{
    @Override
    public String m1(){
        return "null";
    }
}
