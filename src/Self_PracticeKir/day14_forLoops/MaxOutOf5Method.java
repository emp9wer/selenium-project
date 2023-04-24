package Self_PracticeKir.day14_forLoops;

import java.util.Scanner;

public class MaxOutOf5Method {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five numbers to find max number");
        int res = scan.nextInt();
        for (int i = 0; i < 4; i++) {
            int a = scan.nextInt();
            if (a > res) {
                res = a;
            }
        }
        System.out.println(res);

    }
}