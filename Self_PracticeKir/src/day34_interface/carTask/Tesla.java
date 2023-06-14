package src.day34_interface.carTask;

public class Tesla extends Car implements AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
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
        System.out.println(getModel()+" is starting with phone app");
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving excellent");
    }
}
