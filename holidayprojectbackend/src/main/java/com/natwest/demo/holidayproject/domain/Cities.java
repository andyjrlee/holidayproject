package com.natwest.demo.holidayproject.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "City")
	private String city;
    private String region;
    private String country;
    private int population;
    private String recommendedHotel; 
    private double hotelPrice;
    
    public Cities() {
		super();
	}

	public Cities(long id, String city, String region, String country, int population, String recommendedHotel,
			double hotelPrice) {
		super();
		this.id = id;
		this.city = city;
		this.region = region;
		this.country = country;
		this.population = population;
		this.recommendedHotel = recommendedHotel;
		this.hotelPrice = hotelPrice;
	}


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

	private long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	private String getRecommendedHotel() {
		return recommendedHotel;
	}

	private void setRecommendedHotel(String recommendedHotel) {
		this.recommendedHotel = recommendedHotel;
	}

	private double getHotelPrice() {
		return hotelPrice;
	}

	private void setHotelPrice(double hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, country, hotelPrice, id, population, recommendedHotel, region);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cities other = (Cities) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Double.doubleToLongBits(hotelPrice) == Double.doubleToLongBits(other.hotelPrice) && id == other.id
				&& population == other.population && Objects.equals(recommendedHotel, other.recommendedHotel)
				&& Objects.equals(region, other.region);
	}
    
    

}
