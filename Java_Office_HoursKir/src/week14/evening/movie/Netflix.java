package week14.evening.movie;

public final class Netflix extends StreamingSite{
    public Netflix(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("subscribed to netflix");
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("playing movie: "+movie.getTitle()+" on netflix");
    }

    @Override
    void pause() {
        System.out.println("pausing movie on netflix");
    }
}
