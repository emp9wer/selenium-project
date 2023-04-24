package Self_PracticeKir.day11_String;

import java.util.Scanner;

public class CarInsuranceQuoteReplitChallange {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");
        //WRITE YOUR CODE BELOW
        Scanner scan = new Scanner(System.in);
        double cost = 0;
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String hasDriversLicence = scan.next();
        hasDriversLicence.toLowerCase();
        if(hasDriversLicence.equals("no")){
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }else{
            System.out.println("Enter your zip code");
            int zip = scan.nextInt();
            if(zip == 20910 || zip == 20740){
                cost += 60;
            } else if (zip == 22102 || zip == 22103) {
                cost +=30;
            }else {
                cost +=50;
            }

            System.out.println("Is this vehicle owned, financed, or leased?");
            String ownership = scan.next();
            if(ownership.equals("owned")){
                cost +=10;
            } else if (ownership.equals("financed")) {
                cost +=15;
            }else {
                cost +=20;
            }
            System.out.println("How is this vehicle primarily used?");
            String usage = scan.next();
            if(usage.equals("business")){
                cost +=50;
            } else if (usage.equals("pleasure")) {
                cost +=10;
            }else {
                cost +=20;
                System.out.println("How many days do you commute?");
                int days = scan.nextInt();
                cost += days * 5;
            }

            System.out.println("How old are you?");
            int age = scan.nextInt();
            if(age<16){
                System.out.println("You can't be driving");
                System.exit(0);
            }else if (age >16 && age < 20){
                cost *=10;
            } else if (age >=20 && age < 25) {
                cost *=6;
            }else{
                cost *=2;
            }

            System.out.println("Have you had any accidents in the last 5 years?");
            String accidentsq = scan.next();

            if(accidentsq.toLowerCase().equals("yes")){
                System.out.println("How many?");
                int accidentQuantity = scan.nextInt();
                cost += (accidentQuantity * 10);
            }
            scan.nextLine();
            System.out.println("What is the highest level of education you have completed?");
            String education = scan.nextLine();

            if(education.equals("Bachelors") || education.equals("Masters")){
                cost -= (cost * 0.05);
            } else if (education.equals("PHD")) {
                cost -= (cost * 0.1);
            }else{
                cost -= (cost * 0.05);
            }


                    String subFirstName = fullName.substring(0, fullName.indexOf(' '));
            String subFirstNameCap = subFirstName.substring(0,1).toUpperCase() + subFirstName.substring(1);
            String subLastName = fullName.substring(fullName.indexOf(" ")+1);
            String subLastNameCap = subLastName.substring(0,1).toUpperCase() + subLastName.substring(1);
            String fullNameCap = subFirstNameCap + " " + subLastNameCap;

            System.out.println(fullNameCap + ", here's your quote!");

            education = education.replace(" " , "");

            String refNum = subFirstName.substring(0,2).toUpperCase()  +""+age+subLastName.substring(subLastName.length()-3).toUpperCase() +
                    zip+education.toUpperCase();

            System.out.println("This is your start premium cost: $"+cost + "\nThis is your reference number: "+refNum);
        }
    }
}
