package abstracts;

public class Circle extends Shape{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    void area(){
        System.out.println("area: " + (3.14 * radius * radius));
    }

}
