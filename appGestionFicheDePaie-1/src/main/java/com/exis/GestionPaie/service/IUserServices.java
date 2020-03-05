package com.exis.GestionPaie.service;

import com.exis.GestionPaie.entities.User;

public interface IUserServices {
	public User findUserByUserName(String username);

	public User save(User user);

}
