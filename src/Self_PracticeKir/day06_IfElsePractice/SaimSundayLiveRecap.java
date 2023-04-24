package Self_PracticeKir.day06_IfElsePractice;

public class SaimSundayLiveRecap {
    public static void main(String[] args) {

        char nCK = 'K';
        char nCi = 'i';
        char nCr = 'r';
        System.out.println(nCK + "" + nCi + "" + nCr); // Kir
        System.out.println("" + nCK + nCi + nCr); // Kir
        System.out.println(nCK + nCi + "" + nCK + nCi + nCr); // 180Kir

        //operators

        int age = 10;
        age++; // now a = 10+1
        System.out.println(age);//prints 11
        System.out.println(age++); // prints 11 and now a = 12;
        System.out.println(age); // prints 12

        int a = 3, b = 5;
        a++;
        int c = a + b;
        System.out.println(c);


    }
}
