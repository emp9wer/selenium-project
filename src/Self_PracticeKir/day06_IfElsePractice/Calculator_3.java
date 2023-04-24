package Self_PracticeKir.day06_IfElsePractice;

public class Calculator_3 {
    public static void main(String[] args) {
        double n1 = 10, n2 = 20;
        char mathOperator = '-'; //1 = invalid operator 0.0; + = 30.0; / = 0.5
        double result = 0;
        if ((mathOperator == '+') || (mathOperator == '-') || (mathOperator == '*') || (mathOperator == '/')) {

            if (mathOperator == '+') {
                result = n1 + n2;
                System.out.println("fart");
                System.out.println("fartfart");
            }
            if (mathOperator == '-') {
                result = n1 - n2;
            }
            if (mathOperator == '*') {
                result = n1 * n2;
            }
            if (mathOperator == '/') {
                result = n1 / n2;
            }
            System.out.println(result);
        } else {
            System.out.println("invalid operator");
        }
    }
}
/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

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
 */