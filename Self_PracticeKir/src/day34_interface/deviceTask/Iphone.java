package src.day34_interface.deviceTask;

public class Iphone extends Phone implements Downloadable,AppleApps{
    public Iphone(String brand, String model, String size, double price, boolean hasBattery, boolean hasPowerButton,String color) {
        super(brand, model, size, price, hasBattery, hasPowerButton,color);
    }

    @Override
    public void turnOn() {
        System.out.println("turning on "+getBrand()+" "+ getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("turning off "+getBrand()+" "+ getModel());
    }


    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+ getModel()+" is downloading app");
    }
}
