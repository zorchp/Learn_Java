package abstractgeometric;

public class Main {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(5);
        GeometricObject g2 = new Rectangle(3, 4);
        System.out.println("two obj have the same area?" + equalArea(g1, g2));

        displayGeoObj(g1);
        displayGeoObj(g2);
        // two obj have the same area?false

        // area=78.53981633974483
        // perimeter=31.41592653589793

        // area=12.0
        // perimeter=14.0
    }

    public static boolean equalArea(GeometricObject o1, GeometricObject o2) {
        return o1.getArea() == o2.getArea();
    }

    public static void displayGeoObj(GeometricObject obj) {
        System.out.println();
        System.out.println("area=" + obj.getArea());
        System.out.println("perimeter=" + obj.getPerimeter());
    }
}
