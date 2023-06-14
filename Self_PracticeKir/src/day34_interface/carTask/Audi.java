package src.day34_interface.carTask;

public class Audi extends Car implements AutoPark{
    @Override
    public void autoPark() {
        System.out.println(getModel()+" is auto parking");
    }

    @Override
    public void start() {
        System.out.println("press button to start "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("driving audi");
    }

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
}
