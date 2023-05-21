package com.core.projects.blogger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.core.projects.blogger.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	

}
