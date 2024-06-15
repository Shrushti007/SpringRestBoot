package movie_api.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import movie_api.entity.Movie;
import movie_api.repository.MovieRepository;
import movie_api.store.MovieStore;

@Service // Marks this class as a Service
public class MovieService {
	@Autowired // Auto-wiring MovieRepository
	private MovieRepository movieRepositoryRef;

	public Collection<Movie> getAllMovies() {

		Collection<Movie> allMovies = movieRepositoryRef.getAllMovies();
		return allMovies;
	}

	public Movie getOneMovie(Integer id) {
		Movie foundMovie = movieRepositoryRef.getOneMovie(id);
		return foundMovie;

	}
	public void addNewMovie(Movie movieRef) {
		movieRepositoryRef.addNewMovie(movieRef);
	}

}
