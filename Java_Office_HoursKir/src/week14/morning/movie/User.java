package week14.morning.movie;

import week14.morning.shopping.Amazon;

import java.util.ArrayList;
import java.util.Arrays;

public class User {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<>(Arrays.asList (new Movie("Avengers End game",6,222,1999),new Movie("Avatar",5,120,2020), new Movie("Terminator",4,122,2019)));

        Cinema cinema = new Cinema("Chicago", 13,movies);

        System.out.println(cinema);

        System.out.println("-------------------");

        Netflix netflixUS = new Netflix("us",33,255);
        Netflix netflixCA = new Netflix("CA",15,121);

        Amazon amazon = new Amazon();
        System.out.println(amazon);

        ArrayList<StreamingSite> streamingSites = new ArrayList<>(Arrays.asList(netflixCA,netflixUS));


        for (StreamingSite each : streamingSites) {
            each.subscribe();
        }







    }


}
