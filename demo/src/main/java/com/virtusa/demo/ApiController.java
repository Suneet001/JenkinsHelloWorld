package com.virtusa.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;




public class ApiController {

	// communicate to other
	@Autowired
	RestTemplate restTemplate;
	
	public  void userResponse() {
	  String baseUrl="http://localhost:8080/virtusa/178987";
	  RestTemplate restTemplate = new RestTemplate();
	     
	//  final String baseUrl = "http://localhost:" + randomServerPort + "/employees";
	  URI uri = null;
	try {
		uri = new URI(baseUrl);
	} catch (URISyntaxException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	  ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	       
	  //Verify request succeed
	  
		System.out.println("apiResponse :: "+result);
	}
	
}
