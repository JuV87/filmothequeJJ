package fr.eni.spring.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nom;
    public String prenom;
    public String login;
    public String password;
    public Boolean isAdmin = false;
}
