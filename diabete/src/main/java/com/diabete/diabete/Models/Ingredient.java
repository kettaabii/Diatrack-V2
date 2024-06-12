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
@Entity(name = "Ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IngredientId;

    @Column
    private String IngredientName;

    @Column
    private String IngredientPicture;

    @Column
    private Double Carbs;

    @Column
    private Double Gl;

    @Column
    private Double Protein;

    @Column
    private Double Kcal;
}
