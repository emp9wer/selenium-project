package src.day30_inheritance.deviceTask;

public class Samsung extends Phone{
    public Samsung(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void freeze(){
        System.out.println(getBrand()+" "+getModel()+" freezes");
    }

}
