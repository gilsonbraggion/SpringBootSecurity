package com.gilsonbraggion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = { "/", "/home" })
	public String home() {
		return "home";
	}

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	@GetMapping(value = "/principal")
	public String principal() {
		return "/logged/principal";
	}

	@GetMapping(value = "/admin")
	public String admin() {
		return "/admin/admin";
	}
	
	@GetMapping(value = "/user")
	public String user() {
		return "/user/user";
	}
	
	@GetMapping(value = "/general")
	public String general() {
		return "/general/general";
	}
	
}
