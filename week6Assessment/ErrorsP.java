package week6Assessment;

import java.util.ArrayList;

import co.grandcircus.movielab.Movie;

public class ErrorsP {

    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("The LEGO Movie", "awesome"));
        movies.add(new Movie("Finding Nemo", "cartoon"));

        // Print out all the movie titles
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }

    }

}