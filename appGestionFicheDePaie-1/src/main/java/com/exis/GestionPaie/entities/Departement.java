package com.exis.GestionPaie.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Departement")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkDepartementID")
public class Departement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6123703288245602356L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkDepartementID")
	private long pkDepartementID;

	@Column(name = "DepartementName")
	private String DepartementName;

	

	
	
	@JsonIgnore
	///// with Organisation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pkOrganisationID")
	private Organisation organisation;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Departement")
	private List<Employe> employe;
	

	public Departement() {

	}



	public long getPkDepartementID() {
		return pkDepartementID;
	}



	public void setPkDepartementID(long pkDepartementID) {
		this.pkDepartementID = pkDepartementID;
	}



	public String getDepartementName() {
		return DepartementName;
	}



	public void setDepartementName(String departementName) {
		DepartementName = departementName;
	}



	public Organisation getOrganisation() {
		return organisation;
	}



	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}

	

}
