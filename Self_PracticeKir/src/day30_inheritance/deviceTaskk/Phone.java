package src.day30_inheritance.deviceTaskk;

public class Phone extends Device{

    public Phone(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long number){
        System.out.println(getClass().getSimpleName()+" "+getBrand()+" "+ getModel()+" is calling "+number);
    }

    public void text(long number){
        System.out.println(getClass().getSimpleName()+" "+getBrand()+" "+ getModel()+" is texting "+number);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("haha phone turned on");
    }
}
