package week7;

import java.util.Arrays;

public class ReverseMiddleWord {

    public static void main(String[] args) {

        String str =  "more java please";
        String[] eachWord =str.split(" ");
        System.out.println(Arrays.toString(eachWord).replace(",", "").replace("[","").replace("]",""));
String reverse ="";
        for(int i=eachWord[1].length()-1; i>=0;i-- ){
            reverse += eachWord[1].charAt(i);

        }
            eachWord[1] = reverse;
        System.out.println(Arrays.toString(eachWord).replace(",", "").replace("[","").replace("]",""));

        



    }

}
