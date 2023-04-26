package src.day08_ternaries_switch;

public class TernaryIntro2 {
    public static void main(String[] args) {
     // ? if : else
        int number = 100;

      /*  String result = "";

        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
*/

        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println("---------------------------");


        int n = 1;
       /*  String day = "";
        if(n==1){
            day = "monday";
        } else if (n==2) {
            day = "tuesday";
        }else if (n==3) {
            day = "wednesday";
        }else if (n==4) {
            day = "thursday";
        }else if (n==5) {
            day = "friday";
        }else if (n==6) {
            day = "saturday";
        }else {
            day = "sunday";
        }
*/

            String day = (n==1)?"monday":(n==2)?"tuesday":(n==3)?"wednesday":(n==4)?"thursday":(n==5)?"friday"
                    :(n==6)?"saturday":"sunday";
        System.out.println(day);

        System.out.println("----------------------------------------------");

           int num = 12; // 1~12

           String month;

           month = (num == 1)?"jan":(num==2)?"feb":(num==3)?"mar":(num==4)?"apr":(num==5)?"may":(num==6)?"jun"
                   :(num==7)?"jul":(num==8)?"aug":(num==9)?"sep":(num==10)?"oct":(num==11)?"nov":"dec";

        System.out.println(month);










    }
}
