package src.day09_Scanner_Intro;

import java.util.Scanner;

public class SpeedCheck_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speedCheck = 55;
        System.out.println("Current speed check is set to "+ speedCheck+ " \n Enter current speed:");
        int currentSpeed = scan.nextInt(); // 105
        int overSpeed = 0;

        if (currentSpeed > speedCheck){
            overSpeed = currentSpeed - speedCheck;
            System.out.println("You're driving " + overSpeed + " mph over the limit. Slow down!");
            scan.close();
        }
    }
}
/*
4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is declared and given
	ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;

            Enter current speed:
            105

            output:
            	You're driving 50 mph over the limit. Slow down!

 */