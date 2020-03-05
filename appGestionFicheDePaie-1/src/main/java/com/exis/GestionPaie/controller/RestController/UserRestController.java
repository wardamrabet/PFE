package com.exis.GestionPaie.controller.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exis.GestionPaie.entities.Organisation;
import com.exis.GestionPaie.repositories.OrganisationRepository;
import com.exis.GestionPaie.repositories.UserRepository;
import com.exis.GestionPaie.users.user.User;

@RestController
public class UserRestController {
	
	@Autowired
	private UserRepository userDAO;
	
		//ADD
		@PostMapping("/addUser")
		public User addUser(@RequestBody User user) {
			User us = userDAO.save(user);
			return us;
		}
		
		//LIST ALL
		@GetMapping("/listUser")
		public List<User> listUsers() {
			return userDAO.findAll();
		}
		
		//UPDATE
		@PostMapping("/updateUser")
		public User updateUser(@RequestBody User user) {
			 User us = userDAO.chercheId(user.getIdUser()); 
			if (us!=null) {
				us.setEtat(user.getEtat());
				userDAO.save(us);
				return us;
			}else {
				User u = userDAO.save(user);
				return u;
			}
		}
			
		//DELETE
		@DeleteMapping("/deleteUser/{idUser}")
		public String deleteOrganisation(@PathVariable(name="idUser") Long id) {
			userDAO.deleteById(id);
			return "SUCCESS";
		}
			
			
			
			
			
}
