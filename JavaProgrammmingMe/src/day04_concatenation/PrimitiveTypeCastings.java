package src.day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {
        // --------- Implicit Casting---------- (smaller to larger)
        byte a = 15;
        short b = a;  // short b = (short)a;
        System.out.println(b);

        int c = a; // implicit casting

        long d = 3000L;
        float f = d; // implicit casting
        System.out.println(f);
        // --------- Explicit Casting---------- (larger to smaller)(must be done expicitly) - manually
        int x = 100;
        byte y = (byte)x;

        float z = 20.8F;
        short q = (short)z; // z = 20.8
        System.out.println(q); // 20

        double n1 = 2.5;
        byte n2 = (byte)n1; // 2

        int num = 500;
        byte result = (byte) num;
        System.out.println(result); // - 12 (bytecode calculation) not to worry about it yet

        int r = 50000;
        short t = (short) r;
        System.out.println(t); // -15536 (bytecode calculation) not to worry about it yet
        // shortcut alt enter

        double u = 3000.5;
        int p = (int) u; // explicit casting
        System.out.println(p); // 3000

        int o = 100;
        double d1 = o; // implicit casting

        /*
        byte    small
        short
        int
        long        to
        float
        double   large
         */



    }



}
