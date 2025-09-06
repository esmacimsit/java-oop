package interfaces;

public class Main {
    public static void main(String[] args) {
        Driveable driveable = new Car();
        driveable.start();
        driveable.stop();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.move();

        Dog dog = new Dog();
        dog.makeSound();
        dog.giveBirth();

        DomesticDog domDog = new DomesticDog();
        domDog.beFriendly();
        domDog.goHome();
        domDog.makeSound();

        Motobike motor = new Motobike(90);
        motor.printSpeed();
        System.out.println("fuel type: " + motor.getFuelType());

        Shape circle = Shape.createCircle(5);
        double circleArea = circle.getArea();
        System.out.println("circle area: " + circleArea);

        Shape.print(); // no need to create object to call
    }
}
