package com.exis.GestionPaie.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Organisation")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkOrganisationID")
public class Organisation implements Serializable {

	private static final long serialVersionUID = -4672774270950713417L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkOrganisationID")
	private long pkOrganisationID;

	@Column(name = "OrganisationName")
	private String OrganisationName;

	/// with departement
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organisation")
	private List<Departement> departement;
	/// with Contact

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Contact contact;
	/// with Pays

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Pays paysOrganisation;

	//with PAttern
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Pattern pattern;
	
	
	
	
	public Organisation() {
	}

	public long getPkOrganisationID() {
		return pkOrganisationID;
	}

	public void setPkOrganisationID(long pkOrganisationID) {
		this.pkOrganisationID = pkOrganisationID;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getOrganisationName() {
		return OrganisationName;
	}

	public void setOrganisationName(String organisationName) {
		OrganisationName = organisationName;
	}

	public List<Departement> getDepartement() {
		return departement;
	}

	public void setDepartement(List<Departement> departement) {
		this.departement = departement;
	}

	public Pays getPaysOrganisation() {
		return paysOrganisation;
	}

	public void setPaysOrganisation(Pays paysOrganisation) {
		this.paysOrganisation = paysOrganisation;
	}

	public Pattern getPattern() {
		return pattern;
	}

	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}

}
