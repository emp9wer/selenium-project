package src.day08_ternaries_switch;

public class TernariesIntro {
    public static void main(String[] args) {
        // Syntax
        // variable = (condition) ? value1 : value2;
        //                       if       else

       int score = 85;
       String result = "";

        if (score >= 60) {
            result = "passed";
        }else{
            result = "failed";
        }
        System.out.println(result);

        System.out.println("----------------------------------");

       String result2 = (score >= 60) ? "passed" : "failed" ;
        System.out.println(result2);

        System.out.println("========================================");

        int age = 20;
        String r ="";

       /* if (age>=21){
            r = "Eligible";
        }else {
            r = "Not"
        }
        */
        r = (age>=21) ? "Eligible" : "Not";
        System.out.println(r);
    }
}
