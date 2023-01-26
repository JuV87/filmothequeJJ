package fr.eni.spring.controller;

import fr.eni.spring.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GenreController {

    @Autowired
    private GenreService genreService;
    public GenreController(GenreService genreService){
        this.genreService = genreService;
    }
}
