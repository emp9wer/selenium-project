package src.day08_TernariesAndSwitch;

public class Calculator_7 {
    public static void main(String[] args) {
            // Switch statement
        double n1 = 2  ,  n2 = 3;

        char operator = '+'; // * / + -

        double add = n1+n2;
        double subtract = n1-n2;
        double multiply = n1*n2;
        double divide = n1/n2;
        String result;

        switch (operator){
            case '*' : result = "" + multiply;
            break;
            case '/' : result ="" + divide;
            break;
            case '-' : result ="" + subtract;
            break;
            case '+' : result ="" + add;
            break;
            default: result = "invalid operator";
            break;
        }
        System.out.println(result);





    }



}
/*
7. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

		Note: MUST use switch statement
 */