package fr.eni.spring.controller;

import java.util.ArrayList;
import java.util.List;

import fr.eni.spring.service.FilmService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.eni.spring.model.Film;

@Controller
@RequestMapping("/liste")
public class DetailsController {

    private FilmService filmService;

    public DetailsController(FilmService filmService){
        this.filmService = filmService;
    }
    @GetMapping
    public String detail(Model model) {
        model.addAttribute("films",filmService.getAllMovies());
            return "liste";
    }
}

