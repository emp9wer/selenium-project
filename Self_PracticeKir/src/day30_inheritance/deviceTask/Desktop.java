package day30_inheritance.deviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, double ramSize, boolean isI7) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, ramSize, isI7);
    }

    public void upgrade(boolean isMoreRAM,boolean i7){
        if(isMoreRAM&&i7){
            System.out.println("RAM and CPU are upgraded");
        }
        else if(isMoreRAM){
            System.out.println("RAM is upgraded");
        }
        else if(i7){
            System.out.println("CPU is upgraded");
        }else {
            System.out.println("Nothing is upgraded");
        }

    }
}
