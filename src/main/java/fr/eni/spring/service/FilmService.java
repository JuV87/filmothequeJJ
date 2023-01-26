package fr.eni.spring.service;

import fr.eni.spring.model.Film;

public interface FilmService {
	
	public Film showMovie(int id); 
	
	public Film showAllMovies(); 
	
	public Film addMovie();

}
