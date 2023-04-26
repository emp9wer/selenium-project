package day11_String;

import java.util.Scanner;

public class TipCalculator_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)");
        String split = "";
        split = scan.nextLine(); // yes / no
        System.out.println("Enter the number of people (number)");
        int people = 0;
        people = scan.nextInt(); // num of ppl
        System.out.println("Enter the check amount (number) ");
        double amount = 0;
        amount = scan.nextDouble(); // amount3
        scan.nextLine();
        System.out.println("Service Quality (Excellent/Great/Good/Fair/Poor)");
        String serviceQ = "";
        serviceQ = scan.nextLine();           //                          serviceQ
        split = split.toLowerCase();
        serviceQ = serviceQ.toLowerCase();
        double tip = 0;
        if (serviceQ.equals("excellent")) {
            tip = amount * 0.25;
        } else if (serviceQ.equals("great")) {
            tip = amount * 0.2;
        } else if (serviceQ.equals("good")) {
            tip = amount * 0.15;
        } else if (serviceQ.equals("fair")) {
            tip = amount * 0.1;
        } else {
            tip = amount * 0.05;
        }
        double total = amount + tip;
        double totPerPerson = total / people;
        double tipPerPerson = tip / people;
        String result = "Number of people entered: " + people + " \nTotal to pay: " +
                total + "\nTotal tip: " + tip + "\nTotal per person: " + totPerPerson + "\nTip per person: " + tipPerPerson;
        if (split.equals("no")) {
            result = "Number of people entered: " + people + " \nTotal to pay: " +
                    total + "\nTotal tip: " + tip;}
        System.out.println(result);
        scan.close();
        }
    }


/*
8. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

 */