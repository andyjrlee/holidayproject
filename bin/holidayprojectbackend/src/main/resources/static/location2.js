"use strict";

const api_cities2 = 'http://127.0.0.1:8080/cities/read/2'
    async function getCity2() {
        const response = await fetch(api_cities2);
        const data = await response.json();
        const { city, region, country, population } = data;

        document.getElementById('city2').textContent = city;
        document.getElementById('region2').textContent = region;
        document.getElementById('country2').textContent = country;
        document.getElementById('population2').textContent = population;
        
        console.log(city);
        console.log(region);
        console.log(country);
        console.log(population);
    }
    getCity2();