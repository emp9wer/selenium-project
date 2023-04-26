package day31_methodOverriding.studentTask;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person("Saim",35,'M');
        System.out.println(p1);

        System.out.println("----student-------");

        Student s1 = new Student("Mike",22,'M',"1232","Math",'A',"515B");
        System.out.println(s1);
        s1.study();
        s1.sleep(2);

        System.out.println("----------GraduateStudent---------");

        GraduateStudent g1 = new GraduateStudent("Alex",24,'M',"baafsa124","Biology",'B',"C1515");
        System.out.println(g1);
        g1.study();

        System.out.println("----CydeoStudent-----");

        CydeoStudent c1 = new CydeoStudent("Kir",32,'M',"i77","SDET",'A',"CYDEO",29,2,"Java");
        c1.eat("food");
        c1.drink("water");
        c1.sleep(4);
        c1.study();
        System.out.println(c1);

    }


}
