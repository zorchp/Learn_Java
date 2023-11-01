public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"};
        // GenericMethodDemo.<Integer>print(integers);
        // GenericMethodDemo.<String>print(strings);

        // or shortly:
        print(integers);
        print(strings);
        // 1 2 3 4 5
        // London Paris New York Austin
    }
    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; ++i) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
