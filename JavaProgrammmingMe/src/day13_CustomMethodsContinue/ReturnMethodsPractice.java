package src.day13_CustomMethodsContinue;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println( isOdd(100)  );

        int num = 200;

        if(isEven(num)){
            System.out.println(num+ " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }

    public static boolean isOdd(int num){
        return (num%2 !=0 )? true : false;
    }

    public static boolean isEven(int num){
        return !isOdd(num);
    }

    public static int max(int a,int b){
        return a>b ? a : b;
    }






}
