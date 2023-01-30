package fr.eni.spring.model;

import lombok.Data;

@Data
public class Participant {

    public Participant (long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Participant() {

    }

    public long id = 0;
    public String nom = "";
    public String prenom = "";
}
