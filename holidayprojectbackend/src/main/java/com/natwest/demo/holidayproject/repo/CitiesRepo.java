package com.natwest.demo.holidayproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.demo.holidayproject.domain.Cities;

@Repository
public interface CitiesRepo extends JpaRepository<Cities, Long>{

}
