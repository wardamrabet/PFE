package com.exis.GestionPaie.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.exis.GestionPaie.users.user.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT r FROM User r where r.Nom like :x")
	public User chercherParNom (@Param("x")String Nom);
	
	@Query("SELECT r FROM User r where r.IdUser like :id")
	public User chercheId (@Param("id")Long id);
	}