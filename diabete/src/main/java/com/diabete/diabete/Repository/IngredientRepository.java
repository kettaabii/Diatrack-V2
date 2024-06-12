package com.diabete.diabete.Repository;

import com.diabete.diabete.Models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
