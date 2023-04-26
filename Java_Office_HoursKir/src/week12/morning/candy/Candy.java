package week12.morning.candy;

public class Candy {
    static int totalInTheWorld = 50000000;
    static String largestConsumer ="US";

    String brand;
    int quantity;
    boolean hasPeanuts;

    public Candy(int quantity, boolean hasPeanuts) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString(){
    return "I have "+quantity+" "+brand+" which "+(hasPeanuts? "has" : "doesnt have")+ " peanuts";
    }


}
