package com.jega.model;

public class MovieCumRating {
	private Integer movieId;
	private String movieName;
	private Integer rating;
	

	public MovieCumRating(Integer movieId, String movieName, Integer rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
		
	}

	public MovieCumRating() {

	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	
}
