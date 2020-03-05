package com.exis.GestionPaie.service;

import java.util.List;

import com.exis.GestionPaie.entities.Organisation;


public interface IOrganisationServices {

	public void addOrganisation(Organisation organisation);

	public void removeOrganisationByid(long id);

	public Organisation getOrganisationByName(String OrganisationName);

	public List<Organisation> getallorganisation();

	public Organisation getOrganisationById(long pkOrganisationID);

	void SaveOrUpdateOrganisation(Organisation organisation);



}
