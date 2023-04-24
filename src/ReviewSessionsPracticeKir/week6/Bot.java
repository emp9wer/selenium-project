package ReviewSessionsPracticeKir.week6;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("Hello. I am the Cydeo chat bot");
        while (run){

            System.out.println("> ");
            String userInput = input.nextLine().toLowerCase().trim();

            switch (userInput){
                case "hello":
                    System.out.println("world");
                    break;
                case "what is your age":
                    System.out.println("I was programmed in march");
                    break;
                case "who created you":
                    System.out.println("I was created by kirkan");
                    break;
                case "what can we talk about":
                    System.out.println("i will respond to these \n\t hello\n\twhat is your age\n\twho created you\n\toff");
                case "off":
                    System.out.println("haha you cannot shut me down");
                case "shutdown":
                    System.out.println("Shutting down");
                    run=false;
                    break;
                default:
                    System.out.println("sorry can not complete task");



            }
        }
    }
}
