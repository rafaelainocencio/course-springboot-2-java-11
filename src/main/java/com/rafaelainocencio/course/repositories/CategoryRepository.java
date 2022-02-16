package com.rafaelainocencio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelainocencio.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>   {
	
}
