var StudentsApp = angular.module('studentApiApp',['ngRoute']);

StudentsApp.config(function($routeProvider){
    $routeProvider
        .when('/studentsApi',{
            templateUrl: './StudentApi.html',
            controller:'studentsApiController'
        })
        .when('/studentForm', {
			templateUrl: './StudentForm.html',
			controller: 'addNewStudentController'
        })
        .when('/studentupdate', {
            templateUrl: './StudentUpdate.html',
            controller: 'updateStudentController'
        })
		.otherwise({
			redirectTo: '/studentsApi'
	    });
});

StudentsApp.value('url', 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/');

StudentsApp.factory('addNewStudentInfo', ['$location', '$http', 'url', function($location, $http, url) {

    var newStudentInfo = {};

    newStudentInfo.studentDetails = function(rollno, name, age, email, date, gender) {
        
        $http({
            method: 'post',
            url: url,
            data: {
                rollNo: rollno,
                name: name,
                age: age,
                email: email,
                date: date,
                gender: gender
            }
        }).then(function() {
            alert("Student Details added successfully");
            $location.path('/studentsApi');
        });
    }
    return newStudentInfo;
}]);

StudentsApp.factory('deleteStudentInfo', ['$location', '$http', 'url', function($location, $http, url) {

    var deleteInfo = {};

    deleteInfo.deleteDetails = function(studentId) {
        console.log('deleting');
        $http({
            method:'delete',
            url: url + studentId,
        }).then(function() {
            alert("Student data successfully deleted");
            $location.path('/');
        });
    }

    return deleteInfo;

}]);

StudentsApp.factory('updateStudentInfo', ['$location', '$http', 'url', function($location, $http, url) {

    var updateInfo = {};

    updateInfo.updateDetails = function(updatedStudentInfo, studentId) {

        $http({
            method: 'put',
            url: url + studentId,
            data: updatedStudentInfo,
        }).then(function() {
            alert('Data successfully updated');
            $location.path('/studentsApi');
        });
    }

    return updateInfo;
}]);

StudentsApp.controller('studentsApiController', ['$scope', '$rootScope', '$location', '$http', 'url', 'deleteStudentInfo',
    function($scope, $rootScope, $location, $http, url, deleteStudentInfo) {

    //get student details
    $scope.students = [];

    $http({
        method: 'get',
        url: url,
    })
    .then(function(response) {  
        console.log(response.data);

        for (var i = 0; i < response.data.length; i++) {
    
            $scope.students.push({
                'id': response.data[i].id,
                'rollNo': response.data[i].rollNo,
                'name': response.data[i].name,
                'age': response.data[i].age,
                'email': response.data[i].email,
                'date': response.data[i].date,
                'isMale': (response.data[i].isMale?"Male":"Female"),
            });
        }
    });

    //delete student info
    $scope.deleteStudents = function(studentId) {

        console.log(studentId);
    
        if(confirm("Are you sure you want to delete data")) {
    
            deleteStudentInfo.deleteDetails(studentId);
        }
    }

    // //update student info
    $scope.updateStudentsInfo = function(studentId) {

        if(confirm("Are you sure you want to update student details")) {
            $http({
                method: 'get',
                url: url + studentId,
            }).then(function(response) {
                $location.path('/updateForm');
                $rootScope.studentId = response.data[0].id;
                $rootScope.namePlaceholder = response.data[0].name;
                $rootScope.rollNoPlaceholder = response.data[0].rollNo;
                $rootScope.agePlaceholder = response.data[0].age;
                $rootScope.emailPlaceholder = response.data[0].email;
                $rootScope.datePlaceholder = response.data[0].date;
                $rootScope.gender = (response.data[0].isMale? "Male": "Female");
            });
        }
    }
}]);

studentsApp.controller('addNewStudentController', ['$scope', 'addNewStudentInfo', function($scope, addNewStudentInfo) {
    $scope.addStudent = function() {
        $scope.gender = (($scope.gender == 'Male' ? true : false));
        $scope.newStudentDetails = addNewStudentInfo.studentDetails(
            $scope.rollNo, $scope.name, $scope.age, $scope.email, $scope.date, $scope.gender
        );
    }
}]);

studentsApp.controller('updateStudentController', ['$scope', '$rootScope', 'updateStudentInfo', 
    function($scope, $rootScope, updateStudentInfo) {
        $scope.updateStudent = function() {
            var students = {
                'name': ($scope.name == undefined ? $rootScope.namePlaceholder : $scope.name),
                'rollNo': ($scope.rollNo == undefined ? $rootScope.rollNoPlaceholder : $scope.rollNo),
                'age': ($scope.age == undefined ? $rootScope.agePlaceholder : $scope.age),
                'email': ($scope.email == undefined ? $rootScope.emailPlaceholder : $scope.email),
                'date': ($scope.date == undefined ? $rootScope.datePlaceholder : $scope.date),
                'isMale': ($scope.gender === "Male" ? true : false),
            };
            updateStudentInfo.updateDetails(students, $rootScope.studentId);
        }
    }
]);