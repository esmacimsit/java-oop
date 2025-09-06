package interfaces;

public class Dog implements Mammal {
    @Override
    public void makeSound(){
        System.out.println("Bsrk!");
    }

    @Override
    public void giveBirth(){
        System.out.println("Dog gives birth");
    }
}
