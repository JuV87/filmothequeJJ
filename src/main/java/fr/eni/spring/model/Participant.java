package fr.eni.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Participant {

    public Participant (long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Participant() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nom;
    public String prenom;

    public Participant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
