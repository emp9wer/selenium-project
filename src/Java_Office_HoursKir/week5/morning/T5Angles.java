package Java_Office_HoursKir.week5.morning;

import java.util.Scanner;

public class T5Angles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, please enter 3 angles. Hit enter after each enter");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        int sum = angle1 + angle2 + angle3;

        if(sum == 180){
            System.out.println("Triangle");
        } else if (sum == 360) {
            System.out.println("Circle");
        }else {
            System.out.println("Can not determine");
        }
    }

}
