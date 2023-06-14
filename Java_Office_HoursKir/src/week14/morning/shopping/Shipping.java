package week14.morning.shopping;

public interface Shipping {

    //variables will be public static final

    void shipItem(); // public abstract


    default void notification(){
        System.out.println("ending email: package shipped");
    }










}
