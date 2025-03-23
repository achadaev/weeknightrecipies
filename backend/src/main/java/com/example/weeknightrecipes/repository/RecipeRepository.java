package com.example.weeknightrecipes.repository;

import com.example.weeknightrecipes.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
