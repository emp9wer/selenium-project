package Self_PracticeKir.day31_methodOverriding.sampleStaticBlock;

public class Person {

    public static boolean hasLegs;
    public static boolean hasEyes;
    public static String str;
    public String name;

    public Person(String name) {
        this.name = name;
    }


    static {

        hasLegs=true; //1
        hasEyes = true;//2
        str = "hello";//3

        System.out.println("static block running");//4
    }


    @Override //5
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "hasLegs='" + hasLegs + '\'' +
                "hasEyes='" + hasEyes + '\'' +
                '}';
    }



    public void hello(){
        System.out.println("hello");
    }



}
