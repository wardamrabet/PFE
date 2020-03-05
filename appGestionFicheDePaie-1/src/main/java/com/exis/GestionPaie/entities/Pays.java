package com.exis.GestionPaie.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Pays")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkPaysID")
public class Pays implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6123703288245602356L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkPaysID")
	private long pkPaysID;

	@Column(name = "cca2")
	private String cca2;
	@Column(name = "cca3")
	private String cca3;

	@Column(name = "capital")
	private String capital;

	@Column(name = "subregion")
	private String subregion;

	@Column(name = "NomEng")
	private String NomEng;

	@Column(name = "NomFr")
	private String NomFr;

	@Column(name = "lattitude")
	private float lattitude;
	@Column(name = "longitude")
	private float longitude;

	/// with ORganisation
	@OneToMany(mappedBy = "paysOrganisation")
	private List<Organisation> organisation;

	@OneToMany(mappedBy = "paysContact")
	private List<Contact> contact;

	public long getPkPaysID() {
		return pkPaysID;
	}

	public void setPkPaysID(long pkPaysID) {
		this.pkPaysID = pkPaysID;
	}

	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public String getNomEng() {
		return NomEng;
	}

	public void setNomEng(String nomEng) {
		NomEng = nomEng;
	}

	public String getNomFr() {
		return NomFr;
	}

	public void setNomFr(String nomFr) {
		NomFr = nomFr;
	}

	public float getLattitude() {
		return lattitude;
	}

	public void setLattitude(float lattitude) {
		this.lattitude = lattitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
//	public List<Organisation> getOrganisation() {
//		return organisation;
//	}
//	public void setOrganisation(List<Organisation> organisation) {
//		this.organisation = organisation;
//	}
//	

}
