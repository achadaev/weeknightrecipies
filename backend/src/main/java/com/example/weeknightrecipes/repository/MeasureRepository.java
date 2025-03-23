package com.example.weeknightrecipes.repository;

import com.example.weeknightrecipes.model.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRepository extends JpaRepository<Measure, Long> {
}
