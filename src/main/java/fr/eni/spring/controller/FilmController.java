package fr.eni.spring.controller;

import fr.eni.spring.controller.forms.FilmForm;
import fr.eni.spring.model.Film;
import fr.eni.spring.model.Genre;
import fr.eni.spring.service.FilmService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class FilmController {

    private final FilmService filmService;
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
        model.addAttribute("filmForm", new FilmForm());
        model.addAttribute("participants", filmService.getParticipants());
        return "ajout-film";
    }

    @PostMapping("/films/ajouter")
    public String ajouterFilm(@ModelAttribute FilmForm filmForm) {
        Film film = new Film();
        BeanUtils.copyProperties(filmForm, film);
        film.setGenre(filmService.getGenreById(filmForm.getGenreId()));
        film.setRealisateur(filmService.getParticipantById(filmForm.getRealisateurId()));
        for(int acteurId: filmForm.getActeursId() ) {
            film.addActeur(filmService.getParticipantById(acteurId));
        }
        filmService.ajouterFilm(film);

        return "redirect:/liste";
    }

}
