package src.week7;

import java.util.Arrays;

public class LanguageCharacters {
    /*
    LanguageCharacters [array, char, loop, method]

    Create a method that will accept a String for the language name. Based on the given language name return a char array of the characters that are used in that language. We will use ascii numbers

    Use the following ranges:

    English: 33 - 126

    Greek: 884 - 1011

    Arabic: 1548 - 1790

    Chinese, Japanese, Korean or Vietnamese:  63744 - 64045
        (this group of characters are the: CJK Compatibility Ideographs)

    Braille: 10240 - 10495
     */


    /**
     * The method will return a char[] will all of the characters of the given language
     * @param language - String arg that determines which set of characters to return
     * @return - a char[] stores all the characters of the define range
     *
     * The switch statement is used to determine which range should be used based on the given language
     * If no matching language is given the method returns null which stops the method and gives to char array back, but the no value null
     *
     * Then a char array is made with the size based on the range. The characters are added into the array one index at a time. The loop iterates through the indexes of the char array. start++ is used to go through the numbers of the characters in each language and that number is cast to a char in order to be assigned into the array
     *
     */
    public static char[] getCharactersForLang(String language){

        int start;
        int end;

        switch (language.toLowerCase()){
            case "english":
                start = 33;
                end = 126;
                break;
            case "greek":
                start = 884;
                end = 1011;
                break;
            case "arabic":
                start = 1548;
                end = 1790;
                break;
            case "chinese":
            case "japanese":
            case "korean":
            case "vietnamese":
                start = 63744;
                end = 64045;
                break;
            case "braille":
                start = 10240;
                end = 10495;
                break;
            default:
                return null;
        }

        char[] chars = new char[end - start];

        for(int i = 0; i < chars.length; i++){
            chars[i] = (char)start++;
        }

        return chars;
    }

    // printing all of the arrays
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCharactersForLang("english")));
        System.out.println(Arrays.toString(getCharactersForLang("greek")));
        System.out.println(Arrays.toString(getCharactersForLang("arabic")));
        System.out.println(Arrays.toString(getCharactersForLang("korean")));
        System.out.println(Arrays.toString(getCharactersForLang("braille")));
    }

}
