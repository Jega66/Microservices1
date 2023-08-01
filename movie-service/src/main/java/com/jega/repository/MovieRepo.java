package com.jega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jega.entity.Movie;

@Repository 

public interface MovieRepo extends JpaRepository<Movie,Integer> {

}
