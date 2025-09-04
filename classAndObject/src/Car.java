public class Car {
    // fields
    int speed;
    int gear;

    String modelName;
    int modelYear;

    // methods
    void changeGear(int newGear){
        gear = newGear; // to change gear
    }

    void speedUp(int increment){
        speed += increment; // increasing speed
    }

    void applyBreaks(int decrement){
        speed -= decrement; // decreasing speed
    }

    void getSpeed(){
        System.out.println(speed); // print current speed
    }
}