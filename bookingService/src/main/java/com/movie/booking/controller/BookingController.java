package com.movie.booking.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/booking")
public class BookingController {

	
	@GetMapping
	@Produces({"application/xml", "application/json"})
	public List<String> booking() {
		RestTemplate restTemplate = new RestTemplate();
		String[] movieList = restTemplate.getForObject("http://localhost:8082"+"/movie",String[].class);
		return	Arrays.asList(movieList);
	}
}
