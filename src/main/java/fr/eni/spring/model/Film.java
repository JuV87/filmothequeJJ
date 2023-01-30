package fr.eni.spring.model;

import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "Films")
public class Film {

	public Film(long id, String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur, Participant acteurs, Avis avis) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.genre = genre;
		this.acteurs = new ArrayList<Participant>();
		this.avis = new ArrayList<Avis>();

	}

	public Film(long id, String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.genre = genre;
		this.realisateur = realisateur;
		this.avis = new ArrayList<Avis>();

	}

	public Film(long id) {
		this.id = id;
	}

	public Film() {
		this.acteurs = new ArrayList<>();
	}

	public void addActeur(Participant acteur) {
		this.acteurs.add(acteur);
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column
	@NotNull
	public String titre;
	@Column
	public int annee;
	@Column
	public int duree;

	private String synopsis;

	private List<Avis> avis;
	@ManyToOne
	private Genre genre;
	@ManyToOne
	private Participant realisateur;
	@OneToMany
	private List<Participant> acteurs;




}
