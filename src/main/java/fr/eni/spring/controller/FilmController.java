package fr.eni.spring.controller;

import fr.eni.spring.model.Film;
import fr.eni.spring.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/details")
public class FilmController {

    @Autowired
    private FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

//    @GetMapping
//    public List<Film> showAllMovies() {
//        return filmService.showAllMovies();
//    }

}
