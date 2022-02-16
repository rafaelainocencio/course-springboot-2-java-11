package com.rafaelainocencio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelainocencio.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>   {
	
}
