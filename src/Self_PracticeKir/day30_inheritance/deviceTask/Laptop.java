package Self_PracticeKir.day30_inheritance.deviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, double ramSize, boolean isI7) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, ramSize, isI7);
    }

    public void throwAway(){
        System.out.println(getBrand()+" "+getModel()+" is thrown away");
    }

}
