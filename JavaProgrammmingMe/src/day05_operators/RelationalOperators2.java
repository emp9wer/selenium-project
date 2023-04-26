package src.day05_operators;

public class RelationalOperators2 {
    public static void main(String[] args) {
        System.out.println("equal operator ==   ---------------------------------------");
        //equal operator ==
        System.out.println(1000 == 2000); // false
        System.out.println(1 == 1); //true
        System.out.println("Java" == "Java"); // true
        System.out.println("JAVA" == "java"); // false
        System.out.println("Java" == "C++"); // false
        System.out.println( true == false ); // false

        System.out.println("not equal operator !=   ---------------------------------------");
        //not equal operator !=
        System.out.println(1000 != 2000); // true
        System.out.println(1 != 1); //false
        System.out.println("Java" != "Java"); // false
        System.out.println("JAVA" != "java"); // true
        System.out.println("Java" != "C++"); // true
        System.out.println( true != false ); // true


    }
}
