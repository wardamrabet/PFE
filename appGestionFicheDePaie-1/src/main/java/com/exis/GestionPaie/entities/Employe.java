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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Employe")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkEmployeID")
public class Employe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6123703288245602356L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkEmployeID")
	private long pkEmployeID;
	
	
	@Column(name = "Matricule")
	private String Matricule;
	
	
	
	///with contact
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Contact contact;
	///with department
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pkDepartementID")
	private Departement Departement;
	//with user
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private User user;
	//with Bulttain
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Employe")
	private List<BulletinPaiement> bulletinPaiement;
	
	
	
	
	
	
	
	
	public long getPkEmployeID() {
		return pkEmployeID;
	}
	public void setPkEmployeID(long pkEmployeID) {
		this.pkEmployeID = pkEmployeID;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public Departement getDepartement() {
		return Departement;
	}
	public void setDepartement(Departement departement) {
		Departement = departement;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<BulletinPaiement> getBulletinPaiement() {
		return bulletinPaiement;
	}
	public void setBulletinPaiement(List<BulletinPaiement> bulletinPaiement) {
		this.bulletinPaiement = bulletinPaiement;
	}

	public String getMatricule() {
		return Matricule;
	}
	public void setMatricule(String matricule) {
		Matricule = matricule;
	}
}
