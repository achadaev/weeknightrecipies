package com.example.weeknightrecipes.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import static com.example.weeknightrecipes.constant.DatabaseConstants.TableNames.INGREDIENT;

@Entity
@Table(name = INGREDIENT)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NonNull
    private String name;
}
