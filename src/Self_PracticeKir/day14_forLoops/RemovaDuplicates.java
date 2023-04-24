package Self_PracticeKir.day14_forLoops;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        String res ="";

        for(int i=0;i<str.length();i++ ){

            if(!res.contains(""+str.charAt(i))){
                res+=str.charAt(i);
            }
        }
        return res;



    }
}