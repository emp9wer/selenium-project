package src.day33_abstraction.employeeTask;

public class Runner {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alice",26,'F',"n114","Math Teacher",50000);
        System.out.println(teacher);
        teacher.work();
        Developer developer = new Developer("Ben",22,'M',"o99","Java dev",120000,"Java");
        System.out.println(developer);
        developer.work();
        Tester tester = new Tester("Vasil",23,'M',"afafa22","Java SDET",150000);
        System.out.println(tester);
        tester.work();



    }
}
