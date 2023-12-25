package com.Projet.IntegrationWeb.Dao;

import com.Projet.IntegrationWeb.Model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudinatDao extends JpaRepository<Etudiant, Integer> {
}
