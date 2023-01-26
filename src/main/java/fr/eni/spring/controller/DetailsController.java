package fr.eni.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.eni.spring.model.Film;

@Controller
@RequestMapping("/details")
public class DetailsController {
   
	@GetMapping
    public String detail(Model model) {
    	Film film = new Film(1, "Harry Pouter", 2001, 140, "Je suis un synopsis");
    	Film film2 = new Film(2, "Le seigneur des anneaux", 2003, 300, "Je suis un synopsis intéressant");
    	
    	List<Film> listeFilms = listeFilms.add(film, film2);
    	(List<Film>) model.addAttribute("film", listeFilms);
    	return "details";
    }
    
     
}
