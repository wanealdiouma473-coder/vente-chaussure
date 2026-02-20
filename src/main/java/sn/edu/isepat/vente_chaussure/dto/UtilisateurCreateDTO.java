package sn.edu.isepat.vente_chaussure.dto;

import lombok.Getter;
import lombok.Setter;
import sn.edu.isepat.vente_chaussure.entities.Utilisateur;

@Getter
@Setter
public class UtilisateurCreateDTO {

    private String prenom;

    private String nom;

    private String email;

    private String password;

    private String adresse;

    private String telephone;

    public Utilisateur toUtilisateur() {
        return Utilisateur.builder()
                .prenom(prenom)
                .nom(nom)
                .email(email)
                .adresse(adresse)
                .telephone(telephone)
                .password(password)
                .build();
    }
}
