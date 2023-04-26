package src.day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        System.out.println("----------parse method----------");
        //returns primitive type, converst string to primitive values

        System.out.println("------------valueOf-----------");
        //returns wrapper class objects , converts String to wrapper class values

        String str = "20";
       //   System.out.println(str + 1); // 201

       // Integer num1 = Integer.parseInt(str); // unboxing
       int num = Integer.parseInt(str);


        System.out.println(num+1); // 21

        int num2 = Integer.valueOf(str);

        System.out.println(num2*num2); //400

        System.out.println("------------------------");
        String d1 = "20.5";
        double num3 = Double.parseDouble(d1);
        Double num4 = Double.valueOf(d1);

        System.out.println(num3);//20.5
        System.out.println(num4);//20.5

        System.out.println("------------------------------");

        String x = "true";
        String z = "maybe";

        boolean r1 = Boolean.parseBoolean(x);
        boolean r2 = Boolean.valueOf(z);
        System.out.println(r1);//true
        System.out.println(r2);//false

        System.out.println("------------Character.isDigit--------------");

        char ch = 'a';

        boolean q1 = Character.isDigit(ch);
        System.out.println("is digit: "+q1); 

        System.out.println("------------Character.isLetter------------");
        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        System.out.println("-------------------");

        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        
        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        
        boolean isSpecialChar  = !Character.isLetterOrDigit(ch);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("--------sum of digits----------");

        String string = "a1b2c3d4e5"; //15
        int sum = 0;
        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
               sum+= Integer.parseInt(""+each);
            }
        }
        System.out.println(sum); //15













    }
}
