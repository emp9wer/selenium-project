package src.day11_string;
import java.util.Scanner;
public class replitWithoutX {


        public static void main(String[] args) {
            //DO NOT TOUCH BELOW
            Scanner scan = new Scanner(System.in);
            String word = scan.nextLine();
            word = word.trim();
            //WRITE YOUR CODE HERE
            if ((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))){

                System.out.println(word = word.substring(1 , word.length()-1));
            }else if (word.endsWith("x") || word.endsWith("X")){
                System.out.println(word = word.substring(0 , word.length()-1));
            }else if
            (word.startsWith("x") || word.startsWith("X")){
                System.out.println(word = word.substring(1));
            }else{
                System.out.println(word);
            }
        }
    }


