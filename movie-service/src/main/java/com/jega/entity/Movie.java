package com.jega.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer movieId;
	private String movieName;
	
}
