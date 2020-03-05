package com.exis.GestionPaie.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "contact")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkcontactID")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6123703288245602356L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkcontactID")
	private long pkcontactID;

	@Column(name = "Prenom")
	private String Prenom;

	@Column(name = "CIN")
	private String CIN;

	@Column(name = "nom")
	private String nom;

	@Column(name = "email")
	private String email;

	@Column(name = "sexe")
	private String sexe;

	@Column(name = "adresse")
	private String adresse;

	@Column(name = "profession")
	private String profession;

	@Column(name = "age")
	private String age;

	@Column(name = "phoneNumber")
	private String PhoneNumber;

	@Column(name = "dateDeNaissence")
	private String dateDeNaissence;
	/// with pays
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "pkPaysID")
	private Pays paysContact;
	//// with Doctors:
	
//// with organisation
	@JsonIgnore
	@OneToOne(mappedBy = "contact")
	private Organisation organisation;
	
	@JsonIgnore
	@OneToOne(mappedBy = "contact")
	private Employe employe;
	
	public Contact() {

	}



	public long getPkcontactID() {
		return pkcontactID;
	}

	public void setPkcontactID(long pkcontactID) {
		this.pkcontactID = pkcontactID;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDateDeNaissence() {
		return dateDeNaissence;
	}

	public void setDateDeNaissence(String dateDeNaissence) {
		this.dateDeNaissence = dateDeNaissence;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}

	

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}



	public Pays getPaysContact() {
		return paysContact;
	}



	public void setPaysContact(Pays paysContact) {
		this.paysContact = paysContact;
	}



	public Organisation getOrganisation() {
		return organisation;
	}



	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}



	public Employe getEmploye() {
		return employe;
	}



	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
