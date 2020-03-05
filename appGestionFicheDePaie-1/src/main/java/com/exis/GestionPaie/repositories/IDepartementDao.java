package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Departement;


public interface IDepartementDao extends JpaRepository<Departement ,Long>{
	@Query("select departement From Departement departement where departement.DepartementName like:DepartementName")
	Departement findDepartementByNAme(@Param("DepartementName") String DepartementName);
	
	
	@Query("select departement From Departement departement where departement.pkDepartementID like:pkDepartementID")
	Departement findDepartementByID(@Param("pkDepartementID")long pkDepartementID);
	
	

}
