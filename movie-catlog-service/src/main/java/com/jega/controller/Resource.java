package com.jega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jega.model.MovieCumRating;
import com.jega.service.Service;

@RestController
@RequestMapping("/movieCatalog")
public class Resource {
	@Autowired
	Service service;

	@GetMapping("/{id}")
	public List<MovieCumRating> getInfo(@PathVariable("id") Integer userId){
		return service.getResult(userId);
	}
}
