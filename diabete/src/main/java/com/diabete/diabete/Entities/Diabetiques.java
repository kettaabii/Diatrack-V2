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

    public Integer getIdDiabetiques() {
        return idDiabetiques;
    }

    public void setIdDiabetiques(Integer idDiabetiques) {
        this.idDiabetiques = idDiabetiques;
    }

    public String getNameDiabetiques() {
        return nameDiabetiques;
    }

    public void setNameDiabetiques(String nameDiabetiques) {
        this.nameDiabetiques = nameDiabetiques;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) {
        this.taille = taille;
    }

    public Integer getAgeDiabetiques() {
        return ageDiabetiques;
    }

    public void setAgeDiabetiques(Integer ageDiabetiques) {
        this.ageDiabetiques = ageDiabetiques;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Collection<Glycemie> getValuesGlycemies() {
        return valuesGlycemies;
    }

    public void setValuesGlycemies(Collection<Glycemie> valuesGlycemies) {
        this.valuesGlycemies = valuesGlycemies;
    }

}
