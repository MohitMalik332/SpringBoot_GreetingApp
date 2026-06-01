package com.greetingApp.service;

import org.springframework.stereotype.Service;


@Service
public class GreetingService {
	
	public String greetMessage() {
		return "This is Greeting Message from Service to the Controller";
	}
}
