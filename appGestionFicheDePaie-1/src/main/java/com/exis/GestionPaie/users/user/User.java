package com.exis.GestionPaie.users.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long IdUser;
	
	@NotNull
	@Column (name="username" , nullable =false)
	private  String username;
	@NotNull
	@Column (name="password" , nullable =false)
	private String password;
	@NotNull
	@Column (name="Nom" , nullable =false)
	private String Nom;
	@NotNull
	@Column (name="Prenom" , nullable =false)
	private String Prenom;
	@NotNull
	@Column (name="Email" , nullable =false)
	private String email;
	@NotNull
	@Column (name="DateNaiss" , nullable =false)
	private String DateNaiss;
	@NotNull
	@Column (name="NumTel" , nullable =false)
	private String NumTel;
	@NotNull
	@Column (name="Photos" , nullable =false)
	private String Photos;
	@NotNull
	@Column (name="Etat" , nullable =false)
	private String Etat;
	@Column (name="Role" , nullable =false)
	private String Role;
	
	
	
	public User() {};
	public User(Long idUser, String username, String password, String nom, String prenom, String email,
			String dateNaiss, String numTel, String photos, String etat, String role) {
		super();
		IdUser = idUser;
		this.username = username;
		this.password = password;
		Nom = nom;
		Prenom = prenom;
		this.email = email;
		DateNaiss = dateNaiss;
		NumTel = numTel;
		Photos = photos;
		Etat = etat;
		Role = role;
	}
	public Long getIdUser() {
		return IdUser;
	}
	public void setIdUser(Long idUser) {
		IdUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateNaiss() {
		return DateNaiss;
	}
	public void setDateNaiss(String dateNaiss) {
		DateNaiss = dateNaiss;
	}
	public String getNumTel() {
		return NumTel;
	}
	public void setNumTel(String numTel) {
		NumTel = numTel;
	}
	public String getPhotos() {
		return Photos;
	}
	public void setPhotos(String photos) {
		Photos = photos;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	

}
