package src.day30_inheritance.deviceTaskk;

public class Laptop extends Computer{

    public boolean isBroken;

    public Laptop(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, int ram, boolean isI7, boolean isBroken) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, ram, isI7);
        this.isBroken = isBroken;
    }

    public void throwAway(){
        if(getBrand().equalsIgnoreCase("apple")&&isBroken){
            System.out.println("throw it away");
        }else{
            System.out.println("keep it");
        }
    }
}
