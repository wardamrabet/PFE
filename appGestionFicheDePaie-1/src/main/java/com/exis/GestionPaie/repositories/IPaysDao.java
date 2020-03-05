package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Pays;



public interface IPaysDao  extends JpaRepository<Pays, Long> {
@Query("select p from Pays p where p.cca3 like :cca3")
	public Pays findByCode(@Param("cca3") String code);

}
