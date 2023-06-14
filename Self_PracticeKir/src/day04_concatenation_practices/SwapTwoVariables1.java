package src.day04_concatenation_practices;

public class SwapTwoVariables1 {
    public static void main(String[] args) {
        int h = 10;
        int y = 15;
        int z = h;
        h = y;
        y = z;
        System.out.println("h = " + h);
        System.out.println("y = " + y);
    }
}
/*
8. Create a class named SwapTwoVariables1 and declare the following variables:
            h
            y
            z

    8.1 Write a program that swap variables h & y’ values by using a temporary variable z
        Eh:
              h = 10
              y = 15

        output:
                  h = 15
                  y = 10
 */
