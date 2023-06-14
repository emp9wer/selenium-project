package src.day34_interface.carTask;

public class Toyota extends Car{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("press button to start "+getModel());
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving great");
    }

}
