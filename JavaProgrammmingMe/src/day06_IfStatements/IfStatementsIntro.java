package src.day06_IfStatements;

public class IfStatementsIntro {
    public static void main(String[] args) {

        int number =  -2;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        if ( isPositive ) {
            System.out.println(number+" is positive");
        }
        if (isNegative) {
            System.out.println(number+ " is negative");
        }
        if (isZero) {
            System.out.println(number + " is zero");
        }
        System.out.println("----------------------------------------------------------------");

        int num = 4;

        if(num>0){
            System.out.println(num+" positive");
        }
        if(num<0){
            System.out.println(num+" negative");
        }
        if(num==0){
            System.out.println(num+" zero");
        }
    }
}
