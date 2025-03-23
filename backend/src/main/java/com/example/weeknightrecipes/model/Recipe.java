package com.example.weeknightrecipes.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.util.List;

import static com.example.weeknightrecipes.constant.DatabaseConstants.TableNames.RECIPE;

@Entity
@Table(name= RECIPE)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NonNull
    private String name;

    @OneToMany(mappedBy = RECIPE, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private List<RecipeIngredient> ingredients;

    @NonNull
    private String videoUrl;
}
