package src.day26_statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student s1 = new Student("Babba",21,'M',"A16");
        Student s2 = new Student("Aksha",28,'F',"A26");
        Student s3 = new Student("Maruf",26,'M',"A34");
        Student s4 = new Student("Plebek",25,'M',"A57");
        Student s5 = new Student("Marat",23,'M',"A51");

        Student[] students = {s1,s2,s3,s4,s5};
        StudentsGroup g1 = new StudentsGroup("Java Turtles", 1);

        g1.addStudent(students);
        System.out.println(g1); //StudentsGroup{groupName='Java Turtles', groupId=1, number of students=5}

        g1.addStudent("Khaskavear",44,'M',"B55");
        System.out.println(g1); //StudentsGroup{groupName='Java Turtles', groupId=1, number of students=6}

        g1.removeStudent("A57");
        System.out.println(g1); //StudentsGroup{groupName='Java Turtles', groupId=1, number of students=5}

        for (Student ea : g1.students) {
            System.out.println(ea.name+"  "+ea.id);
        }


    }
}
