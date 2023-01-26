package fr.eni.spring.model;

import lombok.Data;

@Data
public class Film {

    public Film(int i, String string, int j, int k, String string2) {
		// TODO Auto-generated constructor stub
	}
    

	public long id;
    public String titre;
    public int annee;
    public int duree;
    public String synopsis;
}
