import java.util.ArrayList;

public class SuperWildCardDemo {
    public static void main(String[] args) {
        GenericStack<String> s1 = new GenericStack<>();
        GenericStack<Object> s2 = new GenericStack<>();
        s2.push("java");
        s2.push(2);
        s1.push("Sun");
        add(s1, s2);
        print(s2);
    }

    // public static <T> void add(GenericStack<T> s1, GenericStack<? super T> s2) {
    public static <T> void add(GenericStack<? extends T> s1, GenericStack<T> s2) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }
    public static void print(GenericStack<? extends Object> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

class GenericStack<T> {
    private ArrayList<T> list = new ArrayList<>();
    public int getSize() {
        return list.size();
    }
    public T peek() {
        return list.get(getSize() - 1);
    }

    public void push(T o) {
        list.add(o);
    }
    public T pop() {
        T o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack is " + list.toString();
    }
}
