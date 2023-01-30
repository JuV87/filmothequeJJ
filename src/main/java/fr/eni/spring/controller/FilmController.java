package fr.eni.spring.controller;

import fr.eni.spring.model.Film;
import fr.eni.spring.model.Genre;
import fr.eni.spring.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller

public class FilmController {

    private FilmService filmService;
    private List<Genre> genres;

    public FilmController(FilmService filmService){

        this.filmService = filmService;
        genres = filmService.getGenres();
    }
    
    @GetMapping("/details/{id}")
    public String afficherFilm(@PathVariable long id, Model model) {
    	model.addAttribute("film", filmService.getMovie(id));
    	return "details";
    }

    @GetMapping("/films/ajouter")
    public String afficherAjoutFilm(Model model) {
        model.addAttribute("film", new Film());


        return "ajout-film";
    }

}
