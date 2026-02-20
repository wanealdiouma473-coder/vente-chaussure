package sn.edu.isepat.vente_chaussure.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isepat.vente_chaussure.entities.Utilisateur;
import sn.edu.isepat.vente_chaussure.services.UtilisateurService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> getAllUser(){
        return utilisateurService.findAllUser();
    }
}
