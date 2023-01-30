package fr.eni.spring.model;

import jakarta.persistence.Entity;
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
    public long id = 0;
    public String nom = "";
    public String prenom = "";
}
