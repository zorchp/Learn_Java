public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(
            "The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        Circle circle2 = new Circle(25);
        System.out.println(
            "The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println(
            "The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        circle2.radius = 100;
        System.out.println(
            "The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        // The area of the circle of radius 1.0 is 3.141592653589793
        // The area of the circle of radius 25.0 is 1963.4954084936207
        // The area of the circle of radius 125.0 is 49087.385212340516
        // The area of the circle of radius 100.0 is 31415.926535897932
    }
}
