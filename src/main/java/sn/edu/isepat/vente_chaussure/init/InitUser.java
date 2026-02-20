package sn.edu.isepat.vente_chaussure.init;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.edu.isepat.vente_chaussure.entities.Utilisateur;
import sn.edu.isepat.vente_chaussure.repositories.UtilisateurRepository;
import sn.edu.isepat.vente_chaussure.services.UtilisateurService;

@RequiredArgsConstructor
@Component
public class InitUser implements CommandLineRunner {

    private final UtilisateurRepository utilisateurRepository;
    private final UtilisateurService utilisateurService;

  /*  public InitUser(UtilisateurService utilisateurService, UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
        this.utilisateurService = utilisateurService;
    }*/

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        if(utilisateurRepository.count() == 0){
            System.out.println("Pas d'utilisateur dans la base données");
            System.out.println("Initialisation des utilisateurs");
            Utilisateur user1 = Utilisateur.builder()
                    .prenom("Bineta")
                    .nom("Dieye")
                    .email("bineta@gmail.com")
                    .password("bdieye")
                    .build();

            utilisateurService.ajout(user1);

            Utilisateur user2 = Utilisateur.builder()
                    .prenom("Awa")
                    .nom("Sy")
                    .password("asy")
                    .telephone("77 123 45 67")
                    .build();

            utilisateurService.ajout(user2);
        }
    }
}
