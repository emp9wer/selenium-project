package week14.morning.shopping;


import week14.morning.movie.Movie;
import week14.morning.movie.PlayMovie;

public final class Amazon extends OnlineShopping implements PlayMovie {
    /*
        Create a concrete class Amazon
        - Make the class final
        - Inherit OnlineShopping and implement all abstract methods
     */


        @Override
        public void viewCart() {
            System.out.println("Viewing Amazon cart");
        }

        @Override
        public void shipItem() {
            System.out.println("Shipping from Amazon warehouse");
        }

        @Override
        public void buyItem() {
            System.out.println("Buying from Amazon");
        }

        @Override
        public void returnItem() {
            System.out.println("Returning to Amazon");
        }

    @Override
    public void playMovie(Movie movie) {
        System.out.println("playing movie "+movie.getTitle());
    }
}
