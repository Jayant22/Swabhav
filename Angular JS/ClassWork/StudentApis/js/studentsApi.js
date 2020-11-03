var studentsApp = angular.module('studentsApi', ['ngRoute']);

studentsApp.config(function($routeProvider) {
	$routeProvider
		.when('/studentsApi', {
			templateUrl: './studentsApi.html',
			controller: 'studentsController'
		})
		.when('/studentForm', {
			templateUrl: './studentForm.html',
			controller: 'studentsController'
        })
        .when('/updateForm', {
            templateUrl: './updateForm.html',
            controller: 'studentsController'
        })
		.otherwise({
			redirectTo: '/studentsApi'
	    });
});


studentsApp.controller('studentsController', function($scope, $rootScope, $http, $timeout, $location) {

    $scope.students = [];

    $http({
        method: 'get',
        url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/',
    }).then(function(response) {
        $scope.studentDetails(response.data);
    });

    //add students into array
    $scope.studentDetails = function(data) {

        for(var i = 0; i < data.length; i++) {
            $scope.students.push({
                'id': data[i].id,
                'rollno': data[i].rollNo,
                'name': data[i].name,
                'age': data[i].age,
                'email': data[i].email,
                'date': data[i].date,
                'gender': (data[i].isMale?"Male":"Female"),

            });
        }
    }

    //add student
    $scope.addStudent = function() {

        $scope.gender = (($scope.gender == 'Male' ? true : false));

        $http({
            method: 'post',
            url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/',
            data: {
                rollNo: $scope.rollNo,
                name: $scope.name,
                age: $scope.age,
                email: $scope.email,
                date: $scope.date,
                gender: $scope.gender
            }
        });

        $timeout( function(){
            // reloadRoute();
            alert("Student Details added successfully");
            $location.path('/studentsApi');
        },500);

    }

    $scope.updateStudent = function() {

        var students = {
            'name': ($scope.name == undefined ? $rootScope.namePlaceholder : $scope.name),
            'rollNo': ($scope.rollNo == undefined ? $rootScope.rollNoPlaceholder : $scope.rollNo),
            'age': ($scope.age == undefined ? $rootScope.agePlaceholder : $scope.age),
            'email': ($scope.email == undefined ? $rootScope.emailPlaceholder : $scope.email),
            'date': ($scope.date == undefined ? $rootScope.datePlaceholder : $scope.date),
            'isMale': ($scope.gender === "Male" ? true : false),
        };

        $http({
            method: 'put',
            url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + $rootScope.studentId,
            data: students,
        }).then(function(response) {
            alert('Data successfully updated');
            $location.path('/studentsApi');
        });

    }

    $scope.updateStudentFormFields = function(response) {

        console.log(response.data[0]);
        $rootScope.studentId = response.data[0].id;
        $rootScope.namePlaceholder = response.data[0].name;
        $rootScope.rollNoPlaceholder = response.data[0].rollNo;
        $rootScope.agePlaceholder = response.data[0].age;
        $rootScope.emailPlaceholder = response.data[0].email;
        $rootScope.datePlaceholder = response.data[0].date;
        $rootScope.gender = (response.data[0].isMale?"Male":"Female");

    }

    //update student info
    $scope.updateStudentInfo = function(studentId) {

        if(confirm("Are you sure you want to update student details")) {
            $http({
                method: 'get',
                url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
            }).then(function(response) {
                $location.path('/updateForm');

                $scope.updateStudentFormFields(response);
            });
        }

    }

    //delete student info
    $scope.deleteStudents = function(studentId) {

        console.log(studentId);

        if(confirm("Are you sure you want to delete data")) {

            $http({
                method:'delete',
                url: 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/' + studentId,
            });

            alert("Student data successfully deleted");

        }

        $timeout( function(){
            $location.path('/');
        },500);

    }

});