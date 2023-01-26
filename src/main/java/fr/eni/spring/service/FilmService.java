package fr.eni.spring.service;

import fr.eni.spring.model.Film;

import java.util.List;

public interface FilmService {
	
	Film showMovie(long id);

	List<Film> showAllMovies();
	
	Film addMovie();

}
