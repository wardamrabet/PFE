package com.exis.GestionPaie.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Pattern")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pkPatternID")
public class Pattern implements Serializable {

	private static final long serialVersionUID = -4672774270950713417L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pkPatternID")
	private long pkPatternID;
	
	@Column(name = "patMatricule")
	private String patMatricule;
	
	@Column(name = "patDate")
	private String patDate;
	
	@Column(name = "patPayrollHeader")
	private String patPayrollHeader;
	
	@Column(name = "NetAPayer")
	private String NetAPayer;
	
	@JsonIgnore
	@OneToOne(mappedBy = "pattern")
	private Organisation organisation;
      public Pattern() {
		
	}
	public long getPkPatternID() {
		return pkPatternID;
	}

	public void setPkPatternID(long pkPatternID) {
		this.pkPatternID = pkPatternID;
	}

	public String getPatMatricule() {
		return patMatricule;
	}

	public void setPatMatricule(String patMatricule) {
		this.patMatricule = patMatricule;
	}

	public String getPatDate() {
		return patDate;
	}

	public void setPatDate(String patDate) {
		this.patDate = patDate;
	}

	public String getPatPayrollHeader() {
		return patPayrollHeader;
	}

	public void setPatPayrollHeader(String patPayrollHeader) {
		this.patPayrollHeader = patPayrollHeader;
	}

	public Organisation getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Organisation organisation) {
		this.organisation = organisation;
	}
	public String getNetAPayer() {
		return NetAPayer;
	}
	public void setNetAPayer(String netAPayer) {
		NetAPayer = netAPayer;
	}
	
	
	

}
