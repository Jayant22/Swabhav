var filterApp = angular.module('customFilterApp', []);

filterApp.filter('nameToUppercase', function() {
    return function(name) { 
        return angular.uppercase(name) ;
    };
});

filterApp.controller('customFilterController', function($scope) {

    $scope.students = [
        {
            'rollNo': 01,
            'name': 'sam',
            'cgpa': 9,
        },
        {
            'rollNo': 02,
            'name': 'tom',
            'cgpa': 8,
        },        
        {
            'rollNo': 03,
            'name': 'john',
            'cgpa': 7,
        },
        {
            'rollNo': 04,
            'name': 'jay',
            'cgpa': 6,
        },
    ];

});