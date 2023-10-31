
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rect = new Rectangle(3, 4);
        System.out.println("\n A Rectangle is " + rect.toString());
        System.out.println("The area is " + rect.getArea());
        System.out.println("The perimeter is " + rect.getPerimeter());
        // A circle created on Tue Oct 31 10:56:23 CST 2023
        // color: white and filled: false
        // The color is white
        // The radius is 1.0
        // The area is 3.141592653589793
        // The diameter is 2.0

        // A Rectangle is created on Tue Oct 31 10:56:23 CST 2023
        // color: white and filled: false
        // The area is 12.0
        // The perimeter is 14.0
    }
}
