package week14.morning.movie;

public abstract class StreamingSite extends HasSubscription implements PlayMovie {
    /*
        - Create an abstract class StreamingSite
        implement the PlayMovie & HasSubcription interfaces - don't need to implement the methods

        create the following instance variables:
            url, subscription amount, movies available(int)

        create a constructor to initialize all the variables

        create an abstract method:
            pause()

     */

    String url;
    double subscriptionAmount;
    int moviesAvailable;

    public StreamingSite(String url, double subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    public abstract void subscribe();

    public abstract void pause();
}
