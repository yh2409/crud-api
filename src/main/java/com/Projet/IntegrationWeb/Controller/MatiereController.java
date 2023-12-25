package com.Projet.IntegrationWeb.Controller;

import com.Projet.IntegrationWeb.Model.Matiere;
import com.Projet.IntegrationWeb.Service.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matiere")
public class MatiereController {
    @Autowired
    private MatiereService matiereService;

    @GetMapping("/all")
    public List<Matiere> getAllMatieres() {
        return matiereService.getAllMatieres();
    }

    @PostMapping("/add")
    public Matiere addMatiere(@RequestBody Matiere matiere) {
        return matiereService.addMatiere(matiere);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMatiere(@PathVariable("id") int id) {
        matiereService.deleteMatiereById(id);
    }

    @PutMapping("/update/{id}")
    public Matiere updateMatiere(@PathVariable("id") int id, @RequestBody Matiere updatedMatiere) {
        return matiereService.updateMatiere(id, updatedMatiere);
    }
}

