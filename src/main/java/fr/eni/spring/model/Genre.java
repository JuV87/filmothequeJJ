package fr.eni.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Genre {

    @Id
    public long id = 0;
    public String libelle = "";

    public Genre(long i, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Genre() {

    }
}