package src.day19_Array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};
        //       index    0    1   2   3     4   5
        int max = numbers[0]; //assume that first element is max number

        for (int i = 1; i < numbers.length; i++) { //i: 1,2,3,4,5 (index 0 excluded)
            if(numbers[i] > max){ // compare the element with current max num
                max = numbers[i]; // replace the current max num
            }
        }
        System.out.println("max = " + max);

    }


}
