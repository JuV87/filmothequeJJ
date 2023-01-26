package fr.eni.spring.controller;

import fr.eni.spring.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;
    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }
}
