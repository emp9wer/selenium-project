package day18_MemoryManagement;public class HighestFrequency_01GPT {
    public static void main(String[] args) {

        String str = "aaabbccccddeeee";
        char maxChar = '\0';
        int maxCount = 0;

        // iterate over the characters in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;

            // count the frequency of the current character
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // update the character with the highest frequency
            if (count > maxCount) {
                maxChar = ch;
                maxCount = count;
            }
        }

        // iterate over the characters again to check for ties
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 1;

            // count the frequency of the current character
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // check for ties and print all characters with the highest frequency
            if (count == maxCount && ch != maxChar) {
                System.out.println(ch);
            }
        }

        // print the character with the highest frequency
        System.out.println(maxChar);
    }
}
