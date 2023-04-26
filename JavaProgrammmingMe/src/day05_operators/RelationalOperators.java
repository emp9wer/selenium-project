package src.day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {
      // Relational operators

      // Greater than operator >
        int a = 1000;
        int b = 200;
      //  System.out.println( a > b ); // output true
      //  System.out.println( a < b ); // output false 
       boolean aIsGreater = a > b;
        System.out.println(aIsGreater); // true
        System.out.println( 100 > 100 ); // false

        System.out.println("Greater than or equal operator >=   ---------------------------------------");
      // Greater than or equal operator >=
        int score = 60;
        boolean passed = score >= 60;
        System.out.println("passed = " + passed); // true
        int age = 20;
        boolean eligibleToBuyAlcohol = age >= 21;
        System.out.println("eligibleToBuyAlcohol = " + eligibleToBuyAlcohol);
        boolean eligibleToVote = age >= 18;
        System.out.println("eligibleToVote = " + eligibleToVote);

        System.out.println("Less than operator <   ---------------------------------------");
        //Less than operator <
        score = 48;
        boolean failed = score < 60;
        System.out.println("failed = " + failed); // true
        System.out.println(100 < 2000); // true
        System.out.println(5000 < 2000); // false

        System.out.println("Less than or equal operator <=   ---------------------------------------");
        //Less than or equal operator <=

        System.out.println(95 <= 100); // true
        System.out.println(100 <= 100); //true
        System.out.println(200 <= 100); //false
        System.out.println('a'<='b'); // ascii numbers get compared (example of comparing char)
     // System.out.println("Java" <= "C++"); // > < >= <= can only be applicable for numbers // result error






     

    }
}
