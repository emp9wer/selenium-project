package src.day27_accessModifiers;

public class StaticBlockVsInstanceBlockVsConstructor {
//constructor
    public StaticBlockVsInstanceBlockVsConstructor(){
        System.out.println("constructor");
    }

//instance block // depends on object
    {
        System.out.println("instance block");
    }

//static block // does not executes more than once // executes first - before main method!
    static {
    System.out.println("static block");
}

//main method
    public static void main(String[] args) {
        System.out.println("main method");
    }




}
