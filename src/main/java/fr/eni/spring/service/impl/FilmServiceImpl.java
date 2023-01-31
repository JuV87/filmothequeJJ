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

@Service
public class FilmServiceImpl implements FilmService {


    private final GenreRepo genreRepo;

    private final List<Film> listFilm = new ArrayList<Film>();

    public FilmServiceImpl(FilmRepo repository, GenreRepo genreRepo, ParticipantRepo participantRepo) {

        this.genreRepo = genreRepo;
        genreRepo.save(new Genre("comedie"));
        genreRepo.save(new Genre("science fiction"));
        genreRepo.save(new Genre("action"));
        genreRepo.save(new Genre("drama"));

        participantRepo.save(new Participant("Wilder", "Billy"));
        participantRepo.save(new Participant("Welsh", "Pat"));
        participantRepo.save(new Participant("Monroe", "Marylin"));
        participantRepo.save(new Participant("Thomas", "Henry"));
        participantRepo.save(new Participant("Georgette", "Dupont"));


        repository.save(new Film("Harry Pouter", 2001, 140, "Je suis un synopsis", genreRepo.findById(1L).get() , participantRepo.findById(1L).get()));
     //  repository.save(new Film("Le seigneur des anneaux", 2003, 300, "Je suis un synopsis intéressant", 2, 2 ));
     //  repository.save(new Film("Les 101 dalmatiens", 1960, 200, "Je suis intéressant", 3, 3 ));
     //  repository.save(new Film("Harry Pouter", 2001, 140, "Je suis un synopsis", 2, 4));
     //  repository.save(new Film("Peur bleue", 2004, 270, "Je suis", 4, 1));
    }

    @Override
    public Film getMovie(long id) {
        // TODO Boucle for pour retrouver le film avec l'id

        for(Film f: listFilm) {
            if(f.getId()==id){
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Film> getAllMovies() {
        return listFilm;
    }

    @Override
    public Film addMovie() {
        // TODO Auto-generated method stub
        return null;
    }




    private List<Film> films ;
    private List<Genre> genres;
    private List<Participant> participants;



    int compteurFilm = 2;




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
        return participants;
    }

    @Override
    public Genre getGenreById(int genreId) {
        for(Genre g: genres) {
            if(genreId==g.getId()) {
                return g;
            }
        }
        return null;
    }

    @Override
    public Participant getParticipantById(int realisateurId) {
        for(Participant p: participants) {
            if(realisateurId==p.getId()) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void ajouterFilm(Film film) {
        film.setId(compteurFilm++);
        films.add(film);

    }
}
