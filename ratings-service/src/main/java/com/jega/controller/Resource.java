package com.jega.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jega.entity.PostSuccess;
import com.jega.entity.Rating;
import com.jega.repository.RatingRepo;

@RestController
@RequestMapping("/ratings")
public class Resource {
	
	@Autowired
	RatingRepo ratingRepo;
	
	@GetMapping("/{id}")
	public List<PostSuccess> getRatings(@PathVariable("id") Integer userId){
		List<Rating> lst= ratingRepo.findByUserId(userId);
		return lst.stream().map(rating->new PostSuccess(rating.getMovieid(),rating.getOneToFive())).collect(Collectors.toList());
	}
 
}
