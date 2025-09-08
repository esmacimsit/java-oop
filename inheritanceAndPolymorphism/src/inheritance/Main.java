package inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("hermes", 8, "pug");
        dog.eat();
        dog.sleep();
        dog.bark();

        Car car = new Car();
        car.move();

        Child child = new Child();
        child.display();
    }
}
