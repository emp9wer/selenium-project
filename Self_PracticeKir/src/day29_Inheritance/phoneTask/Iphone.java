package src.day29_Inheritance.phoneTask;

public class Iphone extends Phone{

    static String brand = "Apple";


    @Override
    public void setBrand(String brand) {
        super.setBrand("Apple");
    }
}
