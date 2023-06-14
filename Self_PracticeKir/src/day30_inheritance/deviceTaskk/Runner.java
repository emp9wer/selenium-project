package src.day30_inheritance.deviceTaskk;

public class Runner {
    public static void main(String[] args) {


        Device d1 = new Device("Nokia","3210","black",5,1000,true,true);
        d1.turnOn();
        Phone p1 = new Phone("Apple","iphone12","gold",12.9,1200,true,true);
        p1.turnOn();

        Laptop apple = new Laptop("apple","macbook air","silver",13,700,true,true,16,true,true);
        apple.throwAway();

        System.out.println(apple);
    }
}
