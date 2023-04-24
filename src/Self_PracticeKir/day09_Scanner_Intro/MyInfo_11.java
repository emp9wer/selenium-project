package Self_PracticeKir.day09_Scanner_Intro;

import java.util.Scanner;

public class MyInfo_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age"); // int
        int age = scan.nextInt();
        System.out.println("Enter your gender"); // string one word
        String gender = scan.next();
        scan.nextLine();
        System.out.println("Enter your full name"); // string Multiple words
        String fullName = scan.nextLine();
        System.out.println("Enter your phone number"); // long
        long phoneNumber = scan.nextLong();
        System.out.println("Enter your zip code"); // int
        int zip = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your School name"); // string Multiple words
        String schoolName = scan.nextLine();
        System.out.println("Enter your city name"); // string Multiple words
        String city = scan.nextLine();
        System.out.println("Enter your state name"); //string one word
        String state = scan.next();
        System.out.println("Enter your building number"); //int
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Street name");  // string Multiple words
        String streetName = scan.nextLine();

        System.out.println("1. "+fullName+"\n2. "+age+"\n3. "+gender+"\n4. "+phoneNumber+"\n5. address:\n\t\t\t"
                +buildingNumber+" "+streetName+"\n\t\t\t"+city+", "+state+" "+zip+"\n6. "+schoolName);


    }
}
/*
11. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in sperate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
 */