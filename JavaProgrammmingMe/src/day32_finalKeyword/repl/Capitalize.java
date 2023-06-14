package day32_finalKeyword.repl;

import java.util.ArrayList;
import java.util.Arrays;

public class Capitalize {

    public static String capitalize(String word) {

        if(word.isEmpty()){
            return "";
        }
        return word.substring(0,1).toUpperCase()+word.substring(1);


    }


    /**
     Utility static method: isTitleWord
     -This method will be used in setTitle() method
     -Accepts a words to check if it is a part of the title or just an article etc.
     - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
     -else method returns true
     Articles:
     "a" , "an", "the"
     Coordinate conjunctions:
     "and", "but", "for", "nor", "or", "so", "yet"
     Most common single-word English prepositions:
     "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"

     isTitleWord("Apple") => true
     isTitleWord("a") => false
     isTitleWord("BUT") => false
     isTitleWord("THE") => false
     isTitleWord("neaR") => false
     isTitleWord("java") => true
     */


    public static boolean isTitleWord(String word) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a" , "an", "the","and", "but", "for", "nor", "or", "so", "yet","at", "by", "in", "into", "near", "of", "on", "to", "than", "via"));
        if(list.contains(word)){
            return false;
        }else {
            return true;
        }
    }


    public static void main(String[] args) {

        String a = "hello";
        String b ="";
        System.out.println(capitalize(a));
        System.out.println(capitalize(b));

        //////////////////////////////////////////////

        System.out.println(isTitleWord("a"));
        System.out.println(isTitleWord("an"));
        System.out.println(isTitleWord("via"));
        System.out.println(isTitleWord("apple"));

     //   Author z = new Author("");
     //   Author d = new Author("miKe aDams");

       // System.out.println(z.author);
       // System.out.println(d.author);

    }
}
