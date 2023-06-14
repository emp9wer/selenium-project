package src.day34_interface.carTask;

public class Runner {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Prius",2007,5000,"Silver");

        toyota.drive();
        toyota.start();


        System.out.println("-------------------");

        Tesla tesla = new Tesla("Tesla","model y",2020,50000,"Black");


        tesla.start();
        tesla.drive();
        tesla.autoPark();
        tesla.selfDrive();
        String msgTesla = tesla.toString();
        System.out.println(msgTesla);
        System.out.println("-----------------------");

        Audi audi = new Audi("Audi","Q6",2015,20000,"White");

        audi.start();
        audi.drive();
        audi.autoPark();
        System.out.println(audi);


    }
}
