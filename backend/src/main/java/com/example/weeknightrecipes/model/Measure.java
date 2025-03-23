package com.example.weeknightrecipes.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import static com.example.weeknightrecipes.constant.DatabaseConstants.TableNames.MEASURE;

@Entity
@Table(name = MEASURE)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Measure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NonNull
    private String name;
}
