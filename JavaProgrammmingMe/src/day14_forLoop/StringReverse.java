package src.day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {


        String word = "Muhtar";
                   //  0123
        String reverse = "";

        for(int i = word.length()-1; i>=0; i--) {
        reverse += word.charAt(i);
        }
        System.out.println(reverse);



    }





}
