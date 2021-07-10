import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class MovieStore {
    List<Movie> movies = new LinkedList<Movie>();
    public List<Movie> findByPartialTitle(String partialTitle) {
        List<Movie> result = new LinkedList<Movie>();
        for (Movie movie : movies) {
            if (movie.title().toUpperCase().contains(partialTitle.toUpperCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> findByPartialDirector(String partialDirector) {
        List<Movie> result = new LinkedList<Movie>();
        for (Movie movie : movies) {
            if (movie.director().toUpperCase().contains(partialDirector.toUpperCase())) {
                result.add(movie);
            }
        }
        return result;
    }

    public List<Movie> findByReleaseYear(int from, int to) {
        List<Movie> result = new LinkedList<Movie>();
        for (Movie movie : movies) {
            if (movie.releaseYear() >= from && movie.releaseYear() <= to) {
                result.add(movie);
            }
        }
        return result;
    }
}
