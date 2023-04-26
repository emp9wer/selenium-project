package src.day08_ternaries_switch;

public class TernaryIntro3 {
    public static void main(String[] args) {


        int score = 92225;
  /*      String result = "";

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                result = "passed";
            } else {
                result = "failed";
            }
        } else {
            result = "invalid";
        }
        System.out.println(result);
         */

        String result = (score >= 0 && score <= 100) ?
                (score >= 60) ? "passed" : "failed"
                : "invalid";
        System.out.println(result);

        System.out.println("-------------------------");

        int n = 8;

        String day = (n >= 1 && n <= 7) ?
                (n == 1) ? "Monday" : (n == 2) ? "tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                        : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday"
                      : "No such a day";
        System.out.println(day);

    }


}