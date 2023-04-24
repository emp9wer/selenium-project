package Self_PracticeKir.day14_forLoops;
import java.util.Random;
public class ReturnPalindromeInterviewTask {
    public static void main(String[] args) {
        int ran = new Random().nextInt('z' - 'a') + 'a'; // a - z random letter number
        char r = (char) ran;
        String w = "????aa"; // ?ab??a  aabbaa //bab??a NO // ?a? aaa or zaz //?x??z?=>NO //?ab???=>sabbas or fabbaf //  a??baa
        //          012345   // ?x??z? NO  // a?bbaa - aabbaa // ??bbaa aabbaa // ????aa aaddaa
        String res = "";
        boolean notPalindrome = false;
        int t = w.length();
        for (int i = 0; i <= w.length() / 2; i++) { // check if palindrome

                     if ((w.charAt(i) == w.charAt(w.length()-1-i))
                    || (w.charAt(i)=='?' && w.charAt(w.length()-1-i) != '?')
                    || ((w.charAt(w.length()-1-i)) == '?' && w.charAt(i) != '?')) {
                    }else{
                        notPalindrome = true;
                    }
        }
            if (notPalindrome) {
                res = "NO";
            } else {
                for (int z = 0; z < w.length(); z++) {
                    if (w.charAt(z) == '?') {
                        res += "" + w.charAt(w.length() - 1 - z);
                    } else {
                        res += "" + w.charAt(z);
                    }
                }
                if (res.contains("?")) {
                    res = res.replace('?', r);
                }
            }
            System.out.println(res);









      /* if (w.charAt(0) == '?' && w.charAt(w.length() - 1) == '?')  {
                res = w.replace('?', r);
            } else if ((w.charAt(0) != w.charAt(w.length()-1)) && (w.charAt(0) != '?' && w.charAt(w.length()-1) != '?') ) {
                res = "NO";
            }else {
          for (int i = 0; i < w.length(); i++) {
                 if(w.charAt(i) == '?'){
                     res += "" + w.charAt(w.length()-1-i);
          }else{
                     res += "" + w.charAt(i);
                 }
          }
  }
        */



    }
}
/*
37 2. Write a function solution that, given a string S of length N, returns any palindrome which can be obtained by replacing all of 38 the question marks in S by lowercase letters ('a'-'z'). If no palindrome can be obtained, the function should return the string 39 "NO".
40 A palindrome is a string that reads the same both forwards and backwards. Some examples of palindromes are: "kayak", "radar", "mom 41 42 Examples:
43 1. Given S = "?ab??a", the function should return "aabbaa".
44 2. Given S = "bab??a", the function should return "NO".
45 3. Given S = "?a?", the function may return "aaa". It may also return "zaz", among other possible answers.
16
 */