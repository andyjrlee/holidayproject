package com.natwest.demo.holidayproject.service;

import org.springframework.stereotype.Service;

import com.natwest.demo.holidayproject.repo.CitiesRepo;

@Service
public class CitiesService {
	
	private CitiesRepo repo;
	
	public CitiesService(CitiesRepo repo) {
		this.repo = repo;
	}
	

}
