package com.exis.GestionPaie.service;

import java.util.List;

import com.exis.GestionPaie.entities.Departement;



public interface IDepartement {

	public void addDepartement(Departement departement);

	public Departement getDepartementByName(String DepartementName);

	public List<Departement> getallDepartement();

	public Departement getDepartementById(long pkDepartementID);

}
