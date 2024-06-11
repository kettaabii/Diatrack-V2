package com.diabete.diabete.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "diabetiques")
public class Diabetiques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDiabetiques;

    @Column
    private String nameDiabetiques;

    @Column
    private Integer poids;

    @Column
    private Integer taille;

    @Column
    private Integer ageDiabetiques;

    @Column
    private String genre;

    @OneToMany(mappedBy = "diabetiques")
    private Collection<Glycemie> valuesGlycemies;


}
