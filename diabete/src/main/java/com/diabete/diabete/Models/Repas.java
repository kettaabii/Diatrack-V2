package com.diabete.diabete.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Repas")
public class Repas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer RepasId;

    @Column
    private String RepasName;

    @Column
    private String RepasDescription;

    @Column
    private String Recette;

    @Column
    private Double ValeurGlicemie;

    @Column
    private Double Carbs;

    @Column
    private Double Gl;

    @Column
    private Double Protein;

    @Column
    private Double Kcal;



}
