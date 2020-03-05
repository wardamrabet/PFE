package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Contact;


;

public interface IContactDao extends JpaRepository<Contact, Long> {

	@Query("select case when count(contct)> 0 then true else false end from Contact contact where lower(contact.email) like lower(:email)")
	boolean existsEmail(@Param("email") String email);

	@Query("select contact from Contact contact where contact.id like :pkcontactID")
	public Contact findContactById(@Param("pkcontactID") long id);

}
