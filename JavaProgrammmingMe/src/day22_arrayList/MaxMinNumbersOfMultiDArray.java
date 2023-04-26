package src.day22_arrayList;

public class MaxMinNumbersOfMultiDArray {
    public static void main(String[] args) {

//index of each element   0   1  2     0  1    2     0   1   2
        int[][] array = {{100,2000,300},{10,1000,50},{-200,400,0}}; // index 0~2
        //index of 1d array    0            1             2

        int max = array[0][0];

        for (int[] ea1d : array) {
            for (int ea : ea1d) {
                if(ea>max){
                    max=ea;
                }
            }
        }
        System.out.println(max);

    }
}
