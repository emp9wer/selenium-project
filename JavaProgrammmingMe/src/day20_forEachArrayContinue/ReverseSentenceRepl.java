package src.day20_forEachArrayContinue;

import java.util.Arrays;

public class ReverseSentenceRepl {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        String[] s = sentence.split(" ");
        String[] rev =new String[s.length];

        for(int i =s.length-1, j=0; i >=0 ; i--) {
            rev[j++] = s[i];
        }
        String res = rev.toString();
        System.out.print(res);
        System.out.println(Arrays.toString(s));
    }
}
