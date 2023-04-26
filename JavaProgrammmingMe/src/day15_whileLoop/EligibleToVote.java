package src.day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age");
        int age = input.nextInt();

        while (!(age>=1 && age<=120)){ // while age is not valid
            System.err.println("invalid - re-enter");
            age = input.nextInt();
        }
        System.out.println("are you a Us citizen?");
        String yesOrNo = input.next().toLowerCase();

        while(!(yesOrNo.equals("yes") || yesOrNo.equals("no") )){
            System.err.println("invalid entry - re-enter");
            yesOrNo = input.next().toLowerCase();
        }
        if(yesOrNo.equals("yes") && age >=21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }





    }
}
