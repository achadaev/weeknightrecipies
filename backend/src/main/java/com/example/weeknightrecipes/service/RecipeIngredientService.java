package com.example.weeknightrecipes.service;

import com.example.weeknightrecipes.model.RecipeIngredient;
import com.example.weeknightrecipes.repository.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIngredientService {
    @Autowired
    private RecipeIngredientRepository recipeIngredientRepository;

    public List<RecipeIngredient> getAllRecipeIngredients() {
        return recipeIngredientRepository.findAll();
    }

    public RecipeIngredient getRecipeIngredientById(Long id) {
        return recipeIngredientRepository.findById(id).orElseThrow();
    }

    public RecipeIngredient addRecipeIngredient(RecipeIngredient recipeIngredient) {
        return recipeIngredientRepository.save(recipeIngredient);
    }

    public RecipeIngredient updateRecipeIngredient(RecipeIngredient recipeIngredient) {
        return recipeIngredientRepository.save(recipeIngredient);
    }

    public void deleteRecipeIngredient(Long id) {
        recipeIngredientRepository.deleteById(id);
    }
}
