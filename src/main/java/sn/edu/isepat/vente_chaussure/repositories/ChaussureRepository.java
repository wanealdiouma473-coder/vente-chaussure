package sn.edu.isepat.vente_chaussure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isepat.vente_chaussure.entities.Chaussure;

public interface ChaussureRepository extends JpaRepository<Chaussure, Integer> {
}