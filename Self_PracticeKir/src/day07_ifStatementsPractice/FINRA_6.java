package day07_ifStatementsPractice;

public class FINRA_6 {      //AKA FIZZBUZZ
    public static void main(String[] args) {
        int number = 5;
        String result = "";
        if (number % 5 == 0 || number % 3 == 0) {
            if (number % 5 == 0 && number % 3 == 0) {
                result = "FINRA";
            } else if (number % 5 == 0) {
                result = "RA";
            } else {
                result = "FIN";
            }
        } else {
            result = "INVALID INPUT - NOT MULTIPLE OF 3 OR 5";
        }
        System.out.println(result);
    }
}
/*
6. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA
 */