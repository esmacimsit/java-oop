package inheritance;

public class SubClass extends SuperClass{
    public int number = 200; // if you delete this number will be 100

    public void show(){
        System.out.println("superclass num: " + super.number);
        System.out.println("subclass num: " + number);
    }
}
