package com.example.weeknightrecipes.service;

import com.example.weeknightrecipes.model.Measure;
import com.example.weeknightrecipes.repository.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasureService {
    @Autowired
    private MeasureRepository measureRepository;

    public List<Measure> getAllMeasures() {
        return measureRepository.findAll();
    }

    public Measure getMeasureById(Long id) {
        return measureRepository.findById(id).orElseThrow();
    }

    public Measure addMeasure(Measure measure) {
        return measureRepository.save(measure);
    }

    public Measure updateMeasure(Measure measure) {
        return measureRepository.save(measure);
    }

    public void deleteMeasure(Long id) {
        measureRepository.deleteById(id);
    }
}
