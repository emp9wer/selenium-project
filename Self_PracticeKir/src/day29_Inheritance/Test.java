package src.day29_Inheritance;

public class Test {
   static String s = "s";
   static {
       s="b";
   }

    public static void main(String[] args) {
        s = "j";
        System.out.println(s);
    }
}
