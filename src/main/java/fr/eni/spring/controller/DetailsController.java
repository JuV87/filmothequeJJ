package fr.eni.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.eni.spring.model.Film;

@Controller
@RequestMapping("/liste")
public class DetailsController {

    @GetMapping
    public String detail(Model model) {
        Film film = new Film(1, "Harry Pouter", 2001, 140, "Je suis un synopsis");
        Film film2 = new Film(2, "Le seigneur des anneaux", 2003, 300, "Je suis un synopsis intéressant");

        List<Film> listFilm = new ArrayList<Film>();
            listFilm.add(film);
            listFilm.add(film2);
        model.addAttribute("films",listFilm);
            return "liste";
    }
}

