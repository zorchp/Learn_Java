package circlerectangle;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    public static void displayObject(GeometricObj obj) {
        System.out.println("Created on " + obj.getDateCreated() + " color is " + obj.getColor());
        // Created on Wed Nov 01 14:43:08 CST 2023 color is red
        // Created on Wed Nov 01 14:43:08 CST 2023 color is black
    }
}
