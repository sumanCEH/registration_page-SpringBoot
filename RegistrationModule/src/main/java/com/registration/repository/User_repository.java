package com.registration.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
		

import com.registration.entity.User_details;

public interface User_repository extends JpaRepositoryImplementation <User_details,Integer> {

	}
