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

        listFilm.add(film);
        listFilm.add(film2);
    }

    @Override
    public Film showMovie(long id) {
        // TODO Boucle for pour retrouver le film avec l'id

        for(Film f: listFilm) {
            if(f.getId()==id){
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Film> showAllMovies() {
        return listFilm;
    }

    @Override
    public Film addMovie() {
        // TODO Auto-generated method stub
        return null;
    }
}
