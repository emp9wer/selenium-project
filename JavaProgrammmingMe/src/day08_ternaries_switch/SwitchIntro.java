package src.day08_ternaries_switch;

public class SwitchIntro {
    public static void main(String[] args) {
// Switch can only use == // case blocks values can not be duplicated




        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        char grade = 'A';
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }
        System.out.println(result);
        System.out.println("-------------------------------");

        switch (grade) {  // char value
            case 'Q':
                System.out.println("---Excellent---");
                break;
            case 'B':
                System.out.println("---Great Job---");
                break;
            case 'C':
                System.out.println("---Good---");
                break;
            case 'D':
                System.out.println("---Passed---");
                break;
            case 'F':
                System.out.println("---Failed---");
                break;
            default: // preferred to place in the end
                System.out.println("---Invalid Input---");
                break;

        }


    }
}
