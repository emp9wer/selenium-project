package day30_inheritance.deviceTaskk;

public class Iphone extends Phone{

    public Iphone(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void facetime(long number){

        System.out.println(getModel() +" face timing to " + number);
    }

}
