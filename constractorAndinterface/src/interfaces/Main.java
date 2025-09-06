package interfaces;

public class Main {
    public static void main(String[] args) {
        Driveable driveable = new Car();
        driveable.start();
        driveable.stop();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.move();

    }
}
