package day30_inheritance.deviceTask;

public class Iphone extends Phone {

    private boolean hasIcloud;



    public Iphone(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, boolean hasIcloud) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        this.hasIcloud = hasIcloud;
    }

    public boolean isHasIcloud() {
        return hasIcloud;
    }
    public void setHasIcloud(boolean hasIcloud) {
        this.hasIcloud = hasIcloud;
    }

    public void faceTime(long phoneNumber){
        System.out.println(getClass().getSimpleName()+" "+getBrand()+" "+getModel()+" is face timing "+ phoneNumber);
    }


}
