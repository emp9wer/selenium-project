package day14_forLoops;
public class RetrieveFromString_5 {
    public static void main(String[] args) {
        String word = "mn@#123Ab!";
        String letters = "letters: ";
        String digits = "digits: ";
        String specialChar = "special chars: ";
        for(int i = 0; i < word.length() ; i++) {
            if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {
                letters += word.charAt(i);
            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                digits += word.charAt(i);
            } else {
                specialChar += word.charAt(i);
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);
    }
}
/*
5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */