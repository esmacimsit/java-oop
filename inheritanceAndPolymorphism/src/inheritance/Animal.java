package inheritance;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("animal is eating");
    }

    public void sleep(){
        System.out.println("animal is sleeping");
    }
}