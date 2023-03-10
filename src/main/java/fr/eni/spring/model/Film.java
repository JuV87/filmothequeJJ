package fr.eni.spring.model;

import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
//		this.avis = new ArrayList<Avis>();

    }

    public Film(long id, String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.genre = genre;
        this.realisateur = realisateur;
        this.acteurs = new ArrayList<Participant>();
//		this.avis = new ArrayList<Avis>();

    }

    public Film(long id) {
        this.id = id;
    }

    public Film() {
        this.acteurs = new ArrayList<>();
    }

    public Film(long id, String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur, List<Participant> acteurs) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.genre = genre;
        this.realisateur = realisateur;
        this.acteurs = acteurs;
    }

    public Film(String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur) {

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

    //	@ManyToOne
//	private List<Avis> avis;
    @ManyToOne
    private Genre genre;
    @ManyToOne()
    private Participant realisateur;
    @ManyToMany()
    private List<Participant> acteurs;


}
