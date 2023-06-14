package src.day37_exceptions;

public class TryCatchBlock2 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        try {
            System.out.println(arr[1000]);
            System.out.println("start");
        } catch (Exception e) {
            e.printStackTrace(); // display full details of exception after program executed
        }
        System.out.println("end");
    }
}
