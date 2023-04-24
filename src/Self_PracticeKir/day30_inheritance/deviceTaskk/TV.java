package Self_PracticeKir.day30_inheritance.deviceTaskk;

public class TV extends Device {

    public TV(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getClass().getSimpleName()+" "+getBrand()+" "+ getModel()+" channelUp ");
    }
    public void channelDown(){
        System.out.println(getClass().getSimpleName()+" "+getBrand()+" "+ getModel()+" channelDown ");
    }
}
