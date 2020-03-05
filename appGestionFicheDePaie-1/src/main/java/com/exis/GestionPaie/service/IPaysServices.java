package com.exis.GestionPaie.service;

import java.util.List;

import com.exis.GestionPaie.entities.Pays;


public interface IPaysServices {

	public void addPays(Pays pays);

	public Pays getPaysByName(String cca2);

	public List<Pays> getAllPays();

}
