package com.example.weeknightrecipes.controller;

import com.example.weeknightrecipes.model.Measure;
import com.example.weeknightrecipes.service.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/measures")
@CrossOrigin(origins = "http://localhost:3000")
public class MeasureController {
    @Autowired
    private MeasureService measureService;

    @GetMapping
    public List<Measure> getAllMeasures() {
        return measureService.getAllMeasures();
    }

    @GetMapping("/{id}")
    public Measure getMeasureById(@PathVariable Long id) {
        return measureService.getMeasureById(id);
    }

    @PostMapping
    public Measure addMeasure(@RequestBody Measure measure) {
        return measureService.addMeasure(measure);
    }

    @PutMapping
    public Measure updateMeasure(@RequestBody Measure measure) {
        return measureService.updateMeasure(measure);
    }

    @DeleteMapping("/{id}")
    public void deleteMeasure(@PathVariable Long id) {
        measureService.deleteMeasure(id);
    }
}
