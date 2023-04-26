package day29_Inheritance.phoneTask;

public class Samsung extends Phone{

    @Override
    public void setBrand(String brand) {
        super.setBrand("Samsung");
    }
    public void freeze(){
        System.out.println(getBrand()+" is frozen");
    }
}
