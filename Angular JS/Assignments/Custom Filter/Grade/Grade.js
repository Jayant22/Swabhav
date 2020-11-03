var filterApp = angular.module('customFilterApp', []);

filterApp.filter('cgpaToGrade', function() {
    var grade = function(input) {
        if(input == 9) {
            return 'A';
        } else if(input == 8) {
            return 'B';
        } else if(input == 7) {
            return 'C';
        } else{
            return 'D';
        }
    }
    return grade;
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