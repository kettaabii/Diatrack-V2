package com.diabete.diabete.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Glycemie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGlycemie;

    @Column
    private Integer valeurGlycemie;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate Date;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime Heure;
    @Column
    private String Commentaire;

    @ManyToOne
    @JoinColumn(name = "idDiabetiques")
    private Diabetiques diabetiques;

}
