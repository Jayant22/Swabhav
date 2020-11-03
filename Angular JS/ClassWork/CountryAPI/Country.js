var countriesApp = angular.module('countryApiApp', []);

countriesApp.controller('countryApiController', function($scope, $http) {

$scope.countries =[];

$http({
method: 'get',
url: 'https://restcountries.eu/rest/v2/all',
}).then(function(response) {
$scope.countryInfoFormatter(response.data);
});

$scope.countryInfoFormatter = function(countryInfo) {

for (let i = 0; i < countryInfo.length; i++) {
$scope.countries.push({
'name': countryInfo[i].name,
'capital':countryInfo[i].capital,
'flag': countryInfo[i].flag,
});
}

}

});