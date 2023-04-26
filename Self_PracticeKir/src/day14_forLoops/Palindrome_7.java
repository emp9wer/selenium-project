package day14_forLoops;

public class Palindrome_7 {
    public static void main(String[] args) {

        boolean isPalindrome;
        String word = "Leve";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        isPalindrome = (word.equalsIgnoreCase(reverse)) ? true : false;
        System.out.println(isPalindrome);
    }
}
