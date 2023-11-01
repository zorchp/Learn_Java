package circlerectangle;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        // t1();
        t2();
    }

    public static void t2() {
        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(3));
        for (int i = 0; i < 2; ++i) System.out.println("area of circle?" + list.get(i).getArea());
        // area of circle?12.566370614359172
    }

    public static void t1() {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Danver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul"); // 首尔
        cityList.add("Tokyo");
        System.out.println("size=" + cityList.size());
        System.out.println("Miami in the list?" + cityList.contains("Miami"));
        System.out.println("Location of Danver is " + cityList.indexOf("Danver"));
        System.out.println("is list empty?" + cityList.isEmpty());

        cityList.add(2, "Xi'an");
        cityList.remove("Miami");
        cityList.remove(1);
        System.out.println(cityList);
    }
}
