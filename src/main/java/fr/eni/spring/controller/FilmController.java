package fr.eni.spring.controller;

import fr.eni.spring.model.Film;
import fr.eni.spring.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class FilmController {

    @Autowired
    private FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }
    
    @GetMapping("/details/{id}")
    public String afficherFilm(@PathVariable long id, Model model) {
    	Film film = new Film(1, "Harry Pouter", 2001, 140, "Je suis un synopsis");
        Film film2 = new Film(2, "Le seigneur des anneaux", 2003, 300, "Je suis un synopsis intéressant");
    	model.addAttribute("film", film);
    	model.addAttribute("film", film2);
    	return "details";
    }

}
