package week14.evening.movie;

public abstract class StreamingSite implements PlayMovie,HasSubscription {
    String url;
    double subscriptionAmount;
    int moviesAvailable;

    public StreamingSite(String url, double subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    abstract void pause();


}
