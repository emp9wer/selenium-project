package day28_Encapsulation.candy;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();

        Candy c1 = new Candy("ChupaChups", 10, 0, false);
        Candy c2 = new Candy("Snickers", 21, 1.2, true);
        Candy c3 = new Candy("Milky Way", 13, 0.9, false);
        Candy c4 = new Candy("Payday", 33, 1.4, true);
        Candy c5 = new Candy("TootsieRoll", 44, 0.4, false);

        candies.addAll(Arrays.asList(c1,c2,c3,c4,c5));

            System.out.println(candies);

        for (Candy ea : candies) {
            System.out.println(ea.getBrand());
            System.out.println(ea.getPrice());
        }

    }
}
