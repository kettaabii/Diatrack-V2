package com.diabete.diabete.Entities;

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
    private Integer valeurBefore;

    @Column
    private Integer valeurAfter;

    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(name = "heurs")
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime heurs;

    @ManyToOne
    @JoinColumn(name = "idDiabetiques")
    private Diabetiques diabetiques;



    public Integer getIdGlycemie() {
        return idGlycemie;
    }

    public void setIdGlycemie(Integer idGlycemie) {
        this.idGlycemie = idGlycemie;
    }

    public Integer getValeurBefore() {
        return valeurBefore;
    }

    public void setValeurBefore(Integer valeurBefore) {
        this.valeurBefore = valeurBefore;
    }

    public Integer getValeurAfter() {
        return valeurAfter;
    }

    public void setValeurAfter(Integer valeurAfter) {
        this.valeurAfter = valeurAfter;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeurs() {
        return heurs;
    }

    public void setHeurs(LocalTime heurs) {
        this.heurs = heurs;
    }

    public Diabetiques getDiabetiques() {
        return diabetiques;
    }

    public void setDiabetiques(Diabetiques diabetiques) {
        this.diabetiques = diabetiques;
    }
}
