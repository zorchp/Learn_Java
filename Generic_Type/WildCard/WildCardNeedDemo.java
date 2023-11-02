import java.util.ArrayList;
public class WildCarsNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        System.out.println("Max number is " + max(intStack));
        // 错误: 无法将类 WildCarsNeedDemo中的方法 max应用到给定类型
    }

    // public static double max(GenericStack<Number> stack) {
    // 使用受限通配
    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {
            double val = stack.pop().doubleValue();
            if (val > max) {
                max = val;
            }
        }

        return max;
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
