var countries = angular.module('country', ['ngRoute']);

countries.config(function($routeProvider) {
    $routeProvider
    .when('/countryApi', {
        templateUrl: './countryApi.html',
        controller: 'countryApiController'
    })
    .when('/countryDetails', {
        templateUrl: './countryDetails.html',
        controller: 'countryDetailsController'
    })
    .otherwise({
        redirectTo: '/countryApi'
    })
});

countries.controller('countryApiController', ['$scope', function($scope) {

    console.log('inside countryApiController');

}]);

countries.controller('countryDetailsController', ['$scope', '$http', function($scope, $http) {

    console.log('inside countryDetailsController');

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

}]);