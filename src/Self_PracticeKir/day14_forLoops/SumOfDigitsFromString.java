package Self_PracticeKir.day14_forLoops;

public class SumOfDigitsFromString {
    public static void main(String[] args) {
String word = "A1B2C35";
        int num =0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i)<='9'){
                num += word.charAt(i) - 48;
            }
        }
        System.out.println(num);//11





    }
}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */