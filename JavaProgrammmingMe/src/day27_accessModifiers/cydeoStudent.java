package src.day27_accessModifiers;

public class cydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;


    public cydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static{
        schoolName = "CYDEO";
        secretCode = "Wooden Spoon";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }




}

