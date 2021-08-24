"use strict";

const api_cities5 = 'http://127.0.0.1:8080/cities/read/5'
    async function getCity5() {
        const response = await fetch(api_cities5);
        const data = await response.json();
        const { city, region, country, population } = data;

        document.getElementById('city5').textContent = city;
        document.getElementById('region5').textContent = region;
        document.getElementById('country5').textContent = country;
        document.getElementById('population5').textContent = population;
        
        console.log(city);
        console.log(region);
        console.log(country);
        console.log(population);
    }
    getCity5();