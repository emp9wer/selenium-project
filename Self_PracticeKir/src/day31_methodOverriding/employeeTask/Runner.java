package day31_methodOverriding.employeeTask;

public class Runner {
    public static void main(String[] args) {


        Tester tester = new Tester("Kirill", "b232", "Sdet", "Pnc", 32, 'M', 130000);
        System.out.println(tester);
            tester.work();

            Developer developer = new Developer("Mike","b1525","Java DEV","Goggole",55,'M',144444,"Java");
        System.out.println(developer);
        developer.work();

        Teacher teacher = new Teacher("Maya","2244f","Math Teacer","School number 10",35,'F',70000);
        System.out.println(teacher);
        teacher.work();



    }
}
