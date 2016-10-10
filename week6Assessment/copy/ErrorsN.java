package week6Assessment.copy;

import java.util.ArrayList;


public class ErrorsN {

    public static void main(String[] args) {

        Movie movies = new ArrayList<Movie>();
        movies.add(new Movie("The LEGO Movie", "awesome"));
        movies.add(new Movie("Finding Nemo", "cartoon"));

        // Print out all the movie titles
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }

    }

}