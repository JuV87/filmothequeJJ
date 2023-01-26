package fr.eni.spring.model;

import lombok.Data;

@Data
public class Film {

	public Film(long id, String titre, int annee, int duree, String synopsis) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}

	public Film(long id) {
		this.id = id;

	}

	public long id;
	public String titre;
	public int annee;
	public int duree;

	public String synopsis;
}
