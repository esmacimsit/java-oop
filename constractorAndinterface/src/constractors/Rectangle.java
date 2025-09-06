package constractors;

public class Rectangle {
    int width;
    int height;

    public Rectangle(){
        this(1, 1);
    }

    public Rectangle(int width, int height){
        if (width > 0 && height > 0){
            this.width = width;
            this.height = height;
        }
    }

    public void printInfo(){
        System.out.println("width = " + width + " height = " + height);
    }
}