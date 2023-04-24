package practice01;

import java.util.Random;
import java.util.Scanner;
public class Random_number {
    public static void main(String[] args) {


        int run;
        for (int i = 0; i < 100; i++) {
            System.out.println("press 1 to win or loose");
            Scanner sc = new Scanner(System.in);

            run = sc.nextInt();

            if (run == 1) {
                Random random = new Random();
                int randomNumber = random.nextInt(10) + 1;

                    System.out.println(randomNumber);

            }
        }
    }
}





