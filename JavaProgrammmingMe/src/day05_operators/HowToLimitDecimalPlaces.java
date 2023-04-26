package src.day05_operators;

public class HowToLimitDecimalPlaces {
    public static void main(String[] args) {
        double a = 3.3333333;
        System.out.println(a);
        System.out.println( String.format("%.1f", a));
        System.out.println( String.format("%.2f", a));
        System.out.println( String.format("%.3f", a));
        float b = 3.333333333333F;
        System.out.println("b = " + b);
        float c = 9.999999F;
        System.out.println("c = " + c);
        float c1 = 9.9999999F; 
        System.out.println("c1 = " + c1);
        float d = 8.88888F;
        System.out.println("d = " + d);
        /*
        b = 3.3333333
        c = 9.999999
        c1 = 10.0
        d = 8.88888
         */




    }
}
