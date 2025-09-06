package constractors;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("buket", 24);
        System.out.println("person.name = " + person.name);
        System.out.println("person.age = " + person.age);

//        constractors.Car car = new constractors.Car("Volkswagen", "Jetta", 2016); // display given parameters
        Car car = new Car(); // display default parameters
        car.printInfo();

        Coordinates withoutParm = new Coordinates();
        withoutParm.printInfo();

        Coordinates withParm = new Coordinates(24, 21);
        withParm.printInfo();

        Rectangle myRect = new Rectangle();
        myRect.printInfo();

        Rectangle urRect = new Rectangle(12, 54);
        urRect.printInfo();
    }
}