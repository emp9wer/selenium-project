package src.day27_accessModifiers;

public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("main method");

    }
    static {
        System.out.println("static block"); // static block executes before main
    }

}
