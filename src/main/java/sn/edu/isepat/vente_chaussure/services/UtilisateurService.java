package sn.edu.isepat.vente_chaussure.services;

import org.springframework.stereotype.Service;
import sn.edu.isepat.vente_chaussure.entities.Utilisateur;
import sn.edu.isepat.vente_chaussure.repositories.UtilisateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur ajout(Utilisateur user) {
        if (user == null) {
            throw new RuntimeException("User est nul");
        }

        if (user.getId() != null) {
            throw new RuntimeException("l'id ne doit pas etre renseigne pour un nouvel utilisateur");
        }

        if (user.getPrenom() == null || user.getPrenom().isBlank()){
            throw new RuntimeException("Le prenom est obligatoire");
        }

        if (user.getNom() == null || user.getNom().isBlank()){
            throw new RuntimeException("Le nom est obligatoire");
        }

        if (
                (user.getTelephone() == null || user.getTelephone().isBlank())
                && (user.getEmail() == null || user.getEmail().isBlank())
        ){
            throw new RuntimeException("Vous devez renseigné l'email ou le telephone");
        }


        return utilisateurRepository.save(user);
    }

    public List<Utilisateur> findAllUser() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur findById(Integer id) {
        Optional<Utilisateur> utilisateurdb = utilisateurRepository.findById(id);
        if (utilisateurdb.isPresent()) {
            Utilisateur user = utilisateurdb.get();
            return user;
        }
        throw new RuntimeException("L'utilisateur dont l'id est " + id + " n'existe pas");
    }


}
