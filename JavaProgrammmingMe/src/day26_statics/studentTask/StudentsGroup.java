package src.day26_statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        // students=new ArrayList<>(); // size 0
    }

    public void addStudent  (Student student){ // takes 1 student object and adds it to array list of students
        students.add(student);
    }
    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public void addStudent(String name , int age, char gender, String id){ // takes name gender age id of student , creates student object using given info // then adds to ArraysList of students

       // Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
    }

    public void removeStudent(String id){ // takes the id and removes student object with specified id;
        students.removeIf(p -> p.id.equals(id));
    }


    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students. size() +
                '}';
    }
}
