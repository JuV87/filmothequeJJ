INSERT INTO participant (nom, prenom ) values ("steven", "spielberg");
INSERT INTO participant (nom, prenom ) values ("George", "Lucas");
INSERT INTO participant (nom, prenom ) values ("Stephen", "King");
INSERT INTO participant (nom, prenom ) values ("Stan", "Lee");


INSERT INTO genre (libelle) values ("comédie");
INSERT INTO genre (libelle) values ("science fiction");
INSERT INTO genre (libelle ) values ("action");

INSERT INTO films (id, annee, duree, synopsis, titre, genre_id, realisateur_id ) values (?, 2005, 160, "blablabla", "Peur bleue", 0, 0);