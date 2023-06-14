package src.day34_interface.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel()+" is auto parking");
    }

    @Override
    public void start() {
        System.out.println("starting "+getModel()+" with a button");
    }

    @Override
    public void drive() {
        System.out.println("driving now "+ getModel());
    }

}
