package src.day07_ifStatements;

public class MultiBranchIf {
    public static void main(String[] args) {
        //using singe if statements - for only one condition.

        //using if else statements : when there ONLY TWO (not more not less)


        //using multi if statements : when there ONLY TWO (not more not less)
        // options/possibilities/alternatives we need to create condition for.
        // compiler will check all conditions (code takes longer to process)
        int num = 100;
        String result = "";
        if(num > 0){
            result = "positive";
        }
        if(num < 0 ){
            result = "negative";
        }
        if(num == 0){
            result = "zero";
        }
        System.out.println(result);
        System.out.println("-------------------------------------------------------");

        //using MULTI-BRANCH IF STATEMENT: when there are THREE OR MORE options/possibilities/alternatives
        //we need to create condition for
        //benefit - if 3 conditions - only 2 boolean expressions - last boolean condition given by else block
        //ONLY ONE BLOCK GETS EXECUTED - ONE THAT IS TRUE
        //benefit - if condition is true - next blocks are not checked - they are terminated = more efficient
        String result2 ="";
        if(num > 0){
            result2 = "POSITIVE";
        } else if (num < 0){
            result2 = "NEGATIVE";
        }else{
            result2 = "ZERO";
        }
        System.out.println(result2);

        /*
        Multi-branch if: when there are three ore more options/possibilities/alternatives we need to create condition for

        if(Condition1){
        StatementA
        }
        else if(Condition2){
        StatementB
        }
        else if(Condition3){
        StatementC
        }
        else{
        StatementD
        }

        ONLY ONE BLOCK GETS EXECUTED - ONE THAT CAME TRUE FIRST
        below is execution flow
        StatementA: Condition1 is true
        StatementB: Condition1 MUST be false, Condition2 is true
        StatementC: Condition1 & Condition2 MUST be false, Condition3 is true
        StatementD: Condition1 & Condition2 & Condition3 MUST be false

         */













    }
}

