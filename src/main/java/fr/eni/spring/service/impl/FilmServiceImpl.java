package fr.eni.spring.service.impl;

import fr.eni.spring.model.Film;
import fr.eni.spring.model.Genre;
import fr.eni.spring.model.Participant;
import fr.eni.spring.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private List<Film> listFilm = new ArrayList<Film>();

    public FilmServiceImpl() {


        Film film = new Film(0, "Harry Pouter", 2001, 140, "Je suis un synopsis", comedie, spielberg);
        Film film2 = new Film(1, "Le seigneur des anneaux", 2003, 300, "Je suis un synopsis intéressant", action, spielberg );
        Film film3 = new Film(2, "Taxi", 1995, 240, "Je suis un synopsis pas intéressant", comedie, spielberg);
        Film film4 = new Film(3, "Les 101 dalmatiens", 1960, 200, "Je suis intéressant", action, spielberg );
        Film film5 = new Film(4, "Peur bleue", 2004, 270, "Je suis", scienceFiction, spielberg);


        film.addActeur(archainbaud);
        film.addActeur(henryThomas);
        film.addActeur(marylin);

        film2.addActeur(archainbaud);

        film3.addActeur(tony);
        film3.addActeur(jack);

        film4.addActeur(iti);
        film4.addActeur(shirley);

        film5.addActeur(archainbaud);
        film5.addActeur(jack);
        film5.addActeur(shirley);

        listFilm.add(film);
        listFilm.add(film2);
        listFilm.add(film3);
        listFilm.add(film4);
        listFilm.add(film5);

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

    Participant archainbaud = new Participant(0, "Wilder", "Billy");
    Participant spielberg = new Participant(1, "Spielberg", "Steven");
    Participant patWelsh = new Participant(2, "Welsh", "Pat");
    Participant henryThomas = new Participant(3, "Thomas", "Henry");
    Participant marylin = new Participant(4, "Monroe", "Marylin");
    Participant tony = new Participant(5, "Curtis", "Tony");
    Participant jack = new Participant(6, "Lemmon", "Jack");
    Participant iti = new Participant(7, "Ti", "i");
    Participant shirley = new Participant(8, "Shirley", "MacLane");


    private List<Film> films ;
    private List<Genre> genres;
    private List<Participant> participants;


    Genre comedie = new Genre(0, "comedie");
    Genre scienceFiction = new Genre(1, "science fiction");
    Genre action = new Genre(2, "action");

    int compteurFilm = 2;




    @Override
    public List<Genre> getGenres() {
        if(genres==null) {
            genres = new ArrayList<Genre>();
            genres.add(comedie);
            genres.add(scienceFiction);

        }
        return genres;
    }

    @Override
    public List<Participant> getParticipants() {
        if(participants==null) {
            participants = new ArrayList<Participant>();
            participants.add(archainbaud);
            participants.add(spielberg);
            participants.add(patWelsh);
            participants.add(henryThomas);
            participants.add(marylin);
            participants.add(tony);
            participants.add(jack);
            participants.add(shirley);
        }
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
