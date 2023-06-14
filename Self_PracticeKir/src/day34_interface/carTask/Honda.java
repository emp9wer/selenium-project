package src.day34_interface.carTask;

public class Honda extends Car{
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("turn key to start "+getModel());
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving now well");
    }
}
