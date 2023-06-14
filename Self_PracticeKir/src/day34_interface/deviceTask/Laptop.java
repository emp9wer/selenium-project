package src.day34_interface.deviceTask;

public class Laptop extends Computer implements PcApps{
    public Laptop(String brand, String model, String size, double price, boolean hasBattery, boolean hasPowerButton,String color) {
        super(brand, model, size, price, hasBattery, hasPowerButton, color);
    }

    @Override
    public void burnCD() {
        System.out.println("laptop is burning cds");
    }

    @Override
    public void turnOn() {
        System.out.println("laptop on");
    }

    @Override
    public void turnOff() {
        System.out.println("laptop off");
    }

    @Override
    public void downloadApp() {
        System.out.println("laptop download apps");
    }
}
