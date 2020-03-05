package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Employe;

public interface IEmployeDao extends JpaRepository<Employe ,Long>{
	@Query("select employe From Employe employe where employe.Matricule like:Matricule")
	Employe findEmployeyByMatricule(@Param("Matricule")String Matricule);

}
