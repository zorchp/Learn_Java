import java.util.ArrayList;

public class AnyWildCardDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        print(intStack);
    }

    // public static void print(GenericStack<?> stack) {
    // equals to
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
