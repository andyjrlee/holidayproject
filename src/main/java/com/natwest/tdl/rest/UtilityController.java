package com.natwest.tdl.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class UtilityController {
	
	@GetMapping("/cities")
	public String home() {
		return "home";
	}

}
