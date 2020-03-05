package com.exis.GestionPaie.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name = "organisation")
public class Organisation implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdOrganisation;
	
	@NotNull
	@Column (name="nom_organisation" , nullable =false)
	private String nom_organisation;
	
	public Organisation() {}
	public Organisation(Long IdOrganisation, String nom_organisation) {
		super();
		this.IdOrganisation = IdOrganisation;
		this.nom_organisation = nom_organisation;
	}


	public Long getIdOrganisation() {
		return IdOrganisation;
	}

	public void setIdOrganisation(Long IdOrganisation) {
		this.IdOrganisation = IdOrganisation;
	}

	public String getNom_organisation() {
		return nom_organisation;
	}

	public void setNom_organisation(String nom_organisation) {
		this.nom_organisation = nom_organisation;
	}

	
}
