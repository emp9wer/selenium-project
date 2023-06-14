package src.day22_arrayList;

public class Retrieve_1 {
    public static void main(String[] args) {
      String str = "Wooden Spoon!";
      String letters="";
      String digits ="";
      String specialChars="";

        for (char each : str.toCharArray()) {
            if(Character.isLetter(each)){
                letters+=each;
            } else if (Character.isDigit(each)) {
                digits+=each;
            } else if (!Character.isLetterOrDigit(each)) {
                specialChars+=each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }

}

/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

 */