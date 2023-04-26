package src.day12_Custom_Methods_Intro;

public class customMethodsWithParameter {


    public static void main(String[] args) {
int num1 =100;
isOddOrEven(num1);
int num2 = 99;
isOddOrEven(num2);



    }
    public static void isOddOrEven(int number){    // the method takes number and verifies if the number is odd or even
        System.out.println((number % 2 == 0) ? "even" : "odd" );
    }





}
