package src.day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("program started");

        try {
            System.out.println(9/0); //Arithmetic Exception
            System.out.println("try block");
        }catch (ArithmeticException e){
            System.out.println("catch block");
        }

        System.out.println("program ended");

        System.out.println("--------------");

        String str = null;
        try {
            System.out.println(str.toLowerCase());
            System.out.println("try block");
        } catch (Exception e) {
            System.out.println("catch block");
        }


        System.out.println("-------------------");
        System.out.println("1" );

        try {
            Thread.sleep(3000);
            System.out.println("try block");
        }catch (InterruptedException e){
            System.out.println("catch block");
        }
        System.out.println("2");




    }






}
