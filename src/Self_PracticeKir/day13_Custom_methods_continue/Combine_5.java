package Self_PracticeKir.day13_Custom_methods_continue;

public class Combine_5 {
    public static void main(String[] args) {
        System.out.println(combine("one","aight"));

    }

    public static String combine (String a,String b){
       String ab = ( a.substring(a.length()-1).equals(b.substring(0,1) ) ) ?
                 a + b.substring(1) :  a + b;
       return ab;
    }
}
