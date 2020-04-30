package com.movie.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/movie")
public class MovieController {
	
	@GetMapping
	@Produces({"application/xml", "application/json"})
	public List<String> getAllMovies() {
		List<String> movieList = Arrays.asList("Black","Dus Kahaniya","World War","Avengers");
		return movieList;
	}
}
