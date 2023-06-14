package src.day26_statics;

public class CydeoStudent {
//instance variable is variable that belongs to class

    public String name;
    public int age;
    public char gender;
    public String id;
    public int grade;
    public String batchNumber;
    public String groupNumber;

    public static String schoolName = "Cydeo";
    public static String magicWord = "Java";


    public CydeoStudent(String name, int age, char gender, String id, int grade, String batchNumber, String groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" attending class");
    }

    public static void printSchoolName(){
        System.out.println("school name is: "+ schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("programming language is: "+magicWord);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", programming language is='" + magicWord + '\'' +
                ", School name is:='" + schoolName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        CydeoStudent s1 = new CydeoStudent("Fedya Knopkin",33,'M',"133H",3,"29B","Anagram");

        s1.study();
        System.out.println();
        s1.attendClass();
        System.out.println();
        printSchoolName();
        System.out.println();
        printProgLanguage();
        System.out.println();
        System.out.println(s1);

    }


}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */