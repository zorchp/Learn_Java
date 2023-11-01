public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(3)};
        Double[] doubleArray = {Double.valueOf(3.4), Double.valueOf(1.3), Double.valueOf(-22.1)};
        Character[] charArray = {
            Character.valueOf('a'), Character.valueOf('J'), Character.valueOf('r')};
        String[] stringArray = {"Tom", "Susam", "Kim"};
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        printList(intArray);
        printList(doubleArray);
        printList(charArray);
        printList(stringArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currMin;
        int currMinIdx;
        for (int i = 0; i < list.length - 1; ++i) {
            currMin = list[i];
            currMinIdx = i;
            for (int j = i + 1; j < list.length; ++j) {
                if (currMin.compareTo(list[j]) > 0) {
                    currMin = list[j];
                    currMinIdx = j;
                }
            }
            if (currMinIdx != i) {
                list[currMinIdx] = list[i];
                list[i] = currMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
