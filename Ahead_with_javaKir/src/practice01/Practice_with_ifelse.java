package practice01;
import java.util.Scanner;
public class Practice_with_ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int b = x + y;

        if (b > 10) {
            System.out.println("result is greater than 10");
        }
        else if (b < 10) {
            System.out.println("result is less then 10");
        }
        else {
            System.out.println("result is 10");
        }
    }
}
