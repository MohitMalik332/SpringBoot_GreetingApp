package com.greetingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
	
	@GetMapping("/greet")
	public String greetMessage(Model model) {
		model.addAttribute("message", "This Message is from Controller");
		return "greet"; // This is an HTML Page inside templates.
	}
}
