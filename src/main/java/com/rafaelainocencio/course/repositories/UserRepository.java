package com.rafaelainocencio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelainocencio.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>   {
	
}
