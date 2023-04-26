package src.day06_IfStatements;
public class OddOrEven {
    public static void main(String[] args) {
        int number = 11;
        boolean isEven = number % 2 == 0; // when we divide a number b 2, if the remainder is 0 it means number is even
        boolean isOdd = !isEven; // when we divide a number b 2, if the remainder is not 0 it means number is odd
        System.out.println(number+" is an even number: "+isEven+"\n"+number+" is an odd number: "+isOdd);
        /*
        1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

		 output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
		 */
    }
}

