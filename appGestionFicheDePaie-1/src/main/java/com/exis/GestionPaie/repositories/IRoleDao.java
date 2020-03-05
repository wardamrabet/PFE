package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.Role;


public interface IRoleDao extends JpaRepository<Role, Integer> {

	@Query("select role from Role role where role.id  like :id")
	public Role getRoleById(@Param("id") long id);

	@Query("select role from Role role where role.name  like :name")
	public Role getRoleByName(@Param("name") String name);

}
