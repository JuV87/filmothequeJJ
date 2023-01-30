package fr.eni.spring.service;

import fr.eni.spring.model.Film;
import fr.eni.spring.model.Genre;
import fr.eni.spring.model.Participant;

import java.util.List;

public interface FilmService {
	
	Film getMovie(long id);

	List<Film> getAllMovies();
	
	Film addMovie();

	List<Genre> getGenres();

	List<Participant> getParticipants();

	Genre getGenreById(int genreId);

	Participant getParticipantById(int realisateurId);

	void ajouterFilm(Film film);
}
