package fr.eni.spring.model;

import lombok.Data;

@Data
public class Avis {

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

