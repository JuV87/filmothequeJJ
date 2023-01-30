package fr.eni.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Avis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public int note;
    public String commentaire = "";

    public Avis() {
        // TODO Auto-generated constructor stub
    }

    public Avis(long id, int note, String commentaire) {
        super();
        this.id = id;
        this.note = note;
        this.commentaire = commentaire;
    }

}

