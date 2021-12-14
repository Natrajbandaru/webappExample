package com.javatechie.jenkin.api.cantroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cantroller {
	
	@GetMapping("webappExample/")
	public String app() {
		
		return "welcome to KK tutorials";
	}
	
	

}
