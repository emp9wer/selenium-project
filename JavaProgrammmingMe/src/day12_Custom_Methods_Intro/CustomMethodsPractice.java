package src.day12_Custom_Methods_Intro;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        int a = 10000;
        int b = 20000;
        maxNum(a,b);
        maxNum(1111,222);
        maxNum(2,2);

        System.out.println("------------------------");

        initial("boris", "blade");

        String firstN = "Kir", lastN="Kand";
        initial(firstN,lastN);



    }
  // compare numbers
    public static void maxNum(double num1 , double num2){

        System.out.println((num1>num2) ? num1 + " is the max number" :( num1 < num2) ? num2 + " is the max number" : num1+ " is equal to "+ num2);
    }

 // create initial of a person
    public static void initial(String firstName, String lastName){
        String initial = firstName.charAt(0) +"."+ lastName.charAt(0);
        System.out.println("initial is = " + initial.toUpperCase());
    }



}
