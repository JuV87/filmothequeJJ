package fr.eni.spring.controller;

import fr.eni.spring.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class FilmController {

    private FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }
    
    @GetMapping("/details/{id}")
    public String afficherFilm(@PathVariable long id, Model model) {
    	model.addAttribute("film", filmService.getMovie(id));
    	return "details";
    }

}
