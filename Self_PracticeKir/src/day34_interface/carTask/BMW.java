package src.day34_interface.carTask;

public class BMW extends Car{
    @Override
    public void start() {
        System.out.println("putt some oil and then turn key to start "+getModel());
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" is driving great");
    }

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

}
