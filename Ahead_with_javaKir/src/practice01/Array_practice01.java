package practice01;
import java.util.Scanner;

public class Array_practice01 {
    public static void main(String[] args) {
        System.out.println("0 = red / 1 = blue / 2 = yellow / 3 = green");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String[] colors = {"red","blue","yellow","green"};

        //print the color choice
        System.out.println("You chose " + colors[i]);
        }





    }

