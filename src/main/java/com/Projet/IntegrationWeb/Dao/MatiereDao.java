package com.Projet.IntegrationWeb.Dao;

import com.Projet.IntegrationWeb.Model.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereDao extends JpaRepository<Matiere, Integer> {
}
