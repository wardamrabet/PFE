package com.exis.GestionPaie.service;



import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.exis.GestionPaie.entities.Organisation;
import com.exis.GestionPaie.repositories.OrganisationRepository;

@Service
public class OrganisationService {

private  OrganisationRepository organisationRepository;
public OrganisationService(OrganisationRepository organisationRepository) {
	this.organisationRepository= organisationRepository;
}
public List <Organisation> findAll(){
	return organisationRepository.findAll();
}
public Optional<Organisation> findById(Long IdOrganisation){
	return organisationRepository.findById(IdOrganisation);	
}
public Organisation save (Organisation organisation) {
	return organisationRepository.save(organisation);
}
public void deleteById(Long id) {
	organisationRepository.deleteById(id);
}	
}
