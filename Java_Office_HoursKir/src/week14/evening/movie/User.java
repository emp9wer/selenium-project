package week14.evening.movie;

import java.util.ArrayList;
import java.util.Arrays;

public final class User {
    public static void main(String[] args) {

        Movie movie1= new Movie("Star Wars",5,120,2000);
        Movie movie2= new Movie("Game of Thrones",5,120,2006);
        Movie movie3= new Movie("Matrix 1",5,120,2000);
        Movie movie4= new Movie("Matrix 2",4,120,2000);
        Movie movie5= new Movie("Matrix 3",3,120,2000);
        Movie movie6= new Movie("Matrix 4",11,120,2000);
        Movie movie7= new Movie("Matrix 5",2,120,2000);
        Movie movie8= new Movie("Matrix 6",1,120,2000);

        ArrayList<Movie>cinemaMovies = new ArrayList<>(Arrays.asList(movie3,movie1,movie5,movie6));
        Cinema cinema = new Cinema("NY", 3 , cinemaMovies);

        Netflix netflix = new Netflix("netflix.com",19.99,4);

        Amazon amazon = new Amazon("amazon.com",50,10);

        Hulu hulu = new Hulu("hulu.com", 15,11);


        ArrayList<PlayMovie> streamingSites = new ArrayList<>();
        streamingSites.add(netflix);
        streamingSites.add(amazon);
        streamingSites.add(hulu);
        streamingSites.add(cinema);

        for (PlayMovie ea : streamingSites) {
            if(ea instanceof Cinema){
                System.out.println(((Cinema) ea).movies);
            }
        }

        System.out.println("moviesAvailable netflix");
        for (PlayMovie each : streamingSites) {
            if(each instanceof Netflix){
                System.out.println(((Netflix) each).moviesAvailable);
            }
        }


        System.out.println("homework");
        System.out.println("print min subscription amount in Streaming sites  get - url");


        double min = Double.MAX_VALUE;
        StreamingSite minURL = null;

        for (PlayMovie ea : streamingSites) {
            if (ea instanceof StreamingSite) {
                if (((StreamingSite) ea).subscriptionAmount < min) {
                    min = ((StreamingSite) ea).subscriptionAmount;
                    minURL = ((StreamingSite) ea);
                }

            }
        }
        System.out.println("min url = " + minURL.url+" price is "+minURL.subscriptionAmount);

        }


    }

