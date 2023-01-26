package fr.eni.spring.controller;

import fr.eni.spring.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;
    public ParticipantController(ParticipantService participantService){
        this.participantService = participantService;
    }
}
