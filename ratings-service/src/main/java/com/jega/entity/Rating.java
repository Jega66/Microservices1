package com.jega.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer movieid;
	private Integer userId;
	private Integer oneToFive;
}
