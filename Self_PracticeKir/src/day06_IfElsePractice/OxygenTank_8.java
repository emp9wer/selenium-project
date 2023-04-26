package day06_IfElsePractice;

public class OxygenTank_8 {
    public static void main(String[] args) {
        int oxygen = 60;
        String result ="";
        if ((oxygen < 100) && (oxygen >= 90)){
            result = "Your tank is full";
        }
        if ((oxygen < 90) && (oxygen >= 80)){
            result = "Still okay";
        }
        if ((oxygen < 80) && (oxygen >= 70)){
            result = "Don't go too far";
        }
        if ((oxygen < 70) && (oxygen >= 60)){
            result = "Start to head back";
        }
        if ((oxygen < 60) && (oxygen >= 50)){
            result = "Be careful now you at at 50%";
        }
        System.out.println(result);





    }
}
/*
8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */