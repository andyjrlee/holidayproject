"use strict"
const api_cities = 'http://127.0.0.1:8080/cities/read/1'
    async function getCity() {
        const response = await fetch(api_cities);
        const data = await response.json();
        const { city, region, country, population } = data;

        document.getElementById('city').textContent = city;
        document.getElementById('region').textContent = region;
        document.getElementById('country').textContent = country;
        document.getElementById('population').textContent = population;
        
        console.log(city);
        console.log(region);
        console.log(country);
        console.log(population);
    }

    getCity();