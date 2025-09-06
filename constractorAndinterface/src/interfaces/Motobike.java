package interfaces;

public class Motobike implements Vehicle{
    private double speed;

    public Motobike(double speed){
        this.speed = speed;
    } // constructor

    @Override
    public double getSpeed(){
        return speed;
    }
}
