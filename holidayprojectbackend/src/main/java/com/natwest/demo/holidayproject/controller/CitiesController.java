package com.natwest.demo.holidayproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.demo.holidayproject.domain.Cities;
import com.natwest.demo.holidayproject.service.CitiesService;

@RestController 
@RequestMapping("/cities") // http://localhost:9002/cities/..
public class CitiesController {
	
	@Autowired
	private CitiesService service;
	
	@GetMapping("/test")
	public String testRequest() {
		return "This is our test api..!";
	}
	
	// create
	@PostMapping("/create")
	public ResponseEntity<Cities> create(@RequestBody Cities cities ) {
		return new ResponseEntity<Cities>(this.service.create(cities), HttpStatus.CREATED);
	}
	
	//read
	@GetMapping("/read")
	public ResponseEntity<List<Cities>> read() {
		return new ResponseEntity<List<Cities>>(this.service.read(), HttpStatus.OK);
	}
	
	//read id
	@GetMapping("/read/{id}")
	public ResponseEntity<Cities> readById(@PathVariable Long id) {
		return new ResponseEntity<Cities>(this.service.readById(id), HttpStatus.OK);
		
	}
	
	//update	
	@PutMapping("/update/{id}")
	public ResponseEntity<Cities> update(@PathVariable Long id, @RequestBody Cities cities) {
		return new ResponseEntity<Cities>(this.service.update(id, cities), HttpStatus.ACCEPTED);
	}
	
	//delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id){
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}
	
	// Find by name
	@GetMapping("/readName/{name}")
	public ResponseEntity<List<Cities>> findByName(@PathVariable String name){
		return new ResponseEntity<List<Cities>>(this.service.readByName(name), HttpStatus.OK);
	}
}


}
