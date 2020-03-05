package com.exis.GestionPaie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exis.GestionPaie.entities.User;


public interface IUserDao  extends JpaRepository<User, Long>{

	@Query("select user from User user where user.username like :username")
	User findUserByUserName(@Param("username") String username);

	@Query("SELECT r FROM User r where r.id like :id")
	public User chercheId (@Param("id")Long id);
	
	@Query("SELECT r FROM Marque r where r.username like :x")
	public User chercherParNom (@Param("x")String username);

	

}
