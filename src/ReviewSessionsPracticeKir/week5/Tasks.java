package ReviewSessionsPracticeKir.week5;

public class Tasks {
    public static void main(String[] args) {
        System.out.println(currencyConverter("Yen",50));
        System.out.println("--------------\n");
        System.out.println(multiplicationTable(7));
        System.out.println("--------------\n");
        System.out.println(multiplicationTable(7,20));
        System.out.println("--------------\n");
        System.out.println(isPalindrome("Racecar"));
        System.out.println("--------------\n");
        System.out.println(countWordInString("ahhhbchidefhihellohiiiiworld"));
        System.out.println("--------------\n");
        System.out.println(countWordInString("aahiahiaaahh","ah"));
    }

    public static double currencyConverter(String currencyVariant, double amount){
        double convAmount =0;
        if (currencyVariant.equalsIgnoreCase("euro")){
            convAmount = amount*0.91;
        } else if (currencyVariant.equalsIgnoreCase("yen")) {
            convAmount = amount*121.03;
        } else if (currencyVariant.equalsIgnoreCase("lira")){
            convAmount = amount*14.85;
        } else if (currencyVariant.equalsIgnoreCase("won")){
            convAmount = amount*1217.52;
        }else if (currencyVariant.equalsIgnoreCase("rupee")){
            convAmount = amount*181.45;
        }else{
            System.err.println("invalid input");
        }
        return convAmount;
    }
    public static String multiplicationTable (int num){
        int res;
        String result ="";
        for (int i = 1; i <= 10; i++) {
            res = num * i;
            result +=""+num+" "+"x"+" "+i+" "+"="+" "+res+"\n";
        }
        return result;
    }
    public static String multiplicationTable (int num,int endPoint){
        int res;
        String result ="";
        for (int i = 1; i <= endPoint; i++) {
            res = num * i;
            result +=""+num+" "+"x"+" "+i+" "+"="+" "+res+"\n";
        }
        return result;
    }
    public static boolean isPalindrome (String word){
        String reversed ="";
        for (int i = 0; i < word.length() ; i++) {
            reversed += "" + word.charAt(word.length()-1-i);
        }
         boolean palindrome = (word.equalsIgnoreCase(reversed));
        return palindrome;
    }
    public static int countWordInString (String sentence){
        return (sentence.length() - sentence.replace("hi", "").length()) / 2;
    }

    public static int countWordInString (String sentence, String word){
        return (sentence.length() - sentence.replace(word, "").length()) / word.length();
    }


}
