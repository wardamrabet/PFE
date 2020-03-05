package com.exis.GestionPaie.entities;

public class UploadResponse {

	private String Matricule;
	private String Date;
	private String NetAPayer;
	private String URL;
	private String fileName;

	public String getMatricule() {
		return Matricule;
	}

	public void setMatricule(String matricule) {
		Matricule = matricule;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getNetAPayer() {
		return NetAPayer;
	}

	public void setNetAPayer(String netAPayer) {
		NetAPayer = netAPayer;
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
