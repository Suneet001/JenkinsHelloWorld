package com.virtusa.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
	
	public String response="HELLOO VIRTUSA !!!";
	
	@GetMapping("/virtusa/{id}")
	public String getResponse(@PathVariable String id) {
				
		return response+id;
	}
	

}
