package com.example.weeknightrecipes.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import static com.example.weeknightrecipes.constant.DatabaseConstants.ColumnNames.*;
import static com.example.weeknightrecipes.constant.DatabaseConstants.TableNames.RECIPE_INGREDIENT;

@Entity
@Table(name = RECIPE_INGREDIENT)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = RECIPE_ID, nullable = false)
    @JsonBackReference
    @NonNull
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = INGREDIENT_ID, nullable = false)
    @NonNull
    private Ingredient ingredient;

    @ManyToOne
    @JoinColumn(name = MEASURE_ID)
    @NonNull
    private Measure measure;

    @Column(nullable = false)
    @NonNull
    private Double amount;
}


