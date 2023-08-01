package com.jega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jega.entity.Movie;
import com.jega.repository.MovieRepo;

@RestController
@RequestMapping("/movieinfo")
public class Resource {

	@Autowired 
	MovieRepo movieRepo;
	
	@GetMapping("/{id}")
	public Movie getMovieInfo(@PathVariable("id") Integer id) {
		return movieRepo.findById(id).get();
	}
}
