package sn.edu.isepat.vente_chaussure.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "chaussure")
public class Chaussure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private  String nom;

    @Column(nullable = false)
    private Double prix;

    private String description;
}