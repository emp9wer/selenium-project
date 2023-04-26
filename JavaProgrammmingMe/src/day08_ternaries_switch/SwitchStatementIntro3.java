package src.day08_ternaries_switch;

public class SwitchStatementIntro3 {

    public static void main(String[] args) {

        int score = 95;
        String result = "Your grade is: ";
        if (score >= 90) { //false: score < 90 //false condition given to a next block by default.
            result += "A";
        } else if (score >= 80) { //false: score < 80
            result += "B";
        } else if (score >= 70) {
            result += "C";
        } else if (score >= 60) {
            result += "D";
        } else {
            result += "F";
        }
        System.out.println(result);

       //-------------------------------- EXAMPLE WHEN TO NOT USE SWITCH STATEMENT - would require ~ 90 blocks




    }
}
