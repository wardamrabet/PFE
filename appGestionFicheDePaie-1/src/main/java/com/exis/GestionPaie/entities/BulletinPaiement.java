package com.exis.GestionPaie.entities;

import java.io.Serializable;

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
import javax.persistence.Table;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


	@Entity
	@Table(name = "BulletinPaiement")
	@Inheritance(strategy = InheritanceType.JOINED)
	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkBulletinPaiementID")
	public class BulletinPaiement  implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -6123703288245602356L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "pkBulletinPaiementID")
		private long pkBulletinPaiementID;
		
		@Column(name = "mois")
		private String mois;
		
		@Column(name = "annee")
		private String annee;
		
		@Column(name = "netaPayer")
		private String netaPayer;
		
		@Column(name = "matricule")
		private String matricule;
		@Column(name = "URL")
		private String URL;
		
		
		@Column(name = "fileName")
		private String fileName;
		
		
		
		
		
		
		
		
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "pkEmployeID")
		private Employe Employe;

		public long getPkBulletinPaiementID() {
			return pkBulletinPaiementID;
		}

		public void setPkBulletinPaiementID(long pkBulletinPaiementID) {
			this.pkBulletinPaiementID = pkBulletinPaiementID;
		}


		public Employe getEmploye() {
			return Employe;
		}

		public void setEmploye(Employe employe) {
			Employe = employe;
		}

		public String getMois() {
			return mois;
		}

		public void setMois(String mois) {
			this.mois = mois;
		}

		public String getAnnee() {
			return annee;
		}

		public void setAnnee(String year) {
			this.annee = annee;
		}

		public String getNetaPayer() {
			return netaPayer;
		}

		public void setNetaPayer(String netaPayer) {
			this.netaPayer = netaPayer;
		}

		public String getMatricule() {
			return matricule;
		}

		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}

		public String getURL() {
			return URL;
		}

		public void setURL(String uRL) {
			URL = uRL;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}		
		

}
