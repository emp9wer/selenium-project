package src.day21_multiDimentionalArray;

public class MultiDimensionalArraysPractice3 {
    public static void main(String[] args) {

        int[][][] arr3D1 = { {{1,2},{3,4,5}} , {{6,7,8,9},{10,11},{12,13,14}} , {{15,16,17,18}} };
        int[][][] arr3D2 = { {{1,2},{3,4,5}} , {{6,7,8,9},{10,11},{12,13,14}} , {{15,16,17,18}} };
        int[][][] arr3D3 = { {{1,2},{3,4,5}} , {{6,7,8,9},{10,11},{12,13,14}} , {{15,16,17,18}} };

        int[][][][] arr4D = {arr3D1,arr3D2,arr3D3};

        for (int[][][] each3d : arr4D) {
            System.out.print(" ||||||  ");
            for (int[][] each2d : each3d) {
                for (int[] each : each2d) {
                    for (int i : each) {
                        System.out.print(i+" ");
                    }
                }
            }
        }

    }
}
