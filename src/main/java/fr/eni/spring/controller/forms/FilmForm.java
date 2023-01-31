package fr.eni.spring.controller.forms;

import lombok.Data;

import java.util.List;


@Data
public class FilmForm {
    //@NotBlank
    private String titre;

    //@Min(value = 1800)
    private int annee;

    //@NotNull
    private int duree;

    //@NotBlank
    private String synopsis;

    //@NotNull
    private int realisateurId;

    private List<Integer> acteursId;

    private int genreId;

    public FilmForm() {
        // TODO Auto-generated constructor stub
    }

    public FilmForm(String titre, int annee, int duree, String synopsis, int realisateurId, int genreId) {
        super();
        this.titre = titre;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
        this.realisateurId = realisateurId;
        this.genreId = genreId;
    }
}