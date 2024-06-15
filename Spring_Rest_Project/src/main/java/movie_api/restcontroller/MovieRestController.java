package movie_api.restcontroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import movie_api.entity.Movie;
import movie_api.service.MovieService;
import movie_api.store.MovieStore;

@RestController
public class MovieRestController {
	@Autowired
	private MovieService movieServiceRef;
	
	//Get /movie-api --> Get all Movies
//	@RequestMapping("/movie-api")
	@GetMapping("/movie-api")
	public Collection<Movie> getAllMovies(){
		Collection<Movie> allMovies=
				movieServiceRef.getAllMovies();
		return allMovies;
	}
	//Get /movie-api/101 --> Get one Movie
	@RequestMapping("/movie-api/{id}")
	public Movie getOneMovie(@PathVariable Integer id) {
		Movie foundMovie = movieServiceRef.getOneMovie(id);
		return foundMovie;
	
}
	//POST /movie-api
//@RequestMapping(value="/movie-api",method=RequestMethod.POST)
	@PostMapping("/movie-api")
	public void addNewMovie( @RequestBody Movie movieRef) {
		System.out.println("Movie.....movieRed" + movieRef);
		movieServiceRef.addNewMovie(movieRef);
	}
}
