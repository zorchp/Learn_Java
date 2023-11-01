public class BoundedTypeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 2);
        Circle circ = new Circle(2);
        System.out.println("Same area: " + equalArea(rect, circ));
    }

    public static <E extends GeometricObj> boolean equalArea(E o1, E o2) {
        return Math.abs(o1.getArea() - o2.getArea()) < 1e-7;
    }
}

class GeometricObj {
    public GeometricObj() {
    }
    public double getArea() { // 基类中必须声明过需要调用的函数
        return 0.;
    }
}

class Rectangle extends GeometricObj {
    private double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle extends GeometricObj {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
