package com.natwest.tdl.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.natwest.tdl.persistence.domain.Cities;
import com.natwest.tdl.persistence.repos.CitiesRepo;

@Service
public class CitiesService {
	
	private CitiesRepo repo;
	
	public CitiesService(CitiesRepo repo) {
		this.repo = repo;
	}
	
	// create
		public Cities create(Cities cities) {
			return this.repo.saveAndFlush(cities);
		}

		// read
		public List<Cities> read() {
			return this.repo.findAll();
		}

		// read id
		public Cities readById(Long id) {
			final Cities FOUND = this.repo.findById(id).orElseThrow(() -> {
				return new ResponseStatusException(HttpStatus.NOT_FOUND,
						String.format("No City found with id: %d ", id));

			});
			return FOUND;

		}

		// update
		public Cities update(Long id, Cities cities) {
			Cities existing = this.repo.getById(id);
			existing.setCity(cities.getCity());
			existing.setRegion(cities.getRegion());
			existing.setCountry(cities.getCountry());
			existing.setPopulation(cities.getPopulation());
			Cities updated = this.repo.save(existing);
			return updated;

		}

		// Delete
		public Boolean delete(Long id) {
			this.repo.deleteById(id);
			return this.repo.existsById(id);
		}

		// Find by name
		public List<Cities> readByName(String name) { 
			return this.repo.findByName(name);
		}
	}
