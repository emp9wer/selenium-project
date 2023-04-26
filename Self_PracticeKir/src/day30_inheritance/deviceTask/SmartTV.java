package day30_inheritance.deviceTask;

public class SmartTV extends TV{
    public SmartTV(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void hulu(){
        System.out.println(getBrand()+" "+getModel()+" is running hulu app");
    }
}
