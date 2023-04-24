package week11.t1;

public class Computer {
    public String os;
    protected int memory;
    String brand; // default access modifier
    private boolean hasWifi;


    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }
}
