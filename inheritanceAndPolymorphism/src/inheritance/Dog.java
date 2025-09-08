package inheritance;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed){
        super(name, age); // calls the parent
        this.breed = breed;
    }

    public void bark(){
        System.out.println("dog is barking");
    }

}
