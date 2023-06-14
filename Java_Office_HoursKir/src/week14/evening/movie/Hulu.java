package week14.evening.movie;

public final class Hulu extends StreamingSite{
    public Hulu(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("subscribed to Hulu");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("playing movie: "+movie.getTitle()+" on Hulu");
    }

    @Override
    void pause() {
        System.out.println("pausing movie on Hulu");
    }
}
