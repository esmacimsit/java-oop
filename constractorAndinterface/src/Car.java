public class Car {
    private String make;
    private String model;
    private int year;

    // constructor
//    public Car(String make, String model, int year){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//    }
    // default cons atanir

    public void printInfo(){
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("year = " + year);
    }
}
