package src.day18_MemoryManagement;
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */
public class HighestFrequency_01 {
    public static void main(String[] args) {

        String str = "aaabbccccddeeaee"; // "ssssaaggabbccccddeesssssee";   "aaabbcccaaazzzcddeeee";  "aaabbcfffcccddeeee";
        String result = "";
        int maxFrequency = 0;

        for (int i = 0; i < str.length(); i++) { //outer loop iterates for each char of string

            int count = 0; // counter reset to 0 every iteration of outer loop

            if (result.contains("" + str.charAt(i))) { //skips loop if result contains letter
                continue;
            }

            for (int j = 0; j < str.length(); j++) { // checks each char of string for match
                if (str.charAt(i) == str.charAt(j)) {
                    count++;                                      // & counts frequency
                }
            }

            if (count > maxFrequency) { // re-writes result to max occurring letter
                result = "" + str.charAt(i);               // &  re-writes max frequency to count
                maxFrequency = count;
            } else if (count == maxFrequency) { //adds letter to result that is equal to max occuring;
                result += "\n" + str.charAt(i);
            }

        }

        System.out.println(result);

    }

}
