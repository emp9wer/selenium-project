package Self_PracticeKir.day07_ifStatementsPractice;

public class Grade_4 {
    public static void main(String[] args) {
        char grade = 's';
        String result = "";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            if(grade == 'A'){
                result = "excellent";
            } else if (grade == 'B') {
                result = "great job";
            } else if (grade == 'C') {
                result = "good";
            } else if (grade == 'D') {
                result = "passed";
            }else{
                result = "failed";
            }
        }else{
            result = "invalid";
        }
        System.out.println(result);

    }
}
/*
4. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */