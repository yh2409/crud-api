package com.Projet.IntegrationWeb.Controller;

import com.Projet.IntegrationWeb.Model.Etudiant;
import com.Projet.IntegrationWeb.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Etudiant addNewEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.addEtudiant(etudiant);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteEtudiant(@PathVariable("id") int id) {
        etudiantService.deleteEtudiantById(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Etudiant updateEtudiant(@PathVariable("id") int id, @RequestBody Etudiant updatedEtudiant) {
        return etudiantService.updateEtudiant(id, updatedEtudiant);
    }
}

