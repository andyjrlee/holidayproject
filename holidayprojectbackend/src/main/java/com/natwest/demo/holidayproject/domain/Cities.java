package com.natwest.demo.holidayproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Cities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String city;
    private String region;
    private String country;
    private int population;
    private String recommendedHotel; 
    private double hotelPrice;
	
    public Cities(String city, String region, String country, int population, String recommendedHotel,
			double hotelPrice) {
		super();
		this.city = city;
		this.region = region;
		this.country = country;
		this.population = population;
		this.recommendedHotel = recommendedHotel;
		this.hotelPrice = hotelPrice;
	}
    
    

}
