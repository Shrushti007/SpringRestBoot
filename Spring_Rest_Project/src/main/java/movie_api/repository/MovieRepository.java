package movie_api.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import movie_api.entity.Movie;
import movie_api.store.MovieStore;
@Repository //Marks this class as a repository
public class MovieRepository {
	public static Collection<Movie>  getAllMovies(){
		
		Collection<Movie> allMovies = 
		MovieStore.getAllMovies();//
		return allMovies;	
}
	public static Movie getOneMovie(Integer id) {
		Movie foundMovie = MovieStore.getOneMovie(id);
		return foundMovie;
	
}
	public void addNewMovie(Movie movieRef) {
		MovieStore.addNewMovie(movieRef);
	}
}
