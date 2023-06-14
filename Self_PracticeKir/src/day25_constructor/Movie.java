package src.day25_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts;

    public Movie(String country, String title, String genre, LocalDate releaseDate, String director, ArrayList<String> casts) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        this.casts = casts;
    }

    public void addCast(String cast){
        casts.add(cast);
    }
    public void addCasts(String[] castS){
        casts.addAll(Arrays.asList(castS));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", total number of casts =" + casts.size() +
                '}';
    }
}
