package src.day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i=10; i>=5; i-- ){ // 10 9 8 7 6 5 (! 4 !)    // iteration executes last
            System.out.println("loop "+i); // 1 2 3 4 5 6

        }



        System.out.println("------------ sum of all numbers between 1 to 100 ------------------");
        int sum = 0;
        for(int i=1; i<=100; i++){
        sum += i;
        }
        System.out.println(sum);

        System.out.println("------------ print all alphabet letters A~Z ------------------");

        for(char i='A'; i <= 'Z'; i++){
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("English alphabet");

        System.out.println("------------ print all alphabet letters A~Z backwards ------------------");

        for (char i='Z'; i >= 'A'; i--){
            System.out.print(i+ "\t");
        }
        System.out.println();
        System.out.println("English alphabet backwards");

    }
}
