package src.day13_CustomMethodsContinue;

import java.util.Scanner;

public class WarmUpTaskCalculate {
    public static void main(String[] args) {

        calculate(5,22,'(');

        Scanner input  = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        char c1 = input.next().charAt(0);
        calculate(n1,n2,c1);


    }

    public static void calculate(double num1, double num2, char mathOperator){

        switch (mathOperator){
            case '+' :
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+ (num1+num2));
                break;
            case '-' :
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+ (num1-num2));
                break;
            case '*' :
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+ (num1*num2));
                break;
            case '/' :
                System.out.println(num1+" "+mathOperator+" "+num2+" = "+ (num1/num2));
                break;
            default:
                System.err.println("Invalid operator: "+mathOperator);
                break;

        }

    }  // parameters must be passed in order


}
