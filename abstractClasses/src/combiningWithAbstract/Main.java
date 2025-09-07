package combiningWithAbstract;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw();
        circle.printInfo();

        Square square = new Square(5);
        System.out.println("area:" + square.getArea());
        System.out.println("perimeter" + square.getPerimeter());
    }
}
