package fr.eni.spring.controller;

import fr.eni.spring.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AvisController {

    @Autowired
    private AvisService avisService;
    
    public AvisController(AvisService avisService){
        this.avisService = avisService;
    }
}
