package src.day19_Array;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers = {100,-10,40,-60,-555,200,1555,2424,-88,-777,55,333};

        int min = numbers[0];//assume that first element is min number

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min){// compare the element with current min num
                min = numbers[i];// replace the current min num
            }
        }
        System.out.println("min = " + min);
    }
}
