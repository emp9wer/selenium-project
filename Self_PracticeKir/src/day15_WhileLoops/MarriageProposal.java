package src.day15_WhileLoops;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        System.out.println(marriageProposal());

    }
    public static String marriageProposal(){
        String yesOrNo;
        System.out.println("Will you marry me - yes or no?");
        Scanner scan = new Scanner(System.in);
        yesOrNo = scan.nextLine();
        while (!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no") )){
            System.out.println("Invalid answer, please re-enter");
            yesOrNo = scan.nextLine();
        }
        scan.close();
        if (yesOrNo.equalsIgnoreCase("yes")){
            return "Congrats.";
        }else{
            return "Goodbye";
        }


    }



}


/*
1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */