package fr.eni.spring.service.impl;

import fr.eni.spring.model.Film;
import fr.eni.spring.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private List<Film> listFilm = new ArrayList<Film>();

    public FilmServiceImpl() {
        Film film = new Film(0, "Harry Pouter", 2001, 140, "Je suis un synopsis");
        Film film2 = new Film(1, "Le seigneur des anneaux", 2003, 300, "Je suis un synopsis intéressant");
        Film film3 = new Film(2, "Taxi", 1995, 240, "Je suis un synopsis pas intéressant");
        Film film4 = new Film(3, "Les 101 dalmatiens", 1960, 200, "Je suis intéressant");
        Film film5 = new Film(4, "Peur bleue", 2004, 270, "Je suis");
        Film film6 = new Film(5, "Mulan", 2001, 280, "Je suis Mulan");
        Film film7 = new Film(6, "Les gardiens de la galaxie", 2010, 275, "Je s'appelle Groot");

        listFilm.add(film);
        listFilm.add(film2);
        listFilm.add(film3);
        listFilm.add(film4);
        listFilm.add(film5);
        listFilm.add(film6);
        listFilm.add(film7);
    }

    @Override
    public Film getMovie(long id) {
        // TODO Boucle for pour retrouver le film avec l'id
        return listFilm.get((int) id);
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
}
