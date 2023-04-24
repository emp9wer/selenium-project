package Self_PracticeKir.day30_inheritance.deviceTaskk;

public class Computer extends Device{

    private int ram;
    private boolean isI7;

    public Computer(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, int ram, boolean isI7) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
      setRam(ram);
      setI7(isI7);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isI7() {
        return isI7;
    }

    public void setI7(boolean i7) {
        isI7 = i7;
    }

    public void upgrade(boolean moreRam){
        if(moreRam){
            System.out.println("memory is upgraded");
        }else {
            System.out.println("memory is not upgraded");
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+", = isI7 " + isI7 + " "
                +", = ram " + getRam() + "}";

    }
}
