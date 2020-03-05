package com.exis.GestionPaie.service;

import java.util.List;

import com.exis.GestionPaie.entities.Role;

public interface IRolesServices {
	public List<Role> getall();

	public Role findById(int id);

	public Role save(Role Role);

	public void delete(int id);

}
