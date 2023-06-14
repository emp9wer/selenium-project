package src.day34_interface.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String size, double price, boolean hasBattery, boolean hasPowerButton,String color) {
        super(brand, model, size, price, hasBattery, hasPowerButton,color);
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is calling "+phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is texting "+phoneNum);
    }

    @Override
    public String toString() {
        return getModel()+" "+getBrand()+" "+getColor()+" "+getSize()+" "+ getPrice();
    }
}
