package movie_api.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import movie_api.entity.Movie;

public class MovieStore {
	//This class maintain data about movies(using in-memory)
	
	private static Map<Integer, Movie> allMovies;
	static {
		//Initializing this Map
		allMovies = new HashMap<>();
		Movie m1 = new Movie(101,"Mr.India", "Fantasy", 1980);
		Movie m2 = new Movie(102,"Titanic", "Thriller", 1999);
		Movie m3 = new Movie(103,"Life of Pi", "Emotional", 1992);
		Movie m4 = new Movie(104,"Source Code", "Action", 2008);
		Movie m5 = new Movie(105,"Dhamaal", "Comedy", 2018);
		
		allMovies.put(m1.getMovieId(), m1);
		allMovies.put(m2.getMovieId(), m2);
		allMovies.put(m3.getMovieId(), m3);
		allMovies.put(m4.getMovieId(), m4);
		allMovies.put(m5.getMovieId(), m5);
	}
	public static Collection<Movie>getAllMovies(){
		
		Collection<Movie> allAvailableMovies=
		allMovies.values();
		
		return allAvailableMovies;
	}
	public static Movie getOneMovie(Integer id) {
		Movie foundMovie = allMovies.get(id);
		return foundMovie;
		
	}
	
	
	public static void addNewMovie(Movie movieRef) {
		allMovies.put(movieRef.getMovieId(), movieRef);
	}
}
