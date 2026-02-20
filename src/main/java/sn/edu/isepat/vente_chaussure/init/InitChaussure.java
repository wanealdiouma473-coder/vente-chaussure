package sn.edu.isepat.vente_chaussure.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sn.edu.isepat.vente_chaussure.entities.Chaussure;
import sn.edu.isepat.vente_chaussure.repositories.ChaussureRepository;

@Order(2)
@Component
public class InitChaussure implements CommandLineRunner {

    private final ChaussureRepository chaussureRepository;

    public InitChaussure(ChaussureRepository chaussureRepository) {
        this.chaussureRepository = chaussureRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Initialisation Chaussure");

        Chaussure timberland = new Chaussure();
        timberland.setNom("Timberland");
        timberland.setPrix(60000.0);

        Chaussure airforce = new Chaussure();
        airforce.setNom("Air Force");
        airforce.setPrix(40000.0);


        chaussureRepository.save(timberland);
        chaussureRepository.save(airforce);

    }


}
