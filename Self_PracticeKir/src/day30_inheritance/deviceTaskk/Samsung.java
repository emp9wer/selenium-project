package day30_inheritance.deviceTaskk;

public class Samsung extends Phone{
    public Samsung(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void freeze(){
        System.out.println(getModel()+" is frozen now");
    }
}
