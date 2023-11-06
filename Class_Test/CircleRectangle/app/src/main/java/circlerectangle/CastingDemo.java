package circlerectangle;

public class CastingDemo {
    public static void main(String[] args) {
        Object o1 = new Circle(1);
        Object o2 = new Rectangle(1, 1);
        displayObj(o1);
        displayObj(o2);
        // circle area is 3.141592653589793
        // circle diameter is 2.0
        // Rectangle area is 1.0
    }

    public static void displayObj(Object obj) {
        if (obj instanceof Circle) {
            System.out.println("circle area is " + ((Circle) obj).getArea());
            System.out.println(
                "circle diameter is " + ((Circle) obj).getDiameter());
        } else if (obj instanceof Rectangle) {
            System.out.println(
                "Rectangle area is " + ((Rectangle) obj).getArea());
        }
    }
}
