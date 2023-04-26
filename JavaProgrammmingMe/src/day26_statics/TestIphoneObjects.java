package src.day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone12","Gold",1200);


        System.out.println(iphone1.model);
        System.out.println(iphone1.color);
        System.out.println(iphone1.price);

        iphone1.printPhoneInfo();



        System.out.println(Iphone.brand); // call static from class proper way!




    }
}
