package interfaces;

public interface Vehicle {
    double getSpeed();

    default String getFuelType(){
        return "Petrol";
    }

    default void printSpeed(){
        System.out.println("speed is " + getSpeed());
    }
}
