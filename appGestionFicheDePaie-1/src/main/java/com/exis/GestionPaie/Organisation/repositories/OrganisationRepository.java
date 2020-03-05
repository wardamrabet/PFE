package com.exis.GestionPaie.Organisation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Organisation;


public interface OrganisationRepository extends JpaRepository<Organisation, Long>{
	
	@Query("SELECT r FROM Organisation r where r.nom_organisation like :x")
	public Organisation chercherParNom (@Param("x")String nom_organisation);
	
	@Query("SELECT r FROM Organisation r where r.IdOrganisation like :id")
	public Organisation chercheId (@Param("id")Long id);
	}