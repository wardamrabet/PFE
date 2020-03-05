package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Pattern;


public interface IPatternDao extends JpaRepository<Pattern, Long>{

	@Query("select pattern From Pattern pattern where pattern.organisation.OrganisationName like:OrganisationName")
	Pattern findPatternByORganisation(@Param("OrganisationName") String OrganisationName);

}
