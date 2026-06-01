package com.greetingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greetingApp.service.GreetingService;


//@Controller
@RestController
public class GreetingController {
	
	@Autowired
	private GreetingService greetingService;
	
	
//	@GetMapping("/greet")
//	public String greetMessage(Model model) {
//		model.addAttribute("message", "This Message is from Controller");
//		return "greet"; // This is an HTML Page inside templates.
//	}
	
	@GetMapping("/greet")
	public String greetMessage(){
		return greetingService.greetMessage();
	}
}
