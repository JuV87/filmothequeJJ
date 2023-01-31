package fr.eni.spring.service;

import fr.eni.spring.model.Film;
import fr.eni.spring.model.Genre;
import fr.eni.spring.model.Participant;

import java.util.List;
import java.util.Optional;

public interface FilmService {
	
	Optional<Film> getMovie(long id);

	List<Film> getAllMovies();

	Film addMovie(Film film);

	List<Genre> getGenres();

	List<Participant> getParticipants();

	Genre getGenreById(int genreId);

	Participant getParticipantById(int realisateurId);

	void ajouterFilm(Film film);
}
