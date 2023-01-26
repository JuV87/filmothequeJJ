package fr.eni.spring.model;

import lombok.Data;

@Data
public class Avis {

    public long id = 0;
    public int note = 0;
    public String commentaire = "";

}
