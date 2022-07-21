package com.registration.controller;





import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.entity.User_details;
import com.registration.repository.User_repository;


@Controller
public class User_controller {

	
	@Autowired
	private User_repository user_repository;

	@GetMapping("/")
	public String register() {
		return "index";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute User_details user_details , HttpSession registration_session) {
		
		System.out.println(user_details);
		user_repository.save(user_details);
		registration_session.setAttribute("message","User Register Sucessfully...");
		return "redirect:/login ";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
		

 }
