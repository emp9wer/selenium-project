package day14_forLoops;

import java.util.Random;
public class RandomLetters {
    public static void main(String[] args) {
        for (;;){
            int ran = new Random().nextInt( 'Z' - 'A') + 'A';
            char r = (char) ran;
            System.out.print(r + "");
        }
    }
}
