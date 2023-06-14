package src.day22_arrayList;

public class UpperCaseVsLowerCase_2 {
    public static void main(String[] args) {

        String str = "JAVA java";
        int isUpperCase =0;
        int isLowerCase =0;
        boolean areEqual = false;
        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                isUpperCase++;
            } else if (Character.isLowerCase(each)) {
                isLowerCase++;
            }
        }
        if (isLowerCase == isUpperCase){
            areEqual = true;
        }

        System.out.println(areEqual);
    }
}
/*
2. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */