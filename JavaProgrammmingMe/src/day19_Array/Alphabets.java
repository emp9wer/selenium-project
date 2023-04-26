package src.day19_Array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        System.out.println("---------ascending---------");
        char[] ascending = new char[26]; //index 0~25
        char[] descending = new char[26]; //index 0~25
        for (int i = 0, j ='A',k='Z'; i < ascending.length; i++,j++,k--) {
            ascending[i]=(char) j; // int to char explicit casting
            descending[i]=(char) k;
        }
        System.out.println(Arrays.toString(ascending));
        //[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
        System.out.println(Arrays.toString(descending));
        //[Z, Y, X, W, V, U, T, S, R, Q, P, O, N, M, L, K, J, I, H, G, F, E, D, C, B, A]

        System.out.println("-----------------------------------------------------");

        char[] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }
        System.out.println(Arrays.toString(characters));










    }
}
