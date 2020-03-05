package com.exis.GestionPaie.users.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exis.GestionPaie.users.repositories.UserRepository;
import com.exis.GestionPaie.users.user.User;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	
	//Ajouter Un utilisateur
	@RequestMapping("user/add")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "AddUser";
	}
	@RequestMapping(value="user/save", method=RequestMethod.POST)
	public String saveUser(@Valid @ModelAttribute User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "AddUser";
			}
		userRepository.save(user);
		return "redirect:/users/list";
		}
	
	
	//Lister les utilisateurs
	@RequestMapping(value="/users/list")
	public String listUser(Model model,@RequestParam(name = "r",defaultValue = "")String r) {
		model.addAttribute("user",userRepository.chercherParNom("%"+r+"%"));
		return "listUser";
	}
	
	
	//Supprimer un utilisateur 
	@RequestMapping(value="/user/delete",method=RequestMethod.GET)
	public String deleteUser(User u, Long num) {
		userRepository.deleteById(num);
		return "redirect:/users/list";
	}
	
	
	//Modifier un utilisateur
	@RequestMapping("/user/update")
	public String modUser(Model model, Long num) {
		User u = userRepository.findById(num).get();
		model.addAttribute("user",u);
		return "UpdateUser";
	}
	@RequestMapping(value="/user/modifier",method=RequestMethod.POST)
	public String updateUser(@Valid @ModelAttribute User u, Long num, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "UpdateUser";
		}
		u.setIdUser(num);
		userRepository.save(u);
		return "redirect:/user/list";
	}
	
}
