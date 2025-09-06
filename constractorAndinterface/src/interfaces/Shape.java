package interfaces;

public interface Shape {
    double getArea();

    static Shape createCircle(double radius){
        return new Circle(radius);
    }

    static void print(){
        System.out.println("hi");
    }
}
