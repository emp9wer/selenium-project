package src.day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // LOGICAL OPERATOR - ALL LOGICAL OPERATORS RETURN BOOLEAN (TRUE OR FALSE)
        // THEY US TWO OR MORE BOOLEAN EXPRESSIONS
        //-------------------------------------------------------------------------
        // LOGICAL OPERATOR AND  -  &&
        // false false = false
        // false true = false
        // true false = false
        // true true = true
        double salary = 60000;
        int creditScore = 650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650  && age >= 25;
        //                               true                    true           true
        System.out.println(eligibleForLoan); // true------------------
        System.out.println("----------------------------------------------------------");
        double salary1 = 70000;
        int creditScore1 = 500;
        int age2 = 40;
        boolean eligibleForLoan1 = salary1 >= 80000 && creditScore1 >= 500 && age>=18;
        //                                 false                    true         true
        System.out.println(eligibleForLoan1); // false-----------------
        System.out.println("-----------------------------------------------------------");
        int ageVote = 18;
        String country = "USA";
        boolean eligibleToVote = age>= 18 && country == "USA";
        //                          true             true
        System.out.println(eligibleToVote); // true--------------------

        // LOGICAL OPERATOR OR || (ether)
        // false false = false
        // false true = true
        //true false = true
        //true true = true

        String answer = "maybe";
        boolean validAnswer = answer == "yes" || answer =="no";
        //                           false              false
        System.out.println("validAnswer = " + validAnswer);         // false
        String answer1 = "yes";
        boolean validAnswer1 = answer1 == "yes" || answer1 =="no";
        //                             true                false
        System.out.println("validAnswer1 = " + validAnswer1);       // true
        char grade = 'B';
        boolean passed = grade == 'A' || grade =='B' || grade =='C';
        //                     false           true           false
        System.out.println("passed = " + passed);                   // true

        System.out.println("LOGICAL OPERATOR ! (NOT) (opposite)--------------------------------------");
        // LOGICAL OPERATOR ! (NOT) (opposite)
        // used to create opposite boolean condition
        // false true
        // true false
        System.out.println( !true ); // false
        String a = "yes";
        boolean yes = a == "yes"; // true
        boolean no = !yes; // false
        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        int score = 65;
        boolean passed1 = score >= 60;
        boolean failed = !passed1;
        System.out.println("passed1 = " + passed1);
        System.out.println("failed = " + failed);
        System.out.println("----------------------------------------");

        System.out.println( true == !false && false == !true && true != !true); // true
        //                       true               true             true
        //                                 true              true












    }
}
