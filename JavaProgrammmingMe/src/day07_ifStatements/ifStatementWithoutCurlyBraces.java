package src.day07_ifStatements;


public class ifStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        //best practice to always include {}
        // however if there is only one code fragment in block - it will work.

        int age = 32;

        if (age >= 21){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
        System.out.println("__________________________________");

        if (age >= 21) System.out.println("eligible"); // will work because only one code fragment in each block.

        else System.out.println("not");

        System.out.println("________________________");



    }




}
