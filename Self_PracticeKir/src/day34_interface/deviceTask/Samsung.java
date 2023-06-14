package src.day34_interface.deviceTask;

public class Samsung extends Phone implements Downloadable,AndroidApps{

    public Samsung(String brand, String model, String size, double price, boolean hasBattery, boolean hasPowerButton,String color) {
        super(brand, model, size, price, hasBattery, hasPowerButton,color);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void downloadApp() {

    }
}
