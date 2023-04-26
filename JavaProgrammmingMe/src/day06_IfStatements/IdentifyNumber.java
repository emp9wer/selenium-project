package src.day06_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int givenNumber = -1;
        boolean isPositive = givenNumber > 0;
        boolean isNegative = givenNumber < 0;
        boolean isZero = !isPositive && !isNegative;
        System.out.println(givenNumber+" is positive number: "+isPositive+"\n"+givenNumber+" is negative number: "+
                isNegative+"\n"+givenNumber+" is zero: "+isZero);

    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */