package inheritance;

public class Child extends Parent{
    @Override
    void display(){
        super.display();
        System.out.println("display in child");
    }
}
