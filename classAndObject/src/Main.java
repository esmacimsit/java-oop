public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.changeGear(2);
        myCar.getSpeed(); // 0
        myCar.speedUp(30);
        myCar.getSpeed(); // 30
        myCar.applyBreaks(10);
        myCar.getSpeed(); // 20

        Cat myCat = new Cat();
        myCat.name = "Kitty";
        myCat.printName();
        myCat.meow();

        // different objects from same class
        Person person1 = new Person();
        Person person2 = new Person();

        person1.name = "Buket";
        person2.name = "Esma";
        person1.age = 21;
        person2.age = 24;

        System.out.println("person1 name = " + person1.name);
        System.out.println("person2 name = " + person2.name);
        System.out.println("person1 age = " + person1.age);
        System.out.println("person2 age = " + person2.age);

        Dog myDog = new Dog();
        myDog.breed = "Pug";
        myDog.age = 6;
        myDog.bark();

        Car car1 = new Car();
        car1.modelName = "Mustang";
        car1.modelYear = 1969;
        Car car2 = car1; // same object
        System.out.println("car1.hashCode() = " + car1.hashCode());
        System.out.println("car2.hashCode() = " + car2.hashCode()); // same hashcodes

        System.out.println("car1 modelName: " + car1.modelName);
        System.out.println("car1 modelYear: " + car1.modelYear);
        System.out.println("car2 modelName: " + car2.modelName);
        System.out.println("car2 modelYear: " + car2.modelYear);

        car1 = new Car(); // new object
        System.out.println("car1.hashCode() = " + car1.hashCode()); // different hashcode
        car1.modelName = "Alfa romeo";
        car1.modelYear = 2009;

        System.out.println("car1.modelName = " + car1.modelName);
        System.out.println("car1.modelYear = " + car1.modelYear);
        

        
    }
}