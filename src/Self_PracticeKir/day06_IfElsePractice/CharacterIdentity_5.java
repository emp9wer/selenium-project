package Self_PracticeKir.day06_IfElsePractice;

public class CharacterIdentity_5 {
    public static void main(String[] args) {
        char input = 'Z';
        if((input >=33 && input<=47) || (input >= 58 && input<=64) ||
           (input >= 91 && input<=96) || (input >= 123 && input<=126)){
            System.out.println("Special Character");
        }
        if(input >=48 && input<=57){
            System.out.println("digit");
        }
        if((input >=65 && input<=90) || (input >= 97 && input<=122)){
            System.out.println("Alphabetic Character");
        }
    }
}
/*
5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */