package day15_WhileLoops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        System.out.println("would you like to reserve a room?");
        Scanner scan = new Scanner(System.in);
        String yesOrNo = scan.nextLine();
        String roomType="";
        while (!(yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("no"))){
            System.out.println("please re-enter");
               yesOrNo = scan.nextLine();
        }
        if(yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("which type of room you want to reserve?");
            roomType = scan.nextLine();
            while (!(roomType.equalsIgnoreCase("king bed")
            || roomType.equalsIgnoreCase("queen bed" )
            || roomType.equalsIgnoreCase("single bed"))){
                System.out.println("reselect the room");
                roomType = scan.nextLine();
            }
            if(roomType.equalsIgnoreCase("king bed")){
                System.out.println("King Bed ==> 120$");
            }
            if(roomType.equalsIgnoreCase("Queen Bed")){
                System.out.println("Queen Bed ==> 100$");
            }
            if(roomType.equalsIgnoreCase("single Bed")){
                System.out.println("single Bed ==> 80$");
            }
        }else {
            System.out.println("have a nice day");
        }
    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */