package fr.eni.spring.controller;

import fr.eni.spring.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MembreController {

    @Autowired
    private MembreService membreService;
    public MembreController(MembreService membreService){
        this.membreService = membreService;
    }
}
