package com.example.weeknightrecipes.controller;

import com.example.weeknightrecipes.model.RecipeIngredient;
import com.example.weeknightrecipes.service.RecipeIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe-ingredients")
@CrossOrigin(origins = "http://localhost:3000")
public class RecipeIngredientController {
    @Autowired
    private RecipeIngredientService recipeIngredientService;

    @GetMapping
    public List<RecipeIngredient> getAllRecipeIngredients() {
        return recipeIngredientService.getAllRecipeIngredients();
    }

    @GetMapping("/{id}")
    public RecipeIngredient getRecipeIngredientById(@PathVariable Long id) {
        return recipeIngredientService.getRecipeIngredientById(id);
    }

    @PostMapping
    public RecipeIngredient addRecipeIngredient(@RequestBody RecipeIngredient recipeIngredient) {
        return recipeIngredientService.addRecipeIngredient(recipeIngredient);
    }

    @PutMapping
    public RecipeIngredient updateRecipeIngredient(@RequestBody RecipeIngredient recipeIngredient) {
        return recipeIngredientService.updateRecipeIngredient(recipeIngredient);
    }

    @DeleteMapping("/{id}")
    public void deleteRecipeIngredient(@PathVariable Long id) {
        recipeIngredientService.deleteRecipeIngredient(id);
    }
}
