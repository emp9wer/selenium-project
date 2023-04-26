package src.day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
/*      ----------SHORTHAND OPERATORS-----------
        Assignment    x = y  x = y
        Addition Assignment x += y   x = x + y
        Subtraction Assignment x -= y   x = x – y
        Multiplication Assignment x *= y   x = x * y
        Division Assignment x /= y   x = x / y
        Remainder Assignment x %= y   x = x % y                  */

        //Assignment OPERATOR
        int a = 20;
        System.out.println("a = " + a); // 20
        System.out.println("a = " + a); // 20
        a = 40;
        System.out.println("a = " + a); // 40
        a = 90;
        System.out.println("a = " + a); // 90

        //Addition Assignment OPERATOR
        System.out.println("Addition Assignment OPERATOR--------------------------------");
        double balance = 100;
        balance += 1000; // balance = 100 + 1000 = 1100
        System.out.println("balance = " + balance); // 1100.0
        balance += 500; // balance = 1100+500 = 1600
        System.out.println("balance = " + balance); // 1600.0
        balance += 10000; // 11600.0
        System.out.println("balance = " + balance); //11600.0

        //Subtraction Assignment OPERATOR
        System.out.println("Subtraction Assignment OPERATOR--------------------------------");
        balance -= 1000; // 11600.0 - 1000 = 10600.0
        System.out.println("balance = " + balance); // 10600.0
        balance -= 5000; //10600.0 - 5000 = 5600.0
        System.out.println("balance = " + balance); // 5600.0

        // Multiplication Assignment OPERATOR
        System.out.println("Multiplication Assignment OPERATOR--------------------------------");
        double salary = 45000.0;
        salary *= 2; // 45000.0 * 2 = 90000.0
        System.out.println("salary = " + salary); // 90000.0
        salary *= 3; //90000.0 * 3 = 270000.0
        System.out.println("salary = " + salary); // 270000.0

        double eth = 4;
        eth *= 250;
        System.out.println("eth = " + eth); // 1000.0

        //Division Assignment OPERATOR
        System.out.println("Division Assignment OPERATOR--------------------------------");
        eth /= 2; // 1000.0 / 2 = 500.0
        System.out.println("eth = " + eth); //500.0

        salary /=2; // 270000.0 / 2 = 135000.0
        System.out.println("salary = " + salary); // = 135000.0

        //Remainder Assignment OPERATOR
        System.out.println("Remainder Assignment OPERATOR--------------------------------");
        int b = 39;
        b %= 7; // 39 % 7 = 4
        System.out.println("b = " + b); // = 4
    }
}
