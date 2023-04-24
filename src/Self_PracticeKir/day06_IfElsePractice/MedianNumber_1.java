package Self_PracticeKir.day06_IfElsePractice;

public class MedianNumber_1 {
    public static void main(String[] args) {
        int a=10,b=15,c=20;
        String textResult = " is the median number";
        int result = a;
        if ((a > b && a < c) || (a < b && a > c))
            // false    true       true     false
            //     false               false
            //               false
            {
            result = a;
        }
        if ((b > a && b < c) || ( b < a && b > c)){
            // true     true        false    false
            //     true                 false
            //               true
            result = b;
        }
        if ((c > a && c < b) || (c < a && c > b)) {
            // true     false      false    true
            //     false               false
            //               false
            result = c;
        }
        System.out.println(result+textResult);
    }

}
/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */