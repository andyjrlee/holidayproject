"use strict";

const api_cities = 'http://holidayproject.ce3qdigthphh.eu-west-1.rds.amazonaws.com:8080/cities/read/1'
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

// fetch('http://127.0.0.1:8080/cities/read')
// .then((response) => {
//     if (response.status !== 200) {
//         console.log(`Looks like there was a problem.Status Code: ${ response.status }`);
//         return;
//     }
// response.json()
// .then(data => console.log(data));         
// })
// .catch(err => console.error(`Fetch Error :-S ${err}`));

// fetch("http://127.0.0.1:8080/cities/create", { //1
//     method: 'post', //2
//     headers: {
//       "Content-type": "application/json" //3
//     },
//     body: JSON.stringify( //4
//       {
//         "city": "Edinburgh",//5
//         "country": "UK",
//         "hotel_price": "Male",
//         "population": "400000",
//         "recommended_hotel": "McHotel",
//         "region": "East Scotland"
//       }
//     )
//   })
//   .then(res => res.json())
//   .then((data) => console.log(`Request succeeded with JSON response ${data}`))
//   .catch((error) => console.log(`Request failed ${error}`))
;

// document.getElementById('id').textContent = id;
// document.getElementById('email').textContent = email;

    // const api_url = 'https://api.wheretheiss.at/v1/satellites/25544'
    // id: <span id = "id"></span>
    // email: <span id = "email"></span>
   
    // const api_url = 'https://reqres.in/api/users?page=2'
    // async function getABC() {
    //     const response = await fetch(api_url);   
    //     const data = await response.json();
    //     const { id, email } = data;

    //     document.getElementById('id').textContent = id;
    //     document.getElementById('email').textContent = email;
        
    //     console.log(id);
    //     console.log(email)
    // }

    // getABC();