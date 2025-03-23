package com.example.weeknightrecipes.repository;

import com.example.weeknightrecipes.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
