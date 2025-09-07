package combiningWithAbstract;

public class Circle extends BaseShape implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}