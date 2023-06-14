package week14.evening.movie;

public class Amazon extends StreamingSite{
    public Amazon(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("subscribed to Amazon");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("playing movie: "+movie.getTitle()+" on Amazon");
    }

    @Override
    void pause() {
        System.out.println("pausing movie on Amazon");
    }
}
