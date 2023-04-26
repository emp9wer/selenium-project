package src.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {


        String[] group1 ={"James","Daniel","Alibaba","Frank"};
        String[] group2 ={"Alex", "Pavel","Zorro"};
        String[] group3 ={"Mike","Dick","Svetlana","Masha","Bob"};
        String[] group4 ={"Natasha","Alice"};
        String[][] groups = { group1,group2,group3,group4};

        for (String[] each1D : groups) {
            System.out.println();
            for (String ea : each1D) {
                System.out.print(ea + " ");
            }
        }
        System.out.println();
        System.out.println("---------------");

        for (int i = 0; i <groups.length ; i++) {
            System.out.println();
            for (int j = 0; j <groups[i].length ; j++) {
                System.out.print(groups[i][j]+" ");
            }

        }
        System.out.println();
        System.out.println("--------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            System.out.println();
            for (String ea : groups[i]) {

                System.out.print(ea+" ");
            }
        }
        System.out.println();
        System.out.println("------------print 2dArrays---------------");

      //  System.out.println(Arrays.toString(groups)); // soString() only for 1dim arrays

        System.out.println(Arrays.deepToString(groups));














    }


}
