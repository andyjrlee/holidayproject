package com.natwest.demo.holidayproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class UtilityController {
	
	@GetMapping("/cities")
	public String home() {
		return "location";
	}

}
