import java.util.ArrayList;

public class TestGenericStack {
    public static void main(String[] args) {
        GenericStack<String> s1 = new GenericStack<>();
        s1.push("Beijing");
        s1.push("Hongkong");
        s1.push("Shanghai");
        // s1.push(12); // 错误: 不兼容的类型: int无法转换为String
        s1.push(1 + "1"); // ok, cast
        System.out.println(s1.getSize()); // 4
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
