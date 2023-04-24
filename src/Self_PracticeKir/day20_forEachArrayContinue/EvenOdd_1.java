package Self_PracticeKir.day20_forEachArrayContinue;

public class EvenOdd_1 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
            int countEven =0;
            int countOdd =0;
        for (int each : numbers) {
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("even couunt is: "+countEven);
        System.out.println("odd coint is: "+countOdd);
    }
}
/*

1.  Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */