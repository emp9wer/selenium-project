package src.day05_operators;
public class UnaryOperators {
    public static void main(String[] args) {

//-----------UNARY OPERATORS--------------
//     + unary plus operator ---- indicates positive value (it is optional)
//      ex: +10 = positive 10
//           10 = positive 10

//     - unary minus operator ---- negates an expression or value (not optional)
//      ex: -100 = negative 100
//      ++ pre or post increment operator ---- increments a value by 1

//         pre ++a = // +1 to value in memory immediately
//     -- pre or post decrement operator ---- decrements a value by 1
//pre increment / decrement examples
        System.out.println("------------------------pre  increment / decrement --------------------------");
        int x = 10;
        System.out.println(++x);// 11 //+1 to value in memory immediately
        System.out.println(x); // 11 //+1 to value in memory immediately

        int y = 100;
        System.out.println(--y);//99
        System.out.println(y);//99
        System.out.println("------------------------post  increment / decrement --------------------------");
//post increment / decrement
// -- or ++ placed after the operand - it does not change value immediately
// old value of the variable will be used first before increases decreases the value by 1 in the memory
        // examples
        int a = 50;
        System.out.println(a++); // 50
        System.out.println(a); // 51
        int b = 25;
        System.out.println(b--); // 25
        System.out.println(b); // 24
        System.out.println("-------------------");
        int n = 30;
        int m = n++; // m = 30 , n = 31
        System.out.println("n = " + n); // n = 31
        System.out.println("m = " + m); // m = 30

        int z = 60;
        int q = z--; // q = 60 // z = 59
        System.out.println("q = " + q); //q = 60
        System.out.println("z = " + z); // z = 59
    }
}
