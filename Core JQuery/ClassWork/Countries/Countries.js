$(document).ready(function() {
    
    let url = `https://restcountries.eu/rest/v2/all`;

    fetch(url)
    .then(function(response) {
        return response.json();
    })
    .then(function(countryDetails) {
        displayCountryDetails(countryDetails);
    })
    .catch(function(er) {
        console.log(er);
    });
   
    function displayCountryDetails(countryDetails){
        for (var countries in countryDetails) {

            if(countryDetails.hasOwnProperty(countries)) {

                let countryName = countryDetails[countries].name;
                let countryCapital = countryDetails[countries].capital;
                let countryFlag = countryDetails[countries].flag;

                $('.results').append(`<tr>
                    <td>${countryName}</td>  
                    <td>${countryCapital} </td> 
                    <td><img width="20%" height="20%" src=${countryFlag}></img></td>
                </tr>`);
            }
        }
    }    
});