public class Coordinates {
    private int x;
    private int y;

    public Coordinates(){
        x = 10;
        y = 15;
    } // constructor without parm

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void printInfo(){
        System.out.println(x + "," + y);
    }
}
