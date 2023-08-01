package com.jega.model;

public class Movie {

	private Integer movieId;
	
	public Movie() {
		
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
	public Movie(Integer movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	private String movieName;

}
