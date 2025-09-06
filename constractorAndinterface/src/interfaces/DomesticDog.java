package interfaces;

public class DomesticDog implements Domestic{
    @Override
    public void goHome(){
        System.out.println("Dog goes home");
    }

    @Override
    public void beFriendly(){
        System.out.println("We are friends");
    }

    @Override
    public void makeSound(){
        System.out.println("Bark");
    }


}
