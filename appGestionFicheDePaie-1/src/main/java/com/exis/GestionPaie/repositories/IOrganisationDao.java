package com.exis.GestionPaie.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Organisation;


public interface IOrganisationDao extends JpaRepository<Organisation, Long> {
	@Query("select organisation From Organisation organisation where organisation.OrganisationName like:OrganisationName")
	Organisation findOrganisationByNAme(@Param("OrganisationName") String OrganisationName);

	@Query("select organisation From Organisation organisation where organisation.pkOrganisationID like:pkOrganisationID")
	Organisation findOrganisationById(@Param("pkOrganisationID") long pkOrganisationID);

	@Query("select o.pkOrganisationID,o.OrganisationName From Organisation o ")
	List<Organisation> getAllOrganisation();

	
	@Query("SELECT r FROM Organisation r where r.pkOrganisationID like :id")
	public Organisation chercheId (@Param("id")Long id);
	
	@Query("SELECT r FROM Marque r where r.OrganisationName like :x")
	public Organisation chercherParNom (@Param("x")String OrganisationName);

	

}
