package com.jega.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jega.model.Movie;
import com.jega.model.MovieCumRating;
import com.jega.model.PostSuccess;


@Component
public class Service {

	@Autowired
	RestTemplate restTemplate;
	public List<MovieCumRating> getResult(Integer userId){
		PostSuccess[] arr=restTemplate.getForObject("http://ratings-service/ratings/"+userId, PostSuccess[].class);
		List<PostSuccess> lst=Arrays.asList(arr);
		List<MovieCumRating> result=new ArrayList<>();
		lst.forEach(rating->{
			Movie m=restTemplate.getForObject("http://movie-service/movieinfo/"+rating.getMovieId(), Movie.class);
			result.add(new MovieCumRating(rating.getMovieId(),m.getMovieName(),rating.getRating()));
		});
		return result;
	}
}
/*private Integer movieId;
	private String movieName;
	private Integer rating;
	private String desc;*/