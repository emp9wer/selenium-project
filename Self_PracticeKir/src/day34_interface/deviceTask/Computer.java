package src.day34_interface.deviceTask;

public abstract class Computer extends Device{

    public Computer(String brand, String model, String size, double price, boolean hasBattery, boolean hasPowerButton,String color) {
        super(brand, model, size, price, hasBattery, hasPowerButton,color);
    }

    public abstract void burnCD();


}
