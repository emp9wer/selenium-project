package day06_IfElsePractice;

public class ChooseLanguage_4 {
    public static void main(String[] args) {
       int selection = 2; // 1~5
        String for1,for2,for3,for4,for5;
        for1="Hello, thank for your call";
        for2="Hola, gracias para llamar";
        for3="Merhaba, aradiginiz icin tesekkurler";
        for4="Privet, spasibo za vash zvonok";
        for5="Merci ,pour votre appel";
        String result = "";

        if(selection == 1){
            result = for1;
        }
        if(selection == 2){
            result = for2;
        }
        if(selection == 3){
            result = for3;
        }
        if(selection == 4){
            result = for4;
        }
        if(selection == 5){
            result = for5;
        }
        System.out.println(result);




    }
}
/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */