package src.day28_Encapsulation;

public class IntTask1 {



    public static void main(String[] args) {
        String a = "afafafsfs";
        String b = "adsfsfgsgs";

        System.out.println(isEndTheSame(a, b));
    }

    public static boolean isEndTheSame(String a, String b){

        if(a.charAt(a.length()-1)==b.charAt(b.length()-1)){
            return true;
        }
            return false;
    }


}
