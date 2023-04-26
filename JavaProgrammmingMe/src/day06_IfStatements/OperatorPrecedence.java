package src.day06_IfStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3);//11
        System.out.println( ( 5 + 2 )  * 3);//21
        System.out.println( 7 + 3 - 2 / 2);//9
        System.out.println( -5 + 3 ); //-2
        System.out.println( 10 > 9 == 8 < 7 );//false
        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A' ); // false
        //                     true     false
        //                         false              false              false
        //                                  false
        //                                                         false

        System.out.println( 100 >= 20 && 40 * 2 > 60); // true
        //                                  80
        //                      true            true
        //                            true

        int a = 20;

        a += 10 + 2 * 3;
//                  6
//              16
//        36
        System.out.println(a); // 36






    }
}
