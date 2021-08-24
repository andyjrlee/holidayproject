"use strict";

const api_cities3 = 'http://127.0.0.1:8080/cities/read/3'
    async function getCity3() {
        const response = await fetch(api_cities3);
        const data = await response.json();
        const { city, region, country, population } = data;

        document.getElementById('city3').textContent = city;
        document.getElementById('region3').textContent = region;
        document.getElementById('country3').textContent = country;
        document.getElementById('population3').textContent = population;
        
        console.log(city);
        console.log(region);
        console.log(country);
        console.log(population);
    }
    getCity3();