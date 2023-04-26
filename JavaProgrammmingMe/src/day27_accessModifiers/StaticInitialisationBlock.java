package src.day27_accessModifiers;

public class StaticInitialisationBlock {

    public static int a;
    public static double b;
    public static String c;

    // public static ExcelSheet sheet;

    static { // static block gets executed when we call class and it sets static variables
        a = 100;
        b = 20.5;
        c = "Java";
    }




}
