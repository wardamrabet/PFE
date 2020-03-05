package com.exis.GestionPaie.controller.Organisation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exis.GestionPaie.Organisation.repositories.OrganisationRepository;
import com.exis.GestionPaie.entities.Organisation;

@RestController
public class OrganisationRestController {
	
	@Autowired
	private OrganisationRepository organisationDAO;
	
		//ADD
		@PostMapping("/addOrganisation")
		public Organisation addOrganisation(@RequestBody Organisation organisation) {
			Organisation org = organisationDAO.save(organisation);
			return org;
		}
		
		//LIST ALL
		@GetMapping("/listOrganisation")
		public List<Organisation> listOrganisations() {
			return organisationDAO.findAll();
		}
		
		//UPDATE
		@PostMapping("/updateOrganisation")
		public Organisation updateOrganisation(@RequestBody Organisation organisation) {
			 Organisation org = organisationDAO.chercheId(organisation.getIdOrganisation()); 
			if (org!=null) {
				org.setNom_organisation(organisation.getNom_organisation());
				organisationDAO.save(org);
				return org;
			}else {
				Organisation or = organisationDAO.save(organisation);
				return or;
			}
		}
			
		//DELETE
		@DeleteMapping("/deleteOrganisation/{idOrganisation}")
		public String deleteOrganisation(@PathVariable(name="idOrganisation") Long id) {
			organisationDAO.deleteById(id);
			return "SUCCESS";
		}
			
			
			
			
			
}
