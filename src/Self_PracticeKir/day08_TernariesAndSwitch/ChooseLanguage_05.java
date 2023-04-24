package Self_PracticeKir.day08_TernariesAndSwitch;

public class ChooseLanguage_05 {

    public static void main(String[] args) {
              // using Ternary
        int selection = 6; //1~5
        String text = "";

        text = (selection >=1 && selection <= 5)?
                (selection == 1) ? "Hello, thank for your call"
                        :(selection == 2) ? "Hola, gracias para llamar"
                        :(selection == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                        :(selection == 4) ? "Privet, spasibo za vash zvonok"
                        :"Merci ,pour votre appel"
                :"Invalid Number";

        System.out.println(text);

        System.out.println("-----------------------------------------");

        // using Switch Statement

        int selection1 = 6; //1~5
        String result1 = "";

        if(selection1>=1 && selection1 <=5){
            if (selection1 == 1){
                result1 = "Hello, thank for your call";
            } else if (selection1 == 2) {
                result1 = "Hola, gracias para llamar";
            } else if (selection1 == 3) {
                result1 = "Merhaba, aradiginiz icin tesekkurler";
            } else if (selection1 == 4) {
                result1 = "Privet, spasibo za vash zvonok";
            }else {
                result1 = "Merci ,pour votre appel";
            }

        }else{
            result1 = "Invalid Number";
        }
        System.out.println(result1);




    }
}


/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement


 */