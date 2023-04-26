package src.day22_arrayList;


public class WrapperClasses {

    public static void main(String[] args) {

        String str = "Java";
        int a1 = 10;
        Integer a2 = 10;

        System.out.println("--------------autoboxing-------------------");

        int b1 = 100;
        double c1 = b1;
        long c2 = b1;
        Integer b2 = b1; // auto boxing
       //    Long b3 = b1;
       //    Double b4 = b1;

        char ch = 'A';
        Character ch2 = ch; // autoboxing

        System.out.println("-------------unboxing---------------");

        Integer n1 = 20;

        int n2 = n1;  // best to use its own primitive type!
      //  long n3 = n1;
     //   double n4 = n1;

        Character e1 = 'Z';

        char e2 = e1;

    //    int e3 = e1;
    //   long e4 = e1;












    }
}
