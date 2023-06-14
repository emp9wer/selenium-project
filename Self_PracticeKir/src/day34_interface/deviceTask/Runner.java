package src.day34_interface.deviceTask;

public class Runner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Asus","k53e","14",300,true,true,"blue");
        System.out.println(laptop);
        laptop.turnOn();
        laptop.burnCD();
        laptop.downloadApp();
        laptop.turnOff();

        System.out.println("----------------");

        Iphone iphone = new Iphone("Apple","12","12",1222,true,true,"black");
        iphone.downloadApp();
        System.out.println(iphone);

    }
}
