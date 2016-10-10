package week6Assessment.copy;
import java.util.ArrayList;

import co.grandcircus.movielab.Movie;

public class ErrorsO {

    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<String>();
        movies.add(new Movie("The LEGO Movie", "awesome"));
        movies.add(new Movie("Finding Nemo", "cartoon"));

        // Print out all the movie titles
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }

    }

}
public class ErrorsO {

}
