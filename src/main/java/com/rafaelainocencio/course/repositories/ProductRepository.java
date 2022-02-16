package com.rafaelainocencio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelainocencio.course.entities.Category;
import com.rafaelainocencio.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>   {
	
}
