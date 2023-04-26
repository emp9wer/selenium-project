package day29_Inheritance.employeeTask;

public class Test {
    public static void main(String[] args) {
        System.out.println("---------Tester-----------");
        Tester t1 = new Tester();

        t1.setInfo("Kir",'M',32,"b55544","SDET",140000);
        System.out.println(t1);
        t1.testing();

        System.out.println("--------------Developer-------------");


        Developer d1 = new Developer();

        d1.setInfo("Pasha",'M',45,"f443f","JavaDev",150000,"Java");

        System.out.println(d1);

        d1.coding();

        System.out.println("-----------Teacher-------------");
        Teacher te1 = new Teacher();
        te1.setInfo("Masha",'F',22,"1212121","Teacher",1000000000);
        System.out.println(te1);
        te1.teching();




    }


}
