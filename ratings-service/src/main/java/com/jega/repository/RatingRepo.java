package com.jega.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jega.entity.Rating;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Integer> {

	List<Rating> findByUserId(Integer id);
}
