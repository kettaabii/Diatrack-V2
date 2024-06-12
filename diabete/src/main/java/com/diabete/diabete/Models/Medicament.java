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
@Entity(name = "Medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedicament;

    @Column
    private String libelle_Medicament;

    @Column
    private String Type_Medicament;

    @Column
    private Integer DoseJournaliere;

    @Column
    private Integer DosesPrise;

    @Column
    private String Picture ;

}
