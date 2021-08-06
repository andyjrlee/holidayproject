fetch('http://localhost:9002/cities/read')
.then((response) => {
    if (response.status !== 200) {
        console.log(`Looks like there was a problem.Status Code: ${ response.status }`);
        return;
    }
response.json()
.then(data => console.log(data));         
})
.catch(err => console.error(`Fetch Error :-S ${err}`));
