package com.exis.GestionPaie.service;

import java.util.List;

import com.exis.GestionPaie.entities.Contact;



public interface IContactServices {

	public boolean addContact(Contact contact);

	public void removeContactByid(long id);

	public Contact getContactById(long id);

	public List<Contact> getAllContacts();
}
