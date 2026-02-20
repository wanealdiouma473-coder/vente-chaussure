package sn.edu.isepat.vente_chaussure.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.edu.isepat.vente_chaussure.dto.UtilisateurCreateDTO;
import sn.edu.isepat.vente_chaussure.entities.Utilisateur;
import sn.edu.isepat.vente_chaussure.repositories.UtilisateurRepository;
import sn.edu.isepat.vente_chaussure.services.UtilisateurService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;
    private final UtilisateurRepository utilisateurRepository;

    @GetMapping
    public List<Utilisateur> getAllUser(){
        return utilisateurService.findAllUser();
    }

    @GetMapping("/{id}")
    public Utilisateur findById(@PathVariable Integer id) {
        return utilisateurService.findById(id);
    }

    @PostMapping
    public Utilisateur ajout(@RequestBody UtilisateurCreateDTO user) {
        return utilisateurService.ajout(user.toUtilisateur());
    }
}
