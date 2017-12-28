package com.micros.feing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micros.feing.client.GreetingClient;

@RestController
public class MainController {
	@Autowired
	GreetingClient greetingClient;

	@RequestMapping(value = "get-greeting", method = RequestMethod.GET)
	public String getGreeting() {

		return greetingClient.greeting();
	}

}
