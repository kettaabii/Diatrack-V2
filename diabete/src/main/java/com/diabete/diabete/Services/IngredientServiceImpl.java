package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Ingredient;
import com.diabete.diabete.Repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    @Override
    public List<Ingredient> getIngredients() {
        return ingredientRepository.findAll();
    }
}
