package src.day06_IfStatements;

public class SingleIfStatementPractice {
    public static void main(String[] args) {
        int number = 100;
        boolean isOdd = number % 2 != 0;
        if(isOdd) {
            System.out.println(number + " is odd number");
        }
        if(!isOdd) {
            System.out.println(number + " is even number");
        }
        System.out.println("________________________________________________________");

        int num = 155;

        if(num % 2 == 0){
            System.out.println("even " + num);
        }
        if(num % 2 != 0){
            System.out.println("odd " + num);
        }





    }
}
