"use strict";

const api_cities4 = 'http://127.0.0.1:8080/cities/read/4'
    async function getCity4() {
        const response = await fetch(api_cities4);
        const data = await response.json();
        const { city, region, country, population } = data;

        document.getElementById('city4').textContent = city;
        document.getElementById('region4').textContent = region;
        document.getElementById('country4').textContent = country;
        document.getElementById('population4').textContent = population;
        
        console.log(city);
        console.log(region);
        console.log(country);
        console.log(population);
    }
    getCity4();