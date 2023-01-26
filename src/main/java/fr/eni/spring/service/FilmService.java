package fr.eni.spring.service;

import fr.eni.spring.model.Film;

public interface FilmService {
	
	Film showMovie(int id);
	
	Film showAllMovies();
	
	Film addMovie();

}
