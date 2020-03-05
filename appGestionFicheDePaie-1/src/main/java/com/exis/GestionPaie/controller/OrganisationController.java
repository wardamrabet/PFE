package com.exis.GestionPaie.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exis.GestionPaie.entities.Organisation;
import com.exis.GestionPaie.repositories.IOrganisationDao;



@Controller
public class OrganisationController {
	@Autowired
	private IOrganisationDao organisationRepository;
	
	
	//Ajouter Une organisation
	@RequestMapping("organisation/add")
	public String addOrganisation(Model model) {
		model.addAttribute("marque", new Organisation());
		return "AddOrganisation";
	}
	@RequestMapping(value="organisation/save", method=RequestMethod.POST)
	public String saveOrganisation(@Valid @ModelAttribute Organisation organisation, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "AddOrganisation";
			}
		organisationRepository.save(organisation);
		return "redirect:/organisation/list";
		}
	
	
	//Lister les organisation
	@RequestMapping(value="/organisation/list")
	public String listOrganisation(Model model,@RequestParam(name = "r",defaultValue = "")String r) {
		model.addAttribute("organisation",organisationRepository.chercherParNom("%"+r+"%"));
		return "ListOrganisation";
	}
	
	
	//Supprimer une organisation
	@RequestMapping(value="/organisation/delete",method=RequestMethod.GET)
	public String deleteOrganisation(Organisation o, Long num) {
		organisationRepository.deleteById(num);
		return "redirect:/organisation/list";
	}
	
	
	//Modifier une organisation
	@RequestMapping("/organisation/update")
	public String modOrganisation(Model model, Long num) {
		Organisation o = organisationRepository.findById(num).get();
		model.addAttribute("organisation",o);
		return "UpdateOrganisation";
	}
	@RequestMapping(value="/organisation/modifier",method=RequestMethod.POST)
	public String updateOrganisation(@Valid @ModelAttribute Organisation o, Long num, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "UpdateOrganisation";
		}
		o.setPkOrganisationID(num);
		organisationRepository.save(o);
		return "redirect:/organisation/list";
	}
	
}
