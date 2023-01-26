package fr.eni.spring.service;

import fr.eni.spring.model.Film;

import java.util.List;

public interface FilmService {
	
	Film getMovie(long id);

	List<Film> getAllMovies();
	
	Film addMovie();

}
