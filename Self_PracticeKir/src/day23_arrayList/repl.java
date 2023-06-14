package src.day23_arrayList;

import java.util.Arrays;

public class repl {
    public static void main(String[] args) {

        String a = "agsdgag14asgdsd3dgsgds5";

        char[] b= a.toCharArray();
        System.out.println(Arrays.toString(b));
        String digits ="";
        for (int i = 0; i < b.length; i++) {
            if(Character.isDigit(b[i])){
                digits+= b[i];
            }
        }
        System.out.println(digits);
    }
}
