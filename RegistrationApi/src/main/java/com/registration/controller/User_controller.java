package com.registration.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.entity.User_details;

@Controller
public class User_controller {

	

	@GetMapping("/")
	public String home() {
		return "index";
	}
	

	@PostMapping("/registration")
	public String registration(@ModelAttribute User_details user_details) {
		
		System.out.println(user_details);
		return "redirect:/ ";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

 }
