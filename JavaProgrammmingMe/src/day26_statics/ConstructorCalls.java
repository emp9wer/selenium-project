package src.day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");

    }


    public static void main(String[] args) {

        method1();
        System.out.println("11111111111111111");

        method2();



    }



    public static void method1(){
        System.out.println("method 1");
    }
    public static void method2(){
        method1();
        System.out.println("method 2");
    }

}
