package com.natwest.demo.holidayproject.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.natwest.demo.holidayproject.domain.Cities;

@Repository
public interface CitiesRepo extends JpaRepository<Cities, Long>{
	
	// By standard convention, we use '?1' even when we have a single index (input parameter)
	// nativeQuery = true is 'Non-JPQL'
		@Query(value = "SELECT * FROM Cities WHERE first_name =?1", nativeQuery = true)
	List<Cities> findByName(String name);

}
