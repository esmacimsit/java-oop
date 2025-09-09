package polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

//        for (Animal animal : animals){
//            animal.makeSound();
//        }
//        instead of
//        for (Animal animal : animals){
//            animal.makeSound();
//        }
        for (Animal animal : animals){
            if (animal instanceof Dog){
                System.out.println("dog object");
            } else if (animal instanceof Cat){
                System.out.println("cat object");
            } else{
                System.out.println("animal object");
            }
            animal.makeSound();
        }



    }
}