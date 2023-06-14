package src.day14_forLoops;

public class FactorialNumber_4 {

    public static void main(String[] args) {
        int in = 5, out = 1;
        for (int i = 1; i <= in; i++) {out *= i;}
        System.out.println(out);
    }
}
/*
4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


 */