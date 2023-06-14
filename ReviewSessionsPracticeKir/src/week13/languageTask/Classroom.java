package week13.languageTask;

public class Classroom {
    public static void main(String[] args) {

        English english = new English();
        english.hello();
        english.bye();
        System.out.println();

        Spanish spanish = new Spanish();
        spanish.hello();
        spanish.bye();
        System.out.println(spanish.DEFAULT_ENCODING);
        System.out.println(Language.DEFAULT_ENCODING); // correct way to access

        //spanish.description(); // static methods are not inherited



    }
}
