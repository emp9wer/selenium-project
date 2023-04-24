package week8.evening;

public class T4LongestPalindrome {
    /*
    T4LongestPalindrome [array, loop, String]

    Create a program that will define a String array of words. Find the longest palindrome String from that array. If no palindrome is found print: No Palindrome Found

    Ex:
        {java, long word, civic, apple, racecar, mom, anna, really long word}
        longest palindrome is: racecar

        {abc, hello, world, java}
        No Palindrome Found
     */

    public static void main(String[] args) {
     String[] words =    {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};
String longest ="";

        for (String ea : words) {
            if(isPalindrome(ea)&& ea.length()>longest.length()){
                longest=ea;
            }
        }
        System.out.println(longest);
    }



    public static boolean isPalindrome(String word){
        boolean res =true;
        for (int i = 0; i < word.length()/2; i++) {
            char fromBeginning = word.charAt(i);
            char fromLast = word.charAt(word.length()-1-i);
            if(fromBeginning != fromLast){
                res = false;
                break;
            }


        }
        return res;
    }




}
