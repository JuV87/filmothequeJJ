package fr.eni.spring.service.impl;

import fr.eni.spring.model.Film;
import fr.eni.spring.model.Genre;
import fr.eni.spring.model.Participant;
import fr.eni.spring.repository.FilmRepo;
import fr.eni.spring.repository.GenreRepo;
import fr.eni.spring.repository.ParticipantRepo;
import fr.eni.spring.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepo repository;
    private final GenreRepo genreRepo;
    private final ParticipantRepo participantRepo;

    private final List<Film> listFilm = new ArrayList<Film>();

    public FilmServiceImpl(FilmRepo repository, GenreRepo genreRepo, ParticipantRepo participantRepo) {

        this.genreRepo = genreRepo;
        genreRepo.save(new Genre("comedie"));
        genreRepo.save(new Genre("science fiction"));
        genreRepo.save(new Genre("action"));
        genreRepo.save(new Genre("drama"));

        this.participantRepo = participantRepo;
        participantRepo.save(new Participant("Wilder", "Billy"));
        participantRepo.save(new Participant("Welsh", "Pat"));
        participantRepo.save(new Participant("Monroe", "Marylin"));
        participantRepo.save(new Participant("Thomas", "Henry"));
        participantRepo.save(new Participant("Georgette", "Dupont"));

         this.repository = repository;
    }

    @Override
    public Film getMovie(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Film> getAllMovies() {
        return repository.findAll();
    }

    @Override
    public Film addMovie(Film film) {
        // TODO Auto-generated method stub
    return repository.save(film);
    }




    private List<Film> films ;
    private List<Genre> genres;
    private List<Participant> realisateur;
    private List<Participant> acteurs;




    @Override
    public List<Genre> getGenres() {
        if(genres==null) {
            genres = new ArrayList<Genre>();
            genres = genreRepo.findAll();

        }
        return genres;
    }

    @Override
    public List<Participant> getParticipants() {
        if(acteurs==null) {
            acteurs = new ArrayList<Participant>();
            acteurs = participantRepo.findAll();

        }
        return acteurs;
    }

    @Override
    public Genre getGenreById(int genreId) {
        return null;
    }

    @Override
    public Participant getParticipantById(int realisateurId) {
        return null;
    }

    public Optional<Genre> getGenreById(Long genreId) {
        return genreRepo.findById(genreId);
    }

    public Optional<Participant> getParticipantById(long realisateurId) {
            return participantRepo.findById(realisateurId);
    }

    @Override
    public void ajouterFilm(Film film) {
        repository.save(film);


    }
}
