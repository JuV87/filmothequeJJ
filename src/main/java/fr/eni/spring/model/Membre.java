package fr.eni.spring.model;

import lombok.Data;

@Data
public class Membre {

    public long id = 0;
    public String nom = "";
    public String prenom = "";
    public String login = "";
    public String password = "";
    public Boolean isAdmin = false;
}
