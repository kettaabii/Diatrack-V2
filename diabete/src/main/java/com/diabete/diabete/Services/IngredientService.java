package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Ingredient;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IngredientService {


    Page<Ingredient> getIngredients(org.springframework.data.domain.Pageable pageable);
}
