package Self_PracticeKir.day30_inheritance.deviceTask;

public class Runner {
    public static void main(String[] args) {

        Phone iphone12 = new Phone("Apple","12 pro max","Gold",12.9,1200,true,true);
        iphone12.turnOn();
        iphone12.call(4123200422l);
        iphone12.text(4123200422l);
        iphone12.turnOff();
        System.out.println(iphone12);


        System.out.println("-----------------");

        Computer c1 = new Computer("Apple","macbook air","silver",13.2,1000,true,true,16,false);
        System.out.println(c1);
        c1.restart();

        System.out.println("--------------------");

        Iphone i1 = new Iphone("Apple","12","black",12,900,true,true,true);
        i1.faceTime(412412412414l);

        System.out.println("----------------------------");

        Samsung s1 = new Samsung("Samsung","galaxy s1","black",9,200,true,true);

        s1.freeze();

        System.out.println("--------------------");

        Laptop laptop = new Laptop("Apple","macbook pro","silver",14,2000,true,true,16,true);
        laptop.throwAway();

        System.out.println("---------------------");

        Desktop desktop = new Desktop("Hp","compaque","black",10,1000,false,true,32,true);

        desktop.upgrade(true,true);
        desktop.upgrade(false,true);
        desktop.upgrade(true,false);
        desktop.upgrade(false,false);

        System.out.println("-------------------");

        SmartTV smartTv = new SmartTV("LG","121212","white",55,300,false,true);
        System.out.println(smartTv);
        smartTv.hulu();


    }




}
