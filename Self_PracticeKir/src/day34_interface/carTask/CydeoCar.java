package src.day34_interface.carTask;

public class CydeoCar extends Car implements AutoPilot, Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+" is auto parking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel()+" is self driving");
    }

    @Override
    public void start() {
        System.out.println(getModel()+" is starting with a though");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving fast");
    }

    @Override
    public void fly() {
        System.out.println(getModel()+" is flying high");
    }
}
