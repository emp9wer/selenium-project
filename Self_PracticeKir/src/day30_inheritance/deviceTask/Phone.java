package day30_inheritance.deviceTask;

public class Phone extends Device{
    public Phone(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" is calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" is texting " +  phoneNumber);
    }
}
