package Self_PracticeKir.day25_constructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestMovieObjects {

    public static void main(String[] args) {

        Movie m1 = new Movie("USA","Stealth","SciFi", LocalDate.of(2002,6,13),"Mike Y",  new ArrayList<>(Arrays.asList("Boba T","Paul T","Scott P")));

        System.out.println(m1); //Movie{country='USA', title='Stealth', releaseDate=2002-06-13, total number of casts =3}

        m1.addCast("Tanya D");
        System.out.println(m1); //Movie{country='USA', title='Stealth', releaseDate=2002-06-13, total number of casts =4}

        m1.addCasts(new String[]{"Boba F","Donna L","Nancy F"});
        System.out.println(m1);//Movie{country='USA', title='Stealth', releaseDate=2002-06-13, total number of casts =7}

    }
}
