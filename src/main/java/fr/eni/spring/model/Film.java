package fr.eni.spring.model;

import lombok.Data;

@Data
public class Film {

    public long id = 0;
    public String titre = "";
    public int annee = 0;
    public int duree = 0;
    public String synopsis = "";
}
